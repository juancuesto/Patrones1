package InyeccionDependencias;

public interface IArticulo  extends CRUD<Articulo>{

	String dameDescripcion();
	double damePvp();
}
