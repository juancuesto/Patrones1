package FabricaAbstracta;

public class FabricaDirecciones implements IFabricaAbstracta {
	
		
		public IDireccion GetDireccion(String pais) {
			if(pais.equalsIgnoreCase("belgica")) {
				return new DireccionBelgica();
			}else if(pais.equalsIgnoreCase("espa�a")) {
				return new DireccionEspa�a();
			}else if(pais.equalsIgnoreCase("grecia")) {
				return new DireccionGrecia();
			}else {
				System.out.println("Pais no registrado");
				return null;
				
			}
	}

		@Override
		public ITelefonos GetTelefono(String pais) {
			// TODO Auto-generated method stub
			return null;
		}

}
