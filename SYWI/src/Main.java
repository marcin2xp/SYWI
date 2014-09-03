import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Main {
	//Dane wykorzystane w programie posiadaja wszystkie wartosci jako flexible oraz jedna wartosc typu decision.
	private static String[][] valuesEatable; //(X alfa) valuesEatable[i][0] is the favorable decision value d2
	private static String[][] valuesPoison; //(X beta)
	
	private static String[][] reductTable; //Tabela po wykonaniu znajdowaniu reduktow
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		valuesEatable = new String[538][23]; 
		valuesPoison = new String[62][23]; 
		try {
			readFile("documents/mushrooms eatable.txt", valuesEatable);
			readFile("documents/mushrooms poisoning.txt", valuesPoison);
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		printTable(valuesEatable);
		printTable(valuesPoison);

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
		    	System.out.print(values[i][j]);				
		    }
		System.out.println("\n----------------------- "+ i);
		}
	}
	//Znajdowanie alfa reduct
	public static void findReduct(String[][] valuesFavorble, String[][] valuesNegative){
		
	}

}

