package e1;

public class Alumno extends Fecha{

	String nombre;
	Fecha fechaNacimiento;
	
	Alumno (Fecha fechaNacimiento, String nombre)
	{
		this.fechaNacimiento=fechaNacimiento;
		this.nombre=nombre;
	}
	
	Alumno (int dia, int mes, int anio, String nombre)
	{
		Fecha fechaNacimiento=new Fecha(dia, mes, anio);
		this.nombre=nombre;
	}
	
	void ver()
	{
		System.out.println(fechaNacimiento + "\t" + nombre);
	}
	
	boolean esJoven()
	{
		if (fechaNacimiento.anio>=2000)
			return true;
		return false;
	}
}
