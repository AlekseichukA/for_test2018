package secondpart;
import java.io.*;
import java.util.*;

/*
9.	Написать программу выводящую на экран все четные числа и их сумму из последовательности от 0 до N.
 N вводится вручную.
 */
public class part9 {
	public static void main(String[] args) throws IOException{
		while (true) {
			System.out.println("Введите число:");
			try {
				double nStart = getNumber();
				int n = (int) nStart;
				if (n < 0) {
					System.out.print("Число должно быть больше либо равно 0. ");
					continue;
				}
				if (n == 0 || n == 1) { 
					System.out.println("В посследовательности от 0 до " + n + "четное число только 0.");
					continue;
				}
				ArrayList<Integer> numbers = new ArrayList<Integer>();
				int summ = 0;
				if (n % 2 != 0) n--;
				for (int i = n; i >= 0 ; i -= 2 ) {
					numbers.add(i);
					summ += i;
				}
				System.out.println("В последовательности от 0 до " + nStart + " сумма четных чисел равна " + summ);
				System.out.println("Четные числа из последовательности от 0 до " + nStart + ":");
				for (Integer k : numbers) {
					System.out.println(k);
				}
			}
			catch(Exception e) {
				System.out.println("Произошла ошибка, поробуйте ещё раз.");
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
