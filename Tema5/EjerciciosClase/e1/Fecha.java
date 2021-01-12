package e1;

public class Fecha {

	int dia, mes, anio;
	
	Fecha (int dia, int mes, int anio)
	{
		this.dia=dia;
		this.mes=mes;
		this.anio=anio;
	}
	
	void ver ()
	{
		System.out.println(dia + mes + anio);
	}
}
