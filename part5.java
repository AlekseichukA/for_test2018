package secondpart;
import java.io.*;
import java.util.*;
/*
5.	������� ���������, ������� ������������ ������� ��� ������������� ����� � ������ (��� ����� ��������).
 ����� � ����� �������� �������.
 */

public class part5 {
	public static void main(String[] args) throws IOException{	
		while(true) {
			System.out.println("������� �����:");
			BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
			String text = reader.readLine();
			if ((text != null)) {
				String[] wordsOfText = text.split("[^a-zA-Z�-��-�]");
				ArrayList<String> words = new ArrayList<String>();
				for (int i = 0; i <wordsOfText.length; i++) {
					if (!wordsOfText[i].isEmpty()) words.add(wordsOfText[i]);
				}
				System.out.println("������� ����� �� ������");
				String word = reader.readLine();
				int j = 0;
				for (String words_i : words) {
					if (word.toLowerCase().equals(words_i.toLowerCase())) {
						j++;
					}
				}
				System.out.println("����� \"" + word + "\" ����������� � ������ " + j + " ���(�)");			
			}
		else System.out.println("��������� ������ - ���������� ������ ����������� ��� ���.");
	}	
	} 
}


