package modelo;

import java.io.*;

public class MyObjectOutputStream extends ObjectOutputStream {

	public MyObjectOutputStream(OutputStream out) throws IOException {
		super(out);
	}

	@Override
	protected void writeStreamHeader() throws IOException {
		// Nada
	}

}
