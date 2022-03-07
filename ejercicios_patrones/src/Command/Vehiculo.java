package Command;

public class Vehiculo {
	
	private String vehiculo;
	
	public Vehiculo(String v) {
		
		this.vehiculo=v;
	}
	
	public void arrancar() {
		System.out.println("vehiculo "+vehiculo+" arrancando");
	}
	
	public void acelerar() {
		System.out.println("vehiculo "+vehiculo+" acelerando");
	}
	public void frenar() {
		System.out.println("vehiculo "+vehiculo+" frenando");
	}

}
