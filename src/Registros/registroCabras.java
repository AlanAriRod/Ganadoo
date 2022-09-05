package Registros;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

import Granja.Cabra;

public class registroCabras {

	private Cabra cabras[];	
	int j;
	
	public registroCabras (int tam) throws FileNotFoundException{
		cabras = new Cabra[tam];
		j = 0;
		creaCabra();
	}
	
	public void creaCabra() throws FileNotFoundException {

		Scanner input;
		
		input = new Scanner(new FileInputStream(
				"C:\\Users\\arias\\Documents\\Documentos Alan\\ITO\\3er Semestre\\Estructura\\1er Parcial\\Lectura\\DatosCabra.txt"));
		input.useDelimiter(";");
		while(input.hasNext()) {
			String codReg = input.next();
			String fechaAd = input.next();
			byte edad = input.nextByte();
			String raza = input.next();
			int litrosMen = input.nextInt();
			cabras[j++]= new Cabra(codReg,fechaAd, edad, raza, litrosMen);
			
		}
		input.close();
	}
	public String canLecheMensual() {
		String cad = "Cantidad Leche Cabras:\n";
    	for(int i = 0 ; i < j; i++)
    		cad += cabras[i].getLecheMensual() + "\n";
    	return cad;
	}
	
	private int getMaxLecheCabra() {
    	int maxLeche=0;
    	for(int i = 0; i < j ;i++)
    		if(cabras[i].getLecheMensual() > maxLeche)
    			maxLeche = cabras[i].getLecheMensual();
    	return maxLeche;
    }
	
	public int regPromedioCabra() {
		int promedio = 0;
    	for(int i = 0 ; i < j; i++)
    		promedio += cabras[i].getLecheMensual();
    	return promedio/j;
	}
	
	public void imprimePromedio() {
		System.out.println(canLecheMensual());
    	System.out.println("Leche Promedio = "+ regPromedioCabra());
    }
	
	public String imprimeMaxLecheCabra() {
		 int maxLeche = getMaxLecheCabra(); String cad = "";
		    cad += ("El Valor Mayor de Leche = " + maxLeche + "\nEl Código De Las Cabras Con Dichas Cantidad Son: \n");
		    
		    	for(int i=0;i < j; i++)
		    		if(cabras[i].getLecheMensual() == maxLeche)
		    			cad +=(cabras[i].getcR());
		    	
		    	return cad;
	}
	
	

}
