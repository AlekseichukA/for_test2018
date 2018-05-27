package secondpart;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

/*
2.������� ���������, ������� ����� ��������� � �������� �� ����� �����, ��������, ��� � ��� ���� ����� �����,
��������� �������������. ���� ������������ ����������� ����� ���� �� ���� �� �����, �� �������� �� ������.
*/

public class part2 {
	public static void main(String[] args) throws IOException{
		while(true) {
			ArrayList<Integer> numbers = new ArrayList<Integer>();
			try {
				int number = getNumber(1);
				numbers.add(number);
			}
			catch(Exception e) {
				System.out.println("��������� ������. ���������� ��� ���.");
				continue;
			}
			try {
				int number = getNumber(2);
				numbers.add(number);
			}
			catch(Exception e) {
				numbers.remove(0);
				System.out.println("��������� ������. ���������� ��� ���.");
				continue;
			}				
			int summ = numbers.get(0) + numbers.get(1);
			System.out.println(numbers.get(0) + "+" + numbers.get(1) + "=" + summ);
			int rasn = numbers.get(0) - numbers.get(1); 
			System.out.println(numbers.get(0) + "-" + numbers.get(1) + "=" + rasn);
			int nod = NOD(numbers.get(0), numbers.get(1));
			if (numbers.get(0) != 0 || numbers.get(1) != 0) {
				System.out.println("��� ����� " + numbers.get(0) + " � " + numbers.get(1) + " ����� " + nod);
			}
			else System.out.println("���� ��� ����� ����� 0 ��� �� ���������");
			if (numbers.get(0) != 0 && numbers.get(1) != 0) {
				int nok = Math.abs(numbers.get(0)) * Math.abs(numbers.get(1)) / nod;
				System.out.println("��� ����� " + numbers.get(0) + " � " + numbers.get(1) + " ����� " + nok);
			}
			else System.out.println("���� ���� �� ����� ����� 0 ��� �� ����������");
		}
	}
	
	public static int getNumber(int i) throws ClassCastException, IOException{
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("������� " + i + " �����:");
		String s_number = reader.readLine();
		int number = Integer.parseInt(s_number);
		//System.out.println(number);
		return number;
	}
	
	public static int NOD(int a, int b) {
		if (a!=0 && b!=0) {
			a = Math.abs(a);
			b = Math.abs(b);
			while(a != b) {
				if (a > b) a -= b;
				else b -= a;
			}
			return a;
		}
		else return (Math.abs(a)+Math.abs(b)); 
	}
}