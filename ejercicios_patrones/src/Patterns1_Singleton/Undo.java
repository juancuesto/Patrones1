package Patterns1_Singleton;

import java.util.ArrayList;

public class Undo implements Iundo {
	
	private static Undo comandes;
	private static ArrayList<String> com;

		private Undo() {
			com=new ArrayList<String>();
		}
		public static Undo getInstancia() {
			if(comandes==null) {
				comandes=  new Undo();
			}
			return comandes;
		}
		@Override
		public void copiar(String comanda) {
			com.add(comanda);
			
			
		}
		@Override
		public void eliminar() {
			if(com.size()>0) {
				com.remove(com.size()-1);	
			}
		}
		@Override
		public void llistar() {
			if(com.size()>0) {
				for(String elemento: com) {
					System.out.println(elemento);
				}
			}
			
		}
		
		
	}


