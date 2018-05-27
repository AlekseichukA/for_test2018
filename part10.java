package secondpart;

import java.io.*;
import java.util.*;

/*
10.	Написать программу, составляющую всевозможные комбинации 3-х значных чисел из 3-х введенных пользователем цифр.
 Цифры вводятся вручную.
 */

public class part10 {
	public static void main(String[] args) throws IOException{
		while (true) {
			Integer[] numbers = new Integer [3];
			int i = 0;
		while(i < 3) {
			try {
				int number = getNumber(i+1);
				if (0 <= number && number <= 9) {
					numbers[i] = number;
					i++;
				}
				else System.out.println("Введите число от 0 до 9.");
			}
			catch(Exception e) {
				System.out.println("Произошла ошибка. Попробуйте еще раз.");
			}
		}
		ArrayList<String> s_numbers = new ArrayList<String>();
		s_numbers.add(numbers[0].toString() + numbers[1].toString() + numbers[2].toString());
		if (!coincidenceOfNumbers(numbers[0], numbers[2], numbers[1], s_numbers)) {
			s_numbers.add(numbers[0].toString() + numbers[2].toString() + numbers[1].toString());
		}
		if (!coincidenceOfNumbers(numbers[1], numbers[0], numbers[2], s_numbers)) {
			s_numbers.add(numbers[1].toString() + numbers[0].toString() + numbers[2].toString());
		}
		if (!coincidenceOfNumbers(numbers[1], numbers[2], numbers[0], s_numbers)) {
			s_numbers.add(numbers[1].toString() + numbers[2].toString() + numbers[0].toString());
		}		
		if (!coincidenceOfNumbers(numbers[2], numbers[1], numbers[0], s_numbers)) {
			s_numbers.add(numbers[2].toString() + numbers[1].toString() + numbers[0].toString());
		}		
		if (!coincidenceOfNumbers(numbers[2], numbers[0], numbers[1], s_numbers)) {
			s_numbers.add(numbers[2].toString() + numbers[0].toString() + numbers[1].toString());
		}		
		ArrayList<Integer> result_numbers = new ArrayList<Integer>();		
		for(int j = 0; j < s_numbers.size(); j++) {
			if ( Integer.parseInt(s_numbers.get(j)) >= 100)
			result_numbers.add(Integer.parseInt(s_numbers.get(j)));
		}
		for (Integer j : result_numbers) {
			if (j >= 100 ) System.out.println(j);
		}
		System.out.println();
	}
}
		
	public static int getNumber(int i) throws ClassCastException, IOException{
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Введите " + i + " число:");
		String s_number = reader.readLine();
		int number = Integer.parseInt(s_number);
		return number;
	}
	public static boolean coincidenceOfNumbers (Integer a, Integer b, Integer c, ArrayList<String> s_numbers) {
		for (String s : s_numbers) {
			if (s.equals(a.toString() + b.toString() + c.toString())) return true;
		}
		return false;
	}
}
