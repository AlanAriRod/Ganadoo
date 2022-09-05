package Granja;

public class Cabra extends Ganado{

	private int lecheMensual;
	
	public Cabra(String cR, String fechaAd, byte edad, String raza, int litrosMensuales) {
		super(cR, fechaAd, edad, raza);
		this.lecheMensual = litrosMensuales;
		
	}

	public int getLecheMensual() {
		return lecheMensual;
	}

	public void setLecheMensual(int lecheMensual) {
		this.lecheMensual = lecheMensual;
	}
	
	
	

}
