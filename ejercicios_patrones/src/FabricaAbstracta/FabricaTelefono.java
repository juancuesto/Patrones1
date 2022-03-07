package FabricaAbstracta;

public class FabricaTelefono implements IFabricaAbstracta {
	
	public ITelefonos GetTelefono(String pais) {
		if(pais.equalsIgnoreCase("belgica")) {
			return new TelefonoBelgica();
		}else if(pais.equalsIgnoreCase("españa")) {
			return new TelefonoEspaña();
		}else if(pais.equalsIgnoreCase("grecia")) {
			return new TelefonoGrecia();
		}else {
			System.out.println("Pais no registrado");
			return null;
			
		}
		
	}

	@Override
	public IDireccion GetDireccion(String motor) {
		// TODO Auto-generated method stub
		return null;
	}

}
