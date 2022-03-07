package InyeccionDependencias;

public class Articulo implements IArticulo {
	
	private String descripcion;
	private double pvp;
	public Articulo(String d,double p) {
		descripcion=d;
		pvp=p;
	}
	@Override
	public String dameDescripcion() {
		// TODO Auto-generated method stub
		return descripcion;
	}
	
	@Override
	public double dameConversion(double c) {
		// TODO Auto-generated method stub
		return 0;
	}
	@Override
	public double damePrecio(double p) {
		// TODO Auto-generated method stub
		return 0;
	}
	@Override
	public double damePvp() {
		// TODO Auto-generated method stub
		return pvp;
	}

}
