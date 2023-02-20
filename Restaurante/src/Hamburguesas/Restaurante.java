package Hamburguesas;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;


public class Restaurante {

	public static ArrayList<Producto>CargarMenu(File nombreArchivo) throws FileNotFoundException, IOException{
		ArrayList<Producto> Productos = new ArrayList<>();
		BufferedReader br = new BufferedReader(new FileReader(nombreArchivo));
		String linea = br.readLine(); 
		while(linea!= null) {
			String[] partes = linea.split(";");
			Productos.add(new ProductoMenu(partes[0],Integer.parseInt(partes[1])));
			linea = br.readLine();
		}
		br.close();
		return Productos;
	}

	public static ArrayList<ingrediente>CargarIngredientes(File nombreArchivo) throws FileNotFoundException, IOException{
		ArrayList<ingrediente> Productos = new ArrayList<>();
		BufferedReader br = new BufferedReader(new FileReader(nombreArchivo));
		String linea = br.readLine(); 
		while(linea!= null) {
			String[] partes = linea.split(";");
			Productos.add(new ingrediente(partes[0],Integer.parseInt(partes[1])));
			linea = br.readLine();
		}
		br.close();
		return Productos;
	}
	
	public static ArrayList<combos>CargarCombos(File nombreArchivo) throws FileNotFoundException, IOException{
		ArrayList<combos> Productos = new ArrayList<>();
		BufferedReader br = new BufferedReader(new FileReader(nombreArchivo));
		String linea = br.readLine(); 
		while(linea!= null) {
			String[] partes = linea.split(";");
			Productos.add(new combos(partes[0], Double.parseDouble(partes[1].replace("%",""))));
			linea = br.readLine();
		}
		br.close();
		return Productos;
	}


	}
			
		

