package Fabrica;

import java.util.ArrayList;

public class AgendaEspa�a implements IAgenda {
	private String telefono;
	private String direccion;
	private String pais;
	private ArrayList<AgendaEspa�a> ag=new ArrayList<AgendaEspa�a>();
	
	public AgendaEspa�a(String t,String d) {
		this.telefono=t;
		this.direccion=d;
		this.pais="Espa�a";
	}
	public void a�adirContacto() {
		
		System.out.println("+34"+telefono); 
		System.out.println(direccion);
		System.out.println(pais);
		System.out.println("----------------------");
		
	}

}
