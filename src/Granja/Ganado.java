package Granja;

public class Ganado {

	private String cR;
	private String fechaAd;
	private byte edad;
	private String raza;
	
	public Ganado() {}

	public Ganado(String cR, String fechaAd, byte edad, String raza) {
		super();
		this.cR = cR;
		this.fechaAd = fechaAd;
		this.edad = edad;
		this.raza = raza;
	
	}

	public String getcR() {
		return cR;
	}

	public void setcR(String cR) {
		this.cR = cR;
	}

	public String getFechaAd() {
		return fechaAd;
	}

	public void setFechaAd(String fechaAd) {
		this.fechaAd = fechaAd;
	}

	public byte getEdad() {
		return edad;
	}

	public void setEdad(byte edad) {
		this.edad = edad;
	}

	public String getRaza() {
		return raza;
	}

	public void setRaza(String raza) {
		this.raza = raza;
	}
	
	
	
	
	
}
