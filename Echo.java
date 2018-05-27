package secondpart;
import java.io.*;


/*
 1.	������� ���������, ������� ����� ��������, �������� �� ����� �����, ��������� �������������,
  ������ ��� ��������, ������� ��� ���������.  ���� ������������ ����� �� ����� �����, �� �������� ��� �� ������
 */

public class Echo {
	public static void main(String[] args) throws IOException{
		//ArrayList<Integer> numbers = new ArrayList();
		while(true) {
			try {
				int number = getNumber();
				if (number!=0) {
					System.out.print(number + " - ");
					if(number%2==0) System.out.print("������, ");
					else System.out.print("��������, ");
					boolean isSimle = testNumber(number);
					if (isSimle) System.out.println("������� �����");
					else System.out.println("��������� �����");
				}
				else System.out.println("0 ��������� ������, �� �� ������� �� ��������� ������");
				//numbers.add(getNumber());
			}
			catch(Exception e) {
				System.out.println("��������� ������. ���������� ��� ���.");
			}
		}
		
	}
	public static int getNumber() throws ClassCastException, IOException{
		System.out.println("������� �����:");
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		String s_number = reader.readLine();
		int number = Integer.parseInt(s_number);
		//System.out.println(number);
		return number;
	}
	public static boolean testNumber(int N) {
		boolean isSimple = true;
		if ( N == 1) isSimple = true;
		else if ( N == 2) isSimple = false;
		else if ( N % 2 == 0) isSimple = false;
		else {
			int i = 3;
			while (( i * i <= N )&& isSimple){
				if (N % i == 0) isSimple = false;
				else i += 2;
			}
		}
		return isSimple;
	}
}
