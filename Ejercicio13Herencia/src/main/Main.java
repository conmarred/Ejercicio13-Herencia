package main;

import java.util.ArrayList;
import java.util.List;

import entidad.Directivo;
import entidad.Empleado;
import entidad.Jefe;
import entidad.Trabajador;

public class Main {

	public static void main(String[] args) {
		List<Empleado> listaEmpleados = new ArrayList<>();
		
		Trabajador t1 = new Trabajador("Conce", 1200, 7);
		Trabajador t2 = new Trabajador("Carol", 1400, 6);
		Trabajador t3 = new Trabajador("Diego", 800, 4);
		
		
		List<Integer> incentivos1 = new ArrayList<Integer>();
		incentivos1.add(40);
		incentivos1.add(85);
		Jefe j1 = new Jefe("Jorge", 2000, incentivos1);
		
		List<Integer> incentivos2 = new ArrayList<Integer>();
		incentivos2.add(25);
		incentivos2.add(85);
		incentivos2.add(130);
		Jefe j2 = new Jefe("Gema", 2300, incentivos2);
		
		listaEmpleados.add(t1);
		listaEmpleados.add(t2);
		listaEmpleados.add(t3);
		listaEmpleados.add(j1);
		listaEmpleados.add(j2);
		
		Directivo d1 = new Directivo("Natalia", 2500, listaEmpleados);
		
		listaEmpleados.add(d1);
		
		//imprimimos los resultados
		for(int i = 0; i<listaEmpleados.size(); i++) {
			System.out.println("El sueldo del empleado " +listaEmpleados.get(i).getNombre() + " es: " 
					+ listaEmpleados.get(i).calculaSueldoFinal());
		}
	}

}
