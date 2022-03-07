package FabricaAbstracta;

public class DireccionEspaña implements IDireccion{
	
	private String direccion;
	
public DireccionEspaña() {
		
		this.direccion="c/ mayor 5";
	}

	@Override
	public void DameDireccion() {
		// TODO Auto-generated method stub
		System.out.println(direccion +" Pais España");
	}

}
