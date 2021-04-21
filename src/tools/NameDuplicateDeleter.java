package tools;

//import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;



public class NameDuplicateDeleter {

	public static void main(String[] args) throws IOException {

		ArrayList<String> inputNames = new ArrayList<String>();

		FileReader getNames = new FileReader("src/reference/firstnames_test.txt");

		Scanner scanNames = new Scanner(getNames);

		// runs through the info scanned from the file
		while (scanNames.hasNext()) {
			String thisName = scanNames.next();
			inputNames.add(thisName);
		}

		scanNames.close();

		int arrayLen = inputNames.size();
		int counter = 0;

		while (counter < arrayLen - 1) {
			String nameA = inputNames.get(counter++);
			String nameB = inputNames.get(counter--);
			if (nameA.equals(nameB)) {
				inputNames.set(counter++, " ");
			}
			counter++;
		}

		long start  = System.nanoTime();
		counter = 0;
		boolean allDone = false;
		int allDoneCount = 0;
		while (!allDone) {
			for (String value : inputNames) {
				if (value.equals(" ")) {
					inputNames.remove(counter);
					counter = 0;
					break;
				}
				counter++;
			}
			if(counter == inputNames.size()) {
				allDoneCount++;
			} 
		}
		long delta = System.nanoTime() - start;
//834300
		for (String value : inputNames) {
			System.out.println(value);
		}
		
		System.out.println("TIME:" + delta);
		
		FileWriter toFile = new FileWriter("src//reference//newnames.txt");
		
		for(String value: inputNames) {
			toFile.write(value + "\n");
			
		}
		toFile.close();
	}

}
