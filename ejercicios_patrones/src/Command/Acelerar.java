package Command;

public class Acelerar implements IOperacion{
	
	private Vehiculo vehiculo;
	
	public Acelerar(Vehiculo v) {
		this.vehiculo=v;
	}
	
	public void Acelerar() {
		System.out.println("el vehivulo "+ vehiculo+" esta acelerando");
	}
	@Override
	public void ejecutar() {
		// TODO Auto-generated method stub
		this.vehiculo.acelerar();
	}

}
