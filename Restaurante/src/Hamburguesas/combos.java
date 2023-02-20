package Hamburguesas;

public class combos implements Producto {
	private String NombreCombo;
	private double Descuento;
	
	public combos(String Nombre, double descuento){
		this.NombreCombo= Nombre;
		this.Descuento = descuento;
		
	}

	public double getDescuento(){
		return this.Descuento;
	}
	
	@Override
	public int getPrecio() {
		return 0;
	}

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return this.NombreCombo;
	}
	
	
}
