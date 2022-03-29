package entidad;

public class Trabajador extends Empleado{
	
	private Integer valoracion;
	

	public Integer getValoracion() {
		return valoracion;
	}

	public void setValoracion(Integer valoracion) {
		this.valoracion = valoracion;
	}



	public Trabajador(String nombre, Integer sueldoBase, Integer valoracion) {
		super(nombre, sueldoBase);
		this.valoracion = valoracion;
	}

	//calculamos su sueldo en funcion de su valoracion
	@Override
	public Integer calculaSueldoFinal() {
		Integer sueldoFinal = this.getSueldoBase();
		if(this.valoracion<=4 || this.valoracion>=0) {
			sueldoFinal = sueldoFinal + 0;
		}
		if(this.valoracion == 5 || this.valoracion == 6) {
			sueldoFinal= sueldoFinal + 50;
		}
		if(this.valoracion == 7 || this.valoracion == 8) {
			sueldoFinal = sueldoFinal + 100;
		}
		if(this.valoracion == 9 || this.valoracion == 10) {
			sueldoFinal = sueldoFinal + 200;
		}
		return sueldoFinal;
	}

	
}
