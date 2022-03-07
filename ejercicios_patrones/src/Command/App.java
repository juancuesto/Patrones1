package Command;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Vehiculo v1=new Vehiculo("Coche");
		Vehiculo v2=new Vehiculo("Bicicleta");
		Vehiculo v3=new Vehiculo("Avion");
		Vehiculo v4=new Vehiculo("Barco");
		
		Arrancar arr_v1=new Arrancar(v1);
		Arrancar arr_v2=new Arrancar(v2);
		Arrancar arr_v3=new Arrancar(v3);
		Arrancar arr_v4=new Arrancar(v4);
		
		Acelerar ac_v1=new Acelerar(v1);
		Acelerar ac_v2=new Acelerar(v2);
		Acelerar ac_v3=new Acelerar(v3);
		Acelerar ac_v4=new Acelerar(v4);
		
		Frenar fr_v1=new Frenar(v1);
		Frenar fr_v2=new Frenar(v2);
		Frenar fr_v3=new Frenar(v3);
		Frenar fr_v4=new Frenar(v4);
		
		Invoker ivk=new Invoker();
		
		ivk.recibirOperacion(arr_v1);
		ivk.recibirOperacion(arr_v2);
		ivk.recibirOperacion(arr_v3);
		ivk.recibirOperacion(arr_v4);
		
		
		ivk.recibirOperacion(ac_v1);
		ivk.recibirOperacion(ac_v2);
		ivk.recibirOperacion(ac_v3);
		ivk.recibirOperacion(ac_v4);
		
		
		ivk.recibirOperacion(fr_v1);
		ivk.recibirOperacion(fr_v2);
		ivk.recibirOperacion(fr_v3);
		ivk.recibirOperacion(fr_v4);
		
		
		
		ivk.realizarOperaciones();
		
	}

}
