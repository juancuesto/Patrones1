package Command;

public class Arrancar implements IOperacion {
	
	private Vehiculo vehiculo;
	
	public Arrancar(Vehiculo v) {
		this.vehiculo=v;
	}
	
	public void Arranca() {
		//System.out.println("el vehivulo xxxx"+ vehiculo+" esta arrancando");
	}
	@Override
	public void ejecutar() {
		// TODO Auto-generated method stub
		this.vehiculo.arrancar();
		
	}

}


