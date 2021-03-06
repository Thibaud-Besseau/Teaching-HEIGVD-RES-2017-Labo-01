package ch.heigvd.res.lab01.impl.filters;

import java.io.FilterWriter;
import java.io.IOException;
import java.io.Writer;

/**
 * @author Olivier Liechti
 * @modify by Thibaud Besseau
 */
public class UpperCaseFilterWriter extends FilterWriter
{

	public UpperCaseFilterWriter(Writer wrappedWriter)
	{
		super(wrappedWriter);
	}

	@Override
	public void write(String str, int off, int len) throws IOException
	{
		write(str.toCharArray(), off, len);
	}

	@Override
	public void write(char[] cbuf, int off, int len) throws IOException
	{
		for (int i = off; i < (off + len); i++)
		{
			write((int) cbuf[i]);
		}
	}

	@Override
	public void write(int c) throws IOException
	{
		super.write(Character.toUpperCase(c));
	}

}
