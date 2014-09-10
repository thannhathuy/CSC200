import java.util.Scanner;
public class FtoC {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Please enter a temperature in degree Fahrenheit ");
		Float C,F;
		Scanner keyboard = new Scanner(System.in);
		F = keyboard.nextFloat();
		System.out.println(F + " degree of Fahrenheit will be equal to ");
		System.out.println(5*(F-32)/9 + " degree of Celcius.");
	}

}
