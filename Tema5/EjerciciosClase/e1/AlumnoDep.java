package e1;

public class AlumnoDep extends Alumno{

	char deporte;
	double marca;
	Fecha fecha;
	Alumno alumno;
	
	AlumnoDep ()
	{
		Alumno alumno=new Alumno(null, null);
	}
	
	AlumnoDep (char deporte, double marca)
	{
		Alumno alumno=new Alumno(null, null);
		this.deporte=deporte;
		this.marca=marca;
	}
	
	void ver ()
	{
		System.out.println(marca + "\t" + deporte);
	}
	
	void incrementaRecord (double record)
	{
		this.marca=record;
	}
	
	boolean esJoven ()
	{
		if (((deporte=='n' || deporte=='N') && fecha.anio>2000) || (fecha.anio>2004 && marca>10))
			return true;
		return false;
					
	}
	
	Alumno alumnoMejorRecord(AlumnoDep alumnoDep)
	{
		if (this.marca>marca)
			return this.alumno;
		return alumno;
	}
}
