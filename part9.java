package secondpart;
import java.io.*;
import java.util.*;

/*
9.	�������� ��������� ��������� �� ����� ��� ������ ����� � �� ����� �� ������������������ �� 0 �� N.
 N �������� �������.
 */
public class part9 {
	public static void main(String[] args) throws IOException{
		while (true) {
			System.out.println("������� �����:");
			try {
				double nStart = getNumber();
				int n = (int) nStart;
				if (n < 0) {
					System.out.print("����� ������ ���� ������ ���� ����� 0. ");
					continue;
				}
				if (n == 0 || n == 1) { 
					System.out.println("� ������������������� �� 0 �� " + n + "������ ����� ������ 0.");
					continue;
				}
				ArrayList<Integer> numbers = new ArrayList<Integer>();
				int summ = 0;
				if (n % 2 != 0) n--;
				for (int i = n; i >= 0 ; i -= 2 ) {
					numbers.add(i);
					summ += i;
				}
				System.out.println("� ������������������ �� 0 �� " + nStart + " ����� ������ ����� ����� " + summ);
				System.out.println("������ ����� �� ������������������ �� 0 �� " + nStart + ":");
				for (Integer k : numbers) {
					System.out.println(k);
				}
			}
			catch(Exception e) {
				System.out.println("��������� ������, ��������� ��� ���.");
			}
		}
	}
		
	public static double getNumber() throws ClassCastException, IOException{
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		String s_number = reader.readLine();
		double number = Double.parseDouble(s_number);
		return number;
	}
}
