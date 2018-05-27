package secondpart;
import java.io.*;


/*
 3.	Необходимо написать программу, которая проверяет слово на "палиндромность".
  Слово для проверки вводится вручную во время выполнения программы. 
 */

public class part3 {
	public static void main(String[] args) throws IOException{
		while(true) {
			System.out.println("Введите слово, которое необходимо проверить на палиндромность:");
			BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
			String word = reader.readLine();
			if (!(word == null)) {
				if (testOfWord(word)) System.out.println("Это слово является палиндромом.\n");
				else System.out.println("Это слово не является палиндромом.\n");
			}
			else System.out.println("Произошла ошибка - попробуйте ввести слово ещё раз.");
		} 
	}
	private static boolean  testOfWord (String w) {
		if (w.length() < 2) return true;
		char[] charWord = w.toCharArray();
		int lengthOfW = w.length();
		int i = 0;
		int j = lengthOfW-1;
		while (i < j) {
			if ( !(charWord[i] == charWord[j])) return false;
			else {
				i++;
				j--;
			}
		}
		return (true);
	}
}
