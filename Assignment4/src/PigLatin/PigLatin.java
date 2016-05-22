package PigLatin;

import java.util.Scanner;
import java.util.ArrayList;

public class PigLatin {

	public static void main(String[] args) {
		System.out.println("John Ferguson");
		
		System.out.println("Please enter a word (or press Q to quit): ");
		
		ArrayList<String> newSentence = new ArrayList<String>(0);
		
		String completeNewSentence = "";
		
		try (Scanner stringToTranslate = new Scanner(System.in)) {
			
			String translate = stringToTranslate.next();
		
				while (translate.toLowerCase().charAt(0) != 'q' || translate.length() != 1) { 
					
					if (translate.toLowerCase().charAt(0) != 'a' && translate.toLowerCase().charAt(0) != 'e' && translate.toLowerCase().charAt(0) != 'i' 
								&& translate.toLowerCase().charAt(0) != 'o' && translate.toLowerCase().charAt(0) != 'u' )
					{
							while(translate.toLowerCase().charAt(0) != 'a' && translate.toLowerCase().charAt(0) != 'e' && translate.toLowerCase().charAt(0) != 'i' 
									&& translate.toLowerCase().charAt(0) != 'o' && translate.toLowerCase().charAt(0) != 'u' )
							{
								char charToMove = translate.toLowerCase().charAt(0);
								
								translate = translate.substring(1);
								
								translate = translate + charToMove;
								
							}
							
							translate = translate + "ay";
							
							newSentence.add(translate);
							
					}
					else if (translate.toLowerCase().charAt(0) == 'a' || translate.toLowerCase().charAt(0) == 'e' || translate.toLowerCase().charAt(0) == 'i' 
							|| translate.toLowerCase().charAt(0) == 'o' || translate.toLowerCase().charAt(0) == 'u' )
					{						
						
						translate = translate + "way";
						
						newSentence.add(translate);						
						
					}
					
					
					for (int i = 0; i < newSentence.size(); i++)
					{
						if( i != newSentence.size()){
							completeNewSentence += (newSentence.get(i) + " ");
							newSentence.remove(i);
						}

						//System.out.println(completeNewSentence);
					}
						
						
					System.out.println(completeNewSentence);
					
					System.out.println("Please enter a word (or press Q to quit): ");		
							
					translate = stringToTranslate.next();
					
					newSentence.clear();
					
					//completeNewSentence = "";
				}
				
		
		System.out.println("Thanks for playing!");
		
		}
	}
}
