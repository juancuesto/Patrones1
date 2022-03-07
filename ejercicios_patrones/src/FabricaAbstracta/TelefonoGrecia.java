package FabricaAbstracta;

public class TelefonoGrecia implements ITelefonos{
	private String telefono;
	
	
	public TelefonoGrecia() {
		this.telefono="936660002";
		
	}
	

	@Override
	public void DameTelefono() {
		// TODO Auto-generated method stub
		System.out.println("+30 "+telefono);
	}

}
