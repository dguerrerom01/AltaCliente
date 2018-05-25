package modelo;

import java.io.*;

public class Almacen {

	private String path;
	private File file;

	public Almacen(String path) {
		super();
		this.path = path;
		file = new File(path);
	}

	public boolean almacena(Object obj) {
		boolean retorno = false;
		if (!file.exists()) {
			try (ObjectOutputStream adaptadorW = new ObjectOutputStream(new FileOutputStream(file, true))) {
				adaptadorW.writeObject(obj);
			} catch (IOException e) {
				e.printStackTrace();
			}
		} else {
			try (MyObjectOutputStream adaptadorW = new MyObjectOutputStream(new FileOutputStream(file, true))) {
				adaptadorW.writeObject(obj);
			} catch (IOException e) {
				e.printStackTrace();
			} 
		}
		return retorno;
	}

	public Object recuperar(int posicion) {
		Object obj = null;
		try (ObjectInputStream adaptadorR = new ObjectInputStream(new FileInputStream(file))) {
			for (int i = 0; i <= posicion; i++) {
				obj = adaptadorR.readObject();
			}
			// obj = adaptadorR.readObject();
		} catch (EOFException e) {
			// Aqui termina la ejecucion cuando no queden objetos
			// System.out.println("Final");
			obj = null;
		} catch (IOException | ClassNotFoundException e) {
			e.printStackTrace();
		}
		return obj;
	}

}
