package FabricaAbstracta;

public class DireccionEspa�a implements IDireccion{
	
	private String direccion;
	
public DireccionEspa�a() {
		
		this.direccion="c/ mayor 5";
	}

	@Override
	public void DameDireccion() {
		// TODO Auto-generated method stub
		System.out.println(direccion +" Pais Espa�a");
	}

}
