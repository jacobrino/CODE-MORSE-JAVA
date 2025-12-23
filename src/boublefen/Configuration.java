package boublefen;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class Configuration 
{
    static String[] codeMorse={ ".-",   "-...", "-.-.", "-..",  ".",
            "..-.", "--.",  "....", "..",   ".---",
            "-.-",  ".-..", "--",   "-.",   "---",
            ".--.", "--.-", ".-.",  "...",  "-",
            "..-",  "...-", ".--",  "-..-", "-.--",
            "--..", "|" };
	
    
    public static String getCodeMorse(String entrer)
	{
    	//entrer obligatoire doit être string CARACTERE ASCII
   
		Map<Character,String>map=new LinkedHashMap<>();
		map.put(' ', "/");			
		map.put(',',"--..--");
		map.put('.', ".-.-.-");
		map.put('?', "..--..");
		map.put('0',"-----");
		map.put('1',".----");
		map.put('2', "..---");
		map.put('3', "...--");
		map.put('4', "....");
		map.put('5', ".....");
		map.put('6', "-....");
		map.put('7', "--...");
		map.put('8', "---..");
		map.put('9', "----.");
		map.put('A', ".-");
		map.put('B', "-...");
		map.put('C', "-.-.");
		map.put('D', "-..");
		map.put('E', ".");
		map.put('F', "..-.");
		map.put('G', "--.");
		map.put('H', "....");
		map.put('I', "..");
		map.put('J', ".---");
		map.put('K', "-.-");
		map.put('L', ".-..");
		map.put('M', "--");
		map.put('N', "-.");
		map.put('O', "---");
		map.put('P', ".--.");
		map.put('Q', "--.-");
		map.put('R', ".-.");
		map.put('S', "...");
		map.put('T', "-");
		map.put('U', "..-");
		map.put('V', "...-");
		map.put('W', ".--");
		map.put('X', "-..-");
		map.put('Y', "-.--");
		map.put('Z', "--..");
		
		char[] tableauEntrer=entrer.toUpperCase().toCharArray();
	
		//entrer="Bonjour"
		//arr devient "BONJOUR"
		
		
		String resultatMorse= "";
	
		for(char ch:tableauEntrer)//Pour chaque caractère dans tableauEntrer
		{
			resultatMorse +=map.get(ch);			
		}
		return resultatMorse;
	}
	public static String morseToEnglish(String morseCode)
	{
		Map<String, Character> morseToEnglish= new HashMap<>();
		String sorti="";
		for (int i = 0; i < 26; i++) 
		{
			morseToEnglish.put(codeMorse[i], (char)('a' + i));
		}
		//String[] array = morseCode.split("*");

		String[] array = morseCode.split("\\*");

		for (int i = 0; i < array.length; i++) 
		{
			sorti=sorti+morseToEnglish.get(array[i]);
		}
		
		return sorti;
	}
}
