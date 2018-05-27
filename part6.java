package secondpart;
import java.io.*;

/*
6.	Написать программу, которая проверяет три отрезка на возможность создать прямоугольный треугольник.
 Длина отрезков вводится вручную.
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
				else System.out.println("Значение стороны треугольника должно быть больше нуля. Попробуйте еще раз.");
			}
			catch(Exception e) {
				System.out.println("Произошла ошибка. Попробуйте еще раз.");
			}
		}
		if (canTriangleToBe(triangle[0], triangle[1], triangle[2]) ||
			canTriangleToBe(triangle[1], triangle[2], triangle[0]) ||
			canTriangleToBe(triangle[2], triangle[0], triangle[1])) {
				System.out.println("Из этих трех отрезков (" + triangle[0] + ", " + triangle[1] + ", " + triangle[2] + 
									") возможно создать прямоугольный треугольник");
		}
		else System.out.println("Из этих трех отрезков (" + triangle[0] + ", " + triangle[1] + ", " + triangle[2] + 
								") нельзя создать прямоуголный треугольник");
		}
	}
	
	public static double getNumber(int i) throws ClassCastException, IOException{
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Введите " + i + " число:");
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
