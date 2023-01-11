package hangman;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class ReadJSONFile {
	
	
	public static String generateWord() {
		String chosenWord = null;
		
		JSONParser parser = new JSONParser();
		
		try {
			Object obj = parser.parse(new FileReader("wordlist.json"));
			JSONArray wordList = (JSONArray) obj;
			chosenWord = (String) wordList.get((int) Math.floor(Math.random()*wordList.size()));
			
		}
		catch(FileNotFoundException e) {e.printStackTrace();}
		catch(IOException e) {e.printStackTrace();}
		catch(ParseException e) {e.printStackTrace();}
		catch(Exception e) {e.printStackTrace();}
		return chosenWord;

	}
}