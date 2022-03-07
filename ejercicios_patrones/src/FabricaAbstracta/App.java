package FabricaAbstracta;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		IFabricaAbstracta telf1= FabricaProducto.getFactory("telefono");
		ITelefonos telBel=telf1.GetTelefono("Belgica");
		ITelefonos telEsp=telf1.GetTelefono("España");
		ITelefonos telGre=telf1.GetTelefono("Grecia");
		
		telBel.DameTelefono();
		telEsp.DameTelefono();
		telGre.DameTelefono();
		
		IFabricaAbstracta direc1= FabricaProducto.getFactory("direccion");
		IDireccion dirBel=direc1.GetDireccion("Belgica");
		IDireccion dirEsp=direc1.GetDireccion("España");
		IDireccion dirGre=direc1.GetDireccion("Grecia");
		
		dirBel.DameDireccion();
		dirEsp.DameDireccion();
		dirGre.DameDireccion();
	}

}
