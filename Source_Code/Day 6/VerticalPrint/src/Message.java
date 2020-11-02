import java.util.ArrayList;

public class Message {
	
	public static void print(String message) {
		
		String word = "";
		
		for (int i = 0; i < message.length(); i++) {
			if (message.substring(i, i+1).equals(" ")) {
				System.out.println(word);
				word = "";
			} else {
				word = word + message.substring(i, i+1);
			}
		}
		System.out.println(word);
		
	}
	
	public static void printReverse(String message) {
		
		String[] words = message.split(" ");
		ArrayList<String> reversed = new ArrayList<String>();
		
		for (int i = (words.length - 1); i >= 0; i--) {
			String[] word = words[i].split("");
			String reversedWord = "";
			for (int j = (word.length - 1); j >= 0; j--) {
				reversedWord = reversedWord + word[j];
			}
			reversed.add(reversedWord);
			reversedWord = "";
		}
		
		System.out.println(reversed);
		
	}
	

}
