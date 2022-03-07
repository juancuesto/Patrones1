package FabricaAbstracta;

public class DireccionGrecia implements IDireccion {
private String direccion;
	
	public DireccionGrecia() {
		
		this.direccion="c/ mayor 5";
	}

	@Override
	public void DameDireccion() {
		// TODO Auto-generated method stub
		System.out.println(direccion +" pais Grecia");
	}

}
