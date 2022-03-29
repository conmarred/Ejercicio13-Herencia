package entidad;

public abstract class Empleado {
	
	//atributos comunes
		protected String nombre;
		protected Integer sueldoBase;
		
		//getters y setters
		public String getNombre() {
			return nombre;
		}
		public void setNombre(String nombre) {
			this.nombre = nombre;
		}
		public Integer getSueldoBase() {
			return sueldoBase;
		}
		public void setSueldoBase(Integer sueldoBase) {
			this.sueldoBase = sueldoBase;
		}
		
		//constructor
		public Empleado(String nombre, Integer sueldoBase) {
			this.nombre = nombre;
			this.sueldoBase = sueldoBase;
		}
		
		//toString
		@Override
		public String toString() {
			return "Trabajador [nombre=" + nombre + ", sueldoBase=" + sueldoBase + "]";
		}
		
		//funcionalidad
		//a todos los empleados se les puede calcular el sueldo final
		//pero a cada uno se le calcula de forma diferente segun el tipo que sea
		
		public abstract Integer calculaSueldoFinal();
		

}
