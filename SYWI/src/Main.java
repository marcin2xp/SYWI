import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;

public class Main {
	//Dane wykorzystane w programie posiadaja wszystkie wartosci jako flexible oraz jedna wartosc typu decision.
	private static String[][] valuesEatable; //(X alfa) valuesEatable[i][0] is the favorable decision value d2
	private static String[][] valuesPoison; //(X beta)
	
	private static String[][] reductTable; //Tabela po wykonaniu znajdowaniu reduktow
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		valuesEatable = new String[62][23]; 
		valuesPoison = new String[62][23];
		reductTable = new String [61][61];
		try {
			readFile("documents/mushrooms eatable.txt", valuesEatable);
			readFile("documents/mushrooms poisoning.txt", valuesPoison);
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//printTable(valuesEatable);
		//printTable(valuesPoison);
		findReduct(valuesEatable, valuesPoison);
		printTable(reductTable);
		//System.out.println(reductTable[59][59]);

	}
	
	public static void readFile(String filePath, String[][] values) throws IOException {
		  FileReader fileReader = new FileReader(filePath);
		  BufferedReader bufferedReader = new BufferedReader(fileReader);		  
		  String textLine = bufferedReader.readLine();
		  int i = 0;
		  do {	    
		    //przypisanie wartosci do tablicy
			String[] parts = textLine.split(",");
			for (int k = 0; k< parts.length; k++){
				values[i][k] = parts[k];	    
			}		  
		    textLine = bufferedReader.readLine();
		    i++;		    
		  } while(textLine != null);
		  bufferedReader.close();
		}
	
	public static void printTable(String[][] values){
		for(int i=0; i< values.length; i++){
		    for(int j=0; j< values[i].length; j++){
		    	System.out.println("\n------------------kolumna "+ j + " wiersz "+ i);
		    	System.out.print(values[i][j]);	
		    	
		    }
		
		}
	}	
	//Znajdowanie alfa reduct
	public static void findReduct(String[][] valuesFavorble, String[][] valuesNegative){
		//iteruj bo ubu tablicach (oprucz pierwszej kolumny bo jest to decycja) i porownuj wartosci
		StringBuffer temp = new StringBuffer();
			for (int k=0; k<reductTable.length ; k++){
				for(int i=1; i<valuesFavorble.length; i++){					
					reductTable[k][i-1] = temp.toString();
					temp.delete(0,5000) ;
				    for(int j=0; j<valuesFavorble[i].length; j++){				    	
				    	if (valuesFavorble[i][j].equals(valuesNegative[i][j])){
				    		temp.append((valuesFavorble[i][j]));				    						    		
				    	}
				    	else{
				    		temp.append(" ");				    		
				    	}				    
				    }				    
				}		
			}
	}
}








