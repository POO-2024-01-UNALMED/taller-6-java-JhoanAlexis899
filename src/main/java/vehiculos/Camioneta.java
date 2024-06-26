package vehiculos;

public class Camioneta extends Vehiculo {
	private boolean volco;
	private static int cantidadCamionetas;
	public Camioneta(String placa, int puertas,String nombre, 
			int precio, int peso,Fabricante fabricante, boolean volco) {
		super(placa, puertas, 90, nombre, precio, peso, "4X4",fabricante);
		this.volco = volco;
		Camioneta.cantidadCamionetas++;
	}
	
	public boolean isVolco() {
		return this.volco;
	}
	
	public void setVolco(boolean v) {
		this.volco = v;
	}
	
	public static int getCantidadCamionetas() {
		return Camioneta.cantidadCamionetas;
	}
	
	public static void setCantidadCamionetas(int j) {
		Camioneta.cantidadCamionetas = j;
	}
}
