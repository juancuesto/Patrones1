package FabricaAbstracta;

public class FabricaProducto  {
	

	
		public static IFabricaAbstracta getFactory(String a) {
			
			if(a.equalsIgnoreCase("telefono")) {
				return new FabricaTelefono();
				
			}else if(a.equalsIgnoreCase("direccion")) {
				return new FabricaDirecciones();
			}else {
				return null;
			}
			
		}

}
