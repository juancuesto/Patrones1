package Patterns1_Singleton;

import java.util.ArrayList;

public class Prueba {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Undo c=Undo.getInstancia();
		//Object comanda;
		c.copiar("comanda");
		c.copiar("deshacer");
		c.copiar("copiar");
		c.eliminar();
		c.llistar();
	}

}
