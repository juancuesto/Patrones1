package Command;

import java.util.ArrayList;
import java.util.List;

public class Invoker {
	
	private List<IOperacion> operaciones=new ArrayList<>();
	
	public void recibirOperacion(IOperacion operacion) {
		this.operaciones.add(operacion);
		
	}
	public void realizarOperaciones() {
		for( int i=0;i<operaciones.size();i++) {
			this.operaciones.get(i).ejecutar();
			
		}
		
		this.operaciones.clear();
		
	}

}
