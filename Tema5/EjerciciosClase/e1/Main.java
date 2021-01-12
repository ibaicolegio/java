package e1;

public class Main {

	public static void main(String[] args) {
		
		Fecha f1=new Fecha(20, 2, 2010);
		Fecha f2=new Fecha(2, 7, 2000);
		Fecha f3=new Fecha(16, 1, 1990);

		f1.ver();
		f2.ver();
		f3.ver();
		
		Alumno a1=new Alumno(f1, "Juan");
		Alumno a2=new Alumno(30, 15, 2004, "Ramon");
		Alumno a3=new Alumno(f3, "Carlos");
		
		a1.ver();
		a2.ver();
		a3.ver();
		
		a1.esJoven();
		a2.esJoven();
		a3.esJoven();
		
		
		
		
		
	}

}
