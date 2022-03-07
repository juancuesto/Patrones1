package Command;

public class Frenar implements IOperacion {

private Vehiculo vehiculo;
	
	public Frenar(Vehiculo v) {
		this.vehiculo=v;
	}
	
	public void Frenar() {
		System.out.println("el vehivulo "+ vehiculo+" esta frenando");
	}
	@Override
	public void ejecutar() {
		// TODO Auto-generated method stub
		this.vehiculo.frenar();
	}
}
