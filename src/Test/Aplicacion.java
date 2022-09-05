package Test;

import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;

import Registros.registroCabras;
import Registros.registroVacas;

public class Aplicacion {
	
	static void run() throws FileNotFoundException {
		registroVacas vacas = new registroVacas(50);
		registroCabras cabras = new registroCabras(50);
		//vacas.imprimeDatos();
		//vacas.imprimePromedio();
		//vacas.imprimeMaxLecheVaca();
		//System.out.println(vacas.promedioRazaVaca());
		
		try {
			FileWriter fw = new FileWriter("C:\\Users\\arias\\Documents\\Documentos Alan\\ITO\\3er Semestre\\Estructura\\1er Parcial\\Escritura\\EscrituraVaca.txt");
			String escritura = "Vacas:\n\n" +vacas.canLecheSemana() + 
					"\nPromedio De Leche De Vacas: \n" + vacas.regPromedio()+
					"\nCantidad Máxima De Leche De Vacas: \n" + vacas.imprimeMaxLecheVaca();
			fw.write(escritura);
			fw.close();
			
		} catch (IOException e) {
			
			e.printStackTrace();
		}
	
	try {
		FileWriter fw = new FileWriter("C:\\Users\\arias\\Documents\\Documentos Alan\\ITO\\3er Semestre\\Estructura\\1er Parcial\\Escritura\\EscrituraCabra.txt");
		String escritura = "Cabras:\n\n" + cabras.canLecheMensual() + 
				"\nPromedio De Leche De Cabras: \n" + cabras.regPromedioCabra()+
				"\nCantidad Máxima De Leche De Cabras: \n" + cabras.imprimeMaxLecheCabra();
		fw.write(escritura);
		fw.close();
		
	} catch (IOException e) {
		
		e.printStackTrace();
	}
}
	

	public static void main(String[] args) throws FileNotFoundException {
		
	run();

	}

}
