package Fabrica;

import java.util.ArrayList;

public class AgendaEspaña implements IAgenda {
	private String telefono;
	private String direccion;
	private String pais;
	private ArrayList<AgendaEspaña> ag=new ArrayList<AgendaEspaña>();
	
	public AgendaEspaña(String t,String d) {
		this.telefono=t;
		this.direccion=d;
		this.pais="España";
	}
	public void añadirContacto() {
		
		System.out.println("+34"+telefono); 
		System.out.println(direccion);
		System.out.println(pais);
		System.out.println("----------------------");
		
	}

}
