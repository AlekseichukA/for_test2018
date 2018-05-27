package secondpart;
import java.io.*;

/*
6.	�������� ���������, ������� ��������� ��� ������� �� ����������� ������� ������������� �����������.
 ����� �������� �������� �������.
 */
public class part6 {
	public static void main(String[] args) throws IOException{
		while (true) {
		double[] triangle = new double [3];
		int i = 0;
		while(i < 3) {
			try {
				double number = getNumber(i+1);
				if (number > 0) {
					triangle[i] = number;
					i++;
				}
				else System.out.println("�������� ������� ������������ ������ ���� ������ ����. ���������� ��� ���.");
			}
			catch(Exception e) {
				System.out.println("��������� ������. ���������� ��� ���.");
			}
		}
		if (canTriangleToBe(triangle[0], triangle[1], triangle[2]) ||
			canTriangleToBe(triangle[1], triangle[2], triangle[0]) ||
			canTriangleToBe(triangle[2], triangle[0], triangle[1])) {
				System.out.println("�� ���� ���� �������� (" + triangle[0] + ", " + triangle[1] + ", " + triangle[2] + 
									") �������� ������� ������������� �����������");
		}
		else System.out.println("�� ���� ���� �������� (" + triangle[0] + ", " + triangle[1] + ", " + triangle[2] + 
								") ������ ������� ������������ �����������");
		}
	}
	
	public static double getNumber(int i) throws ClassCastException, IOException{
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("������� " + i + " �����:");
		String s_number = reader.readLine();
		double number = Double.parseDouble(s_number);
		//System.out.println(number);
		return number;
	}
	
	public static boolean canTriangleToBe(double a, double b, double c) {
		if( a * a + b * b == c* c ) {
			return true;
		}
		else return false;
	}
}
