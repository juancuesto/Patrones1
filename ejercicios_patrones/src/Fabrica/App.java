package Fabrica;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FabricaAgenda cont1= new FabricaAgenda();
		
		IAgenda c1=cont1.getContacto("España");
		c1.añadirContacto();
		
		IAgenda c2=cont1.getContacto("belgica");
		c2.añadirContacto();
		
		IAgenda c3=cont1.getContacto("Grecia");
		c3.añadirContacto();

	}

}
