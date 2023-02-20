package presentacion;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.io.File;
import Hamburguesas.Producto;
import Hamburguesas.Restaurante;
import Hamburguesas.combos;
import Hamburguesas.ingrediente;

public class Aplicacion {
	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		try {
			ArrayList<Producto> menu = Restaurante.CargarMenu(new File("data/menu.txt"));
			ArrayList<ingrediente> ingrediente = Restaurante.CargarIngredientes(new File("data/ingredientes.txt"));
			ArrayList<combos> combos = Restaurante.CargarCombos(new File("data/combos.txt"));
			int op = 0;
			while (op != 9) {
			MostrarOpciones();
			op = Integer.parseInt(br.readLine());	
			if (op == 1) {
				System.out.println("\nMenu Disponible\n");
				MostrarMenu(menu);
				System.out.println("\n\nIngredientes disponibles\n");
				MostrarIngredientes(ingrediente);
				System.out.println("\n\nCombos disponibles\n");
				MostrarCombos(combos);
				
			
			}
			}
		} catch (NumberFormatException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public static void MostrarMenu(ArrayList<Producto> lista){
		for(Producto elemento: lista) {
			System.out.println(String.format("%s: %d", elemento.getName(),elemento.getPrecio()));
		}
	}
	public static void MostrarIngredientes(ArrayList<ingrediente> lista) {
		for(ingrediente elemento: lista) {
			System.out.println(String.format("%s: %d", elemento.getName(),elemento.getPrecio()));
		}
	}
	public static void MostrarCombos(ArrayList<combos> lista) {
		for(combos elemento: lista) {
			System.out.println(String.format("%s: %f", elemento.getName(),elemento.getDescuento()));
		}
	}
	public static void MostrarOpciones() {
		System.out.println("\nBienvenido al restaurante :)\n");
		System.out.println("Digite la opcion a realizar\n1)Mostrar menu\n2)Iniciar un pedido\n3)Cerrar y guardar pedido");
	}
}