package entidad;

import java.util.List;

public class Jefe extends Empleado{
	
	public List<Integer> incentivos;
	

	public List<Integer> getIncentivos() {
		return incentivos;
	}

	public void setIncentivos(List<Integer> incentivos) {
		this.incentivos = incentivos;
	}


	public Jefe(String nombre, Integer sueldoBase, List<Integer> incentivos) {
		super(nombre, sueldoBase);
		this.incentivos = incentivos;
	}

	//calculamos su sueldo sumandole sus incentivos
	@Override
	public Integer calculaSueldoFinal() {
		Integer sueldoFinal = this.sueldoBase;
		if(incentivos.size()>0) {
			for(int i=0; i<incentivos.size(); i++) {
				sueldoFinal = sueldoFinal+incentivos.get(i);
			}
		}
		return sueldoFinal;
	}

}
