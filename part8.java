package secondpart;
import java.io.*;
import java.util.*;

/*
8.	Написать программу, которая в последовательности от 0 до N, находит все числа-палиндромы 
(зеркальное значение равно оригинальному). Длина последовательности вводится вручную и не должна превышать 100. 
 */
public class part8 {
	public static void main(String[] args) throws IOException{
		while (true) {
			try {
				ArrayList<Integer> arr = new ArrayList<Integer>();
				System.out.println("Введите целое число до 100:");
				int nStart = getNumber();
				int n = nStart;
				if (n < 0 || n > 100) {
					System.out.print("Число должно быть от 0 до 100. ");
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
				System.out.println("числа-палиндромы в последвательности от 0 до " + nStart + ":");
				for (int a : arr ) {
					System.out.println(a);
				}
			}
			catch (Exception e) {
				System.out.println("Произошла ошибка. Попробуйте еще раз.");
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
