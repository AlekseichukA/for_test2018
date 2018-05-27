package secondpart;
import java.io.*;
import java.util.*;
/*
5.	Создать программу, которая подсчитывает сколько раз употребляется слово в тексте (без учета регистра).
 Текст и слово вводится вручную.
 */

public class part5 {
	public static void main(String[] args) throws IOException{	
		while(true) {
			System.out.println("Введите текст:");
			BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
			String text = reader.readLine();
			if ((text != null)) {
				String[] wordsOfText = text.split("[^a-zA-Zа-яА-Я]");
				ArrayList<String> words = new ArrayList<String>();
				for (int i = 0; i <wordsOfText.length; i++) {
					if (!wordsOfText[i].isEmpty()) words.add(wordsOfText[i]);
				}
				System.out.println("Введите слово из текста");
				String word = reader.readLine();
				int j = 0;
				for (String words_i : words) {
					if (word.toLowerCase().equals(words_i.toLowerCase())) {
						j++;
					}
				}
				System.out.println("Слово \"" + word + "\" встречается в тексте " + j + " раз(а)");			
			}
		else System.out.println("Произошла ошибка - попробуйте ввести предложение ещё раз.");
	}	
	} 
}


