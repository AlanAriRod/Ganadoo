package Granja;

public class Vaca extends Ganado{
	
	private int lecheSem;// lecheA�o;
	
	public Vaca() {}
	
	public Vaca(String cR, String fechaAd, byte edad, String raza, int litrosSemanal) { //, int litrosAnual
		super(cR, fechaAd, edad, raza);
		//this.lecheA�o = litrosAnual;
		this.lecheSem = litrosSemanal;
	}

	public int getLecheSem() {
		return lecheSem;
	}

	public void setLecheSem(int lecheSem) {
		this.lecheSem = lecheSem;
	}

	/*public int getLecheA�o() {
		return lecheA�o;
	}

	public void setLecheA�o(int lecheA�o) {
		this.lecheA�o = lecheA�o;
	}*/
	

}
