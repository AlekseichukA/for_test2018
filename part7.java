package secondpart;
import java.io.*;

/*
7.	Написать программу, которая рандомно генерирует массив 2-ух значных чисел длины N (вводится вручную)
 и выводит наименьшее и наибольшее число из списка.
 */
public class part7 {
	public static void main(String[] args) throws IOException{
		while (true) {
			try {
				System.out.println("Введите целое число:");
				int n = getNumber();
				if (n <= 0) {
					System.out.print("Число должно быть больше чем 0. ");
					continue;
				}
				if (n == 1) { 
					System.out.println("Для массива из одного элемента можно принять что "
						+ "максимальное число равно минимальному - " + getRandomNumber());
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
				System.out.println("\nБыл сгенерирован массив из " + n + " случайных чисел.");
				System.out.println("Макимальное число - " + max_mass + ", минимальние число - " + min_mass);
			}
			catch(Exception e){
				System.out.print("Произошла ошибка. Попробуйте ещё раз.");
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
