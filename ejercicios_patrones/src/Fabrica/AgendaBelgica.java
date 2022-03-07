package Fabrica;

import java.util.ArrayList;

public class AgendaBelgica implements IAgenda {
	
	private String telefono;
	private String direccion;
	private String pais;
	private ArrayList<AgendaBelgica> ag=new ArrayList<AgendaBelgica>();
	
	public AgendaBelgica(String t,String d) {
		this.telefono=t;
		this.direccion=d;
		this.pais="Belgica";
	}
	public void añadirContacto() {
		
		System.out.println("+32"+telefono); 
		System.out.println(direccion);
		System.out.println(pais);
		System.out.println("----------------------");
		
	}
	

}
