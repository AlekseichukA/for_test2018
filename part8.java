package secondpart;
import java.io.*;
import java.util.*;

/*
8.	�������� ���������, ������� � ������������������ �� 0 �� N, ������� ��� �����-���������� 
(���������� �������� ����� �������������). ����� ������������������ �������� ������� � �� ������ ��������� 100. 
 */
public class part8 {
	public static void main(String[] args) throws IOException{
		while (true) {
			try {
				ArrayList<Integer> arr = new ArrayList<Integer>();
				System.out.println("������� ����� ����� �� 100:");
				int nStart = getNumber();
				int n = nStart;
				if (n < 0 || n > 100) {
					System.out.print("����� ������ ���� �� 0 �� 100. ");
					continue;
				}
				while (n >= 0) {
					if ((0 <= n && n <= 9) || (n == 11)) {
						arr.add(n);
						n--;
						continue;
					} 
					if (n%11 == 0) {
						arr.add(n);
						n -= 11;
						continue;
					}
					n--;
				}
				System.out.println("�����-���������� � ����������������� �� 0 �� " + nStart + ":");
				for (int a : arr ) {
					System.out.println(a);
				}
			}
			catch (Exception e) {
				System.out.println("��������� ������. ���������� ��� ���.");
			}
		}
	}
	
	public static int getNumber() throws ClassCastException, IOException{
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		String s_number = reader.readLine();
		int number = Integer.parseInt(s_number);
		return number;
	}
}
