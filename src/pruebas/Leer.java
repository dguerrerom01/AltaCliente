package pruebas;

import java.io.*;
import java.util.Iterator;

import modelo.Almacen;
import modelo.Cliente;

public class Leer {

	public static void main(String[] args) {

		Cliente cliente = null;
		Almacen almacen = new Almacen("Cliente.data");
		
		
//		try(ObjectInputStream ois=new ObjectInputStream(new FileInputStream("Cliente.data"))){
//            //Cuando no haya mas objetos saltara la excepcion EOFException
//            while(true){
//                Cliente aux=(Cliente)ois.readObject();
//                System.out.println(aux.getNombre());
//                System.out.println(aux.getDireccion());
//                System.out.println("");
//            }
//        }catch(ClassNotFoundException e){
//        }catch(EOFException e){
//        	System.out.println("Final");
//        }catch(IOException e){
//        }
		
		int i = 0;
			cliente = (Cliente) almacen.recuperar(i);
			while (cliente != null) {
				System.out.println(cliente.getNombre());
				i++;
				cliente = (Cliente) almacen.recuperar(i);
			}
			//if (!cliente.getNombre().isEmpty()) {
				
			//}
			
		
//		for (int i = 0; i < 10; i++) {
//			cliente = (Cliente) almacen.recuperar(i);
//			System.out.println(cliente.getNombre());
//		}
		
		
		
		
//		cliente = (Cliente) almacen.recuperar(0);
//		System.out.println(cliente.getNombre());
//		cliente = (Cliente) almacen.recuperar(1);
//		System.out.println(cliente.getNombre());
//		cliente = (Cliente) almacen.recuperar(2);
//		System.out.println(cliente.getNombre());
//		cliente = (Cliente) almacen.recuperar(3);
//		System.out.println(cliente.getNombre());
//		cliente = (Cliente) almacen.recuperar(4);
//		System.out.println(cliente.getNombre());
		
	}
}
