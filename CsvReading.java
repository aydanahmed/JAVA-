package csv;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class CsvReading {

	private static void readFileWithScanner() {
		File file = new File("path/to/your/file/file.txt");
		
		try (Scanner scan = new Scanner(file)) {	
			while (scan.hasNextLine()) {
				String line = scan.nextLine();
				String[] lineArray = line.split(",");
			}
			// do something with lineArray, such as instantiate an object
		} catch (FileNotFoundException e) {
			e.printStackTrace();

		}
	}
}
