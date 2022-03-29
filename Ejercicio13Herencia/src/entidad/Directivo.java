package entidad;

import java.util.List;

public class Directivo extends Empleado{

	
	public List<Empleado> empleados;
	
	
	public List<Empleado> getEmpleados() {
		return empleados;
	}

	public void setEmpleados(List<Empleado> empleados) {
		this.empleados = empleados;
	}


	public Directivo(String nombre, Integer sueldoBase, List<Empleado> empleados) {
		super(nombre, sueldoBase);
		this.empleados = empleados;
	}


	//calculamos su sueldo en funcion del numero de empleados a su cargo multiplicado por 100
	@Override
	public Integer calculaSueldoFinal() {
		Integer sueldoFinal = this.getSueldoBase();
		if(empleados.size()>0) {
			sueldoFinal = sueldoFinal + (empleados.size()*100);
			}
		return sueldoFinal;
	}
	

}
