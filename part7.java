package secondpart;
import java.io.*;

/*
7.	�������� ���������, ������� �������� ���������� ������ 2-�� ������� ����� ����� N (�������� �������)
 � ������� ���������� � ���������� ����� �� ������.
 */
public class part7 {
	public static void main(String[] args) throws IOException{
		while (true) {
			try {
				System.out.println("������� ����� �����:");
				int n = getNumber();
				if (n <= 0) {
					System.out.print("����� ������ ���� ������ ��� 0. ");
					continue;
				}
				if (n == 1) { 
					System.out.println("��� ������� �� ������ �������� ����� ������� ��� "
						+ "������������ ����� ����� ������������ - " + getRandomNumber());
					continue;
				}
				int[] mass = new int[n]; 
				for (int i = 0; i < n ; i++ ) {
					mass[i] = getRandomNumber();
				}
				int min_mass = mass[0];
				int max_mass = mass[0];
				for (int i = 0 ; i < mass.length ; i++ ) {
					if (mass[i] < min_mass) min_mass = mass[i];
					if (mass[i] > max_mass) max_mass = mass[i];
				System.out.print(mass[i] + "  ");
				}
				System.out.println("\n��� ������������ ������ �� " + n + " ��������� �����.");
				System.out.println("����������� ����� - " + max_mass + ", ����������� ����� - " + min_mass);
			}
			catch(Exception e){
				System.out.print("��������� ������. ���������� ��� ���.");
			}
		}
	}

	public static int getNumber() throws ClassCastException, IOException{
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		String s_number = reader.readLine();
		int number = Integer.parseInt(s_number);
		return number;
	}
	
	public static int getRandomNumber() throws ClassCastException, IOException{
		int a = (int) (Math.random()*100);
		if (a < 10) a = getRandomNumber();
		return a;
	}
}
