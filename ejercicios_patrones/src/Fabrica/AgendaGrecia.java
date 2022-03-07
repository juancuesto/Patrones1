package Fabrica;

import java.util.ArrayList;

public class AgendaGrecia implements IAgenda{
	private String telefono;
	private String direccion;
	private String pais;
	private ArrayList<AgendaGrecia> ag=new ArrayList<AgendaGrecia>();
	
	public AgendaGrecia(String t,String d) {
		this.telefono=t;
		this.direccion=d;
		this.pais="Grecia";
	}
	public void añadirContacto() {
		
		System.out.println("+30"+telefono); 
		System.out.println(direccion);
		System.out.println(pais);
		System.out.println("----------------------");
		
		
	}

}
