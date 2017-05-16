

import java.util.Scanner;

public class CommandPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Type in the command: ");
		/*
		 * The command has to be in the format "extract file.extension", where extension 
		 * should be either csv/tsv/db
		 */
		Scanner sc = new Scanner(System.in);
		String command = sc.nextLine();
		try {
			String fileName = command.split(" ")[1];
			System.out.println(fileName);
			String extension = fileName.split("\\.")[1];
			extractingTool tool = new extractingTool();
			Extractions extractionObj = null;
			if (extension.equalsIgnoreCase("db"))
				
				extractionObj = new databaseExtractions(fileName);

			else if (extension.equalsIgnoreCase("csv"))
				
				extractionObj = new csvExtractions(fileName);

			else if (extension.equalsIgnoreCase("tsv"))

				extractionObj = new tsvExtractions(fileName);
				
			else
				System.out.println("No such file format available");
			if (extractionObj != null) {
				tool.setExtraction(extractionObj);
				tool.startExtraction();
			} 
		} catch (Exception e) {
			System.out.println("Incorrect command format. Refer the format above");
		}
	}

}