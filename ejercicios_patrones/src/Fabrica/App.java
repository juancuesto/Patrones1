package Fabrica;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FabricaAgenda cont1= new FabricaAgenda();
		
		IAgenda c1=cont1.getContacto("Espa�a");
		c1.a�adirContacto();
		
		IAgenda c2=cont1.getContacto("belgica");
		c2.a�adirContacto();
		
		IAgenda c3=cont1.getContacto("Grecia");
		c3.a�adirContacto();

	}

}
