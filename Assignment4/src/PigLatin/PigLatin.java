package PigLatin;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class PigLatin {
	
	private static String translatedString = "";
	
	private static String translate = " ";

	public static void main(String[] args) {
		
		System.out.println("John Ferguson");
		
		while (translate.toLowerCase() != "q" || translate.length() != 1) {
			try {

				@SuppressWarnings("resource")
				Scanner stringToTranslate = new Scanner(System.in);
				
				System.out.println("Please enter a word (or press Q to quit): ");
				
				translate = stringToTranslate.nextLine();
				
				ArrayList<String>newSentence = new ArrayList<String>(Arrays.asList(translate.split("\\s+")));
				
				translateNewSentence(newSentence);
				
				System.out.println(translatedString);
				
				translatedString = "";
			}

					
			catch(Exception e) {
				
				System.out.println("You did not input anything");
					
			}
				
		
				
			
		}
		System.out.println("Thanks for playing!");
	}	
	
	
	public static String translateNewSentence(ArrayList<String> stringToTranslate) {		
		//System.out.print("what is even going on");

		
		//System.out.println(newSentence);
			
		for (int i = 0; i < stringToTranslate.size(); i++){
				
			if (stringToTranslate.get(i).toLowerCase().charAt(0) != 'a' && stringToTranslate.get(i).toLowerCase().charAt(0) != 'e' && stringToTranslate.get(i).toLowerCase().charAt(0) != 'i' 
						&& stringToTranslate.get(i).toLowerCase().charAt(0) != 'o' && stringToTranslate.get(i).toLowerCase().charAt(0) != 'u' ) {
				
					while(stringToTranslate.get(i).toLowerCase().charAt(0) != 'a' && stringToTranslate.get(i).toLowerCase().charAt(0) != 'e' && stringToTranslate.get(i).toLowerCase().charAt(0) != 'i' 
							&& stringToTranslate.get(i).toLowerCase().charAt(0) != 'o' && stringToTranslate.get(i).toLowerCase().charAt(0) != 'u' ){
						
						char charToMove = stringToTranslate.get(i).toLowerCase().charAt(0);
						
						stringToTranslate.set(i, stringToTranslate.get(i).substring(1));
						
						stringToTranslate.set(i,stringToTranslate.get(i) + charToMove);
						
					}
					
					stringToTranslate.set(i, stringToTranslate.get(i) + "ay ");
					
					translatedString += stringToTranslate.get(i).toString();
					
			}
			else if (stringToTranslate.get(i).toLowerCase().charAt(0) == 'a' || stringToTranslate.get(i).toLowerCase().charAt(0) == 'e' || stringToTranslate.get(i).toLowerCase().charAt(0) == 'i' 
					|| stringToTranslate.get(i).toLowerCase().charAt(0) == 'o' || stringToTranslate.get(i).toLowerCase().charAt(0) == 'u' ){						
				
				stringToTranslate.set(i, stringToTranslate.get(i) + "way ");
				
				translatedString += stringToTranslate.get(i).toString();						
				
			}
		}

		return translatedString;		
	}
}

