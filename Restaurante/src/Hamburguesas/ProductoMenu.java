package Hamburguesas;

public class ProductoMenu implements Producto {
	private String nombre;
	private int precioBase;
	
	public ProductoMenu(String nombre,int precioBase) {
		this.nombre = nombre;
		this.precioBase = precioBase;
	}
	
	@Override
	public int getPrecio() {
		return this.precioBase;
	}

	@Override
	public String getName() {
		return this.nombre;
	}
	
}
	
