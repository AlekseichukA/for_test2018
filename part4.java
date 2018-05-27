package secondpart;
import java.io.*;
import java.util.*;
/*
 4.	������� ���������, ������� ����� ������������ ���������� ���� � ����������� � �������� �� � ��������������� ����.
  ����������� �������� �������. (����������� ������ (� �) � ������� (�,�)).
 */

public class part4 {
	public static void main(String[] args) throws IOException{
		while(true) {
			System.out.println("������� ����������� � ������� ���������� ���������� ���������� ����:");
			BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
			String sentence = reader.readLine();
			if (!(sentence == null)) {
				String[] wordsOfSentence = sentence.split("[^[, ]]");
				ArrayList<String> words = new ArrayList<String>();
				for (int i = 0; i <wordsOfSentence.length; i++) {
					if (!wordsOfSentence[i].isEmpty()) words.add(wordsOfSentence[i]);
				}
				System.out.println("���������� ���� � ����������� -  " + words.size());
				String[] sortWords = new String[words.size()]; 
				for (int i = 0; i < words.size(); i++ ) {
					sortWords[i] = words.get(i).toLowerCase();
				}
				Arrays.sort(sortWords);
				for (int i = 0; i < sortWords.length; i++ ) {
					System.out.println(sortWords[i]);
				}
			}
			else System.out.println("��������� ������ - ���������� ������ ����������� ��� ���.");
		} 
	
	}
	
	
}
