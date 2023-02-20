package Hamburguesas;

public class ingrediente {
	private String nombre;
	private int precioAdi;
	
	public ingrediente (String Nombre, int Precio) {
		this.nombre = Nombre;
		this.precioAdi = Precio;
	}
	public String getName() {
		return this.nombre;
	}
	
	public int getPrecio() {
		return this.precioAdi;
	}
	
}
