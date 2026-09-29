package ejercicio_22;

import java.util.List;

public class Empleado {
	private String nombre;
	private double salario;
	private List<Empleado> subordinados; //Lista de empleados a su cargo
	
	public Empleado(String nombre, double salario) {
		this.nombre=nombre;
		this.salario=salario;
	}
	public double getSalario() {
		return this.salario;
	}
	public List<Empleado> getSubordinados(){
		return this.subordinados;
	}
	public static double presupuestoEquipo(Empleado jefe) {
		if(jefe == null) {
			return 0;
		}
		double salarioTotal = jefe.getSalario();
		for(Empleado e: jefe.getSubordinados()) {
			salarioTotal += presupuestoEquipo(e);
		}
		return salarioTotal;
	}
}
