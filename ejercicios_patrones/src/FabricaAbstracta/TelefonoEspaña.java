package FabricaAbstracta;

public class TelefonoEspaña implements ITelefonos {
	private String telefono;
	
	public TelefonoEspaña() {
		this.telefono="936660002";
		
	}
	

	@Override
	public void DameTelefono() {
		// TODO Auto-generated method stub
		System.out.println("+34 "+telefono);
	}

}
