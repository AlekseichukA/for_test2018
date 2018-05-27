package secondpart;
import java.io.*;


/*
 3.	���������� �������� ���������, ������� ��������� ����� �� "��������������".
  ����� ��� �������� �������� ������� �� ����� ���������� ���������. 
 */

public class part3 {
	public static void main(String[] args) throws IOException{
		while(true) {
			System.out.println("������� �����, ������� ���������� ��������� �� ��������������:");
			BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
			String word = reader.readLine();
			if (!(word == null)) {
				if (testOfWord(word)) System.out.println("��� ����� �������� �����������.\n");
				else System.out.println("��� ����� �� �������� �����������.\n");
			}
			else System.out.println("��������� ������ - ���������� ������ ����� ��� ���.");
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
