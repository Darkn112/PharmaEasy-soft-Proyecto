package co.edu.unbosque.model.persistence;

import java.io.File;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;


public class FileHandler {
	

	private static File archivo;
	private static final String FOLDER_NAME = "dat";
	// Archivos serializados: escritura
	private static FileOutputStream fos;// lo crea
	private static ObjectOutputStream oos;// lo escribe
	// Archivos serializados: escritura
	private static FileInputStream fis;// lo crea
	private static ObjectInputStream ois;// lo escribe
	
	public static void writeSerialized(String url, Object content) {

		try {
			archivo = new File(FOLDER_NAME + "/" + url);
			if (!archivo.exists()) {
				archivo.createNewFile();
			}
			fos = new FileOutputStream(archivo);
			oos = new ObjectOutputStream(fos);
			oos.writeObject(content);
			fos.close();
			oos.close();
		}
		catch (IOException e) {
			System.out.println("Ocurrio un error con la escritura del archivo serializado");
		}
	}
	public static Object readSerialized(String url) {

		try {
			archivo = new File(FOLDER_NAME + "/" + url);
			if (!archivo.exists()) {
				archivo.createNewFile();
			}
			fis = new FileInputStream(archivo);
			ois = new ObjectInputStream(fis);
			Object content = ois.readObject();
			fis.close();
			ois.close();
			return content;
		} catch (IOException e) {
			System.out.println("Ocurrio un error con la lectura del archivo serializado");

		} catch (ClassNotFoundException e) {
			System.out.println("Error al leer los datos del archivo serializado(Class Not Found)");
		}
		return null;
	}
	
	public static void checkFolder() {

		archivo = new File(FOLDER_NAME);

		if (archivo.exists() && archivo.isDirectory()) {
			return;
		} else {
			archivo.mkdir();
		}
	}	

}
