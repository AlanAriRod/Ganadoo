package Registros;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;
import Granja.Vaca;

public class registroVacas {

		private Vaca vacas[];	
		int j;
		
		public registroVacas (int tam) throws FileNotFoundException{
			vacas = new Vaca[tam];
			j = 0;
			creaVaca();
		}
		
		public void creaVaca() throws FileNotFoundException {
	
			Scanner input;
			
			input = new Scanner(new FileInputStream(
					"C:\\Users\\arias\\Documents\\Documentos Alan\\ITO\\3er Semestre\\Estructura\\1er Parcial\\Lectura\\DatosVaca.txt"));
			input.useDelimiter(";");
			while(input.hasNext()) {
				String codReg = input.next();
				String fechaAd = input.next();
				byte edad = input.nextByte();
				String raza = input.next();
				int litrosSem = input.nextInt();
				vacas[j++]= new Vaca(codReg,fechaAd, edad, raza, litrosSem);
				
			}
			input.close();
		}
		public String canLecheSemana() {
			String cad = "Cantidad De Leche Semanal:\n";
	    	for(int i = 0 ; i < j; i++)
	    		cad += vacas[i].getLecheSem() + "\n";
	    	return cad;
		}
		
		private int getMaxLecheVaca() {
	    	int maxLeche=0;
	    	for(int i = 0; i < j ;i++)
	    		if(vacas[i].getLecheSem() > maxLeche)
	    			maxLeche = vacas[i].getLecheSem();
	    	return maxLeche;
	    }
		
		public int regPromedio() {
			int promedio = 0;
	    	for(int i = 0 ; i < j; i++)
	    		promedio += vacas[i].getLecheSem();
	    	return promedio/j;
		}
		
		public void imprimePromedio() {
			System.out.println(canLecheSemana());
	    	System.out.println("Leche Promedio = "+ regPromedio());
	    }
		
		public String imprimeMaxLecheVaca() {
		    int maxLeche = getMaxLecheVaca(); String cad = "";
		    cad += ("El Valor Mayor de Leche = " + maxLeche + "\nEl Código De Las Vacas Con Dichas Cantidad Son: \n");
		    
		    	for(int i=0;i < j; i++)
		    		if(vacas[i].getLecheSem() == maxLeche)
		    			cad +=(vacas[i].getcR());
		    	
		    	return cad;
		}
		
		//canLecheRaza[0] = vacas[0].getLecheSem() + "";
		
		/*public String promedioRazaVaca() {
			String canLecheRaza = "";
			int promedioRaza, cont;
			//canLecheRaza = new String[j];
			cont = 0;
			
			for(int i=0;i < j; i++) {
				promedioRaza = 0;
				
				for(int k = 1; k < j; k++) {
					System.out.println(vacas[i].getRaza() +" " + vacas[k].getRaza());
					if(k != i)
					if(vacas[i].getRaza().equalsIgnoreCase(vacas[k].getRaza())) {
						promedioRaza+= vacas[i].getLecheSem();
						System.out.println(promedioRaza);
						cont++;
	    			}
					
				}
				
				if(cont > 0) {
	    			canLecheRaza += "El Promedio De Leche De La Raza " + vacas[i].getRaza() + " Fue De " + ((promedioRaza+vacas[i].getLecheSem())/(cont+1)) + "\n"; 
					cont = 0;
				}else
					canLecheRaza += "olaEl Promedio De Leche De La Raza " + vacas[i].getRaza() + " Fue De " + (vacas[i].getLecheSem()) + "\n";
				System.out.println("cont " +cont);	
				//System.out.println(totalRaza);
			}
			
			return canLecheRaza;
		}*/
		

}
