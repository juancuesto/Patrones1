package FabricaAbstracta;

public class DireccionBelgica implements IDireccion{
	
	private String direccion;
	
	public DireccionBelgica() {
		
		this.direccion="c/ mayor 5";
	}
	

	@Override
	public void DameDireccion() {
		// TODO Auto-generated method stub
		System.out.println(direccion+" Pais Belgica");
	}

}
