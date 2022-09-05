package Granja;

public class Vaca extends Ganado{
	
	private int lecheSem;// lecheAño;
	
	public Vaca() {}
	
	public Vaca(String cR, String fechaAd, byte edad, String raza, int litrosSemanal) { //, int litrosAnual
		super(cR, fechaAd, edad, raza);
		//this.lecheAño = litrosAnual;
		this.lecheSem = litrosSemanal;
	}

	public int getLecheSem() {
		return lecheSem;
	}

	public void setLecheSem(int lecheSem) {
		this.lecheSem = lecheSem;
	}

	/*public int getLecheAño() {
		return lecheAño;
	}

	public void setLecheAño(int lecheAño) {
		this.lecheAño = lecheAño;
	}*/
	

}
