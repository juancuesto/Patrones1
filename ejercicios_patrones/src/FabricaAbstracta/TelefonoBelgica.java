package FabricaAbstracta;

public class TelefonoBelgica implements ITelefonos {
	
	private String telefono;
	
	
	public TelefonoBelgica() {
		this.telefono="936660002";
		
	}
	

	@Override
	public void DameTelefono() {
		// TODO Auto-generated method stub
		System.out.println("+32 "+telefono);
	}

}
