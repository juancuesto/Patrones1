package FabricaAbstracta;

public class TelefonoEspa�a implements ITelefonos {
	private String telefono;
	
	public TelefonoEspa�a() {
		this.telefono="936660002";
		
	}
	

	@Override
	public void DameTelefono() {
		// TODO Auto-generated method stub
		System.out.println("+34 "+telefono);
	}

}
