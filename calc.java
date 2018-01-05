/*Author: Harish B
1/4/2018
Feel free to fork and extend
but remember to copy paste this comment.*/
import java.util.Scanner;
public class calc {

	public static double num1,num2;
	public static int num3, num4;
	public static void main(String[] args){
		calc2 calc2Object = new calc2();
		Scanner stuffie = new Scanner(System.in);
		
		System.out.println("Would you like to use the calculator? Type yes or no");
		String z = stuffie.next();
		if (z.equalsIgnoreCase("yes")) {
			System.out.println("What is your first number in the calculator?");
			num1 = stuffie.nextDouble();
			System.out.println("What is your operation? Type add, subtract, multiply, divide, "
					+ "modulo, exponent, square root(type sqrt), absolute value(type abs), sine, cosine, tangent, ");
			System.out.println("hyperbolic sine(type sinh), hyperbolic cosine(type cosh) hyperbolic tangent(type tanh), arc sine(type asin), arc cosine(type acos), arc tangent(atan),");
			System.out.println("natural logarithm(type natlog), base-10 logarithm(type tenlog), degrees to radians(type degrad), radians to degrees(type raddeg)");
			String oper = stuffie.next();
			if (oper.equalsIgnoreCase("add")||oper.equalsIgnoreCase("subtract")||oper.equalsIgnoreCase("multiply")||oper.equalsIgnoreCase("divide")||oper.equalsIgnoreCase("modulo")||oper.equalsIgnoreCase("exponent")){
				System.out.println("What is your second number in the calculator?");
				num2 = stuffie.nextDouble();
			}
			
			if (oper.equalsIgnoreCase("add")) {
				System.out.println("The answer to "+num1+" + "+num2+" is "+calc2Object.add(num1, num2));
			}else if (oper.equalsIgnoreCase("subtract")) {
				System.out.println("The answer to "+num1+ " - "+ num2+ " is "+calc2Object.subtract(num1, num2));
			}else if (oper.equalsIgnoreCase("multiply")) {
				System.out.println("The answer to "+num1+ " * "+ num2+ " is "+calc2Object.multiply(num1, num2));
			}else if (oper.equalsIgnoreCase("divide")) {
				System.out.println("The answer to "+num1+ " / "+ num2+ " is "+calc2Object.divide(num1, num2));
			}else if (oper.equalsIgnoreCase("modulo")) {
				System.out.println("The answer to "+num1+ " "+ oper+ " "+ num2+ " is "+calc2Object.modulo(num1, num2));
			}else if (oper.equalsIgnoreCase("exponent")) {
				System.out.println("The answer to "+num1+ " to the power of "+ num2+ " is "+calc2Object.exponent(num1, num2));
			}else if (oper.equalsIgnoreCase("sqrt")) {
				System.out.println("The answer to the square root of "+num1+" is "+calc2Object.square_root(num1));
			}else if (oper.equalsIgnoreCase("abs")) {
				System.out.println("The answer to the absolute value of "+num1+" is "+calc2Object.absolute(num1));
			}else if (oper.equalsIgnoreCase("sine")){
				System.out.println("The answer to the sine of "+num1+" is "+calc2Object.sin(num1));
			}else if (oper.equalsIgnoreCase("cosine")){
				System.out.println("The answer to the cosine of "+num1+" is "+calc2Object.cos(num1));
			}else if (oper.equalsIgnoreCase("tangent")){
				System.out.println("The answer to the tangent of "+num1+" is "+calc2Object.tan(num1));
			}else if (oper.equalsIgnoreCase("sinh")){
				System.out.println("The answer to the hyperbolic sine of "+num1+" is "+calc2Object.sinh(num1));
			}else if (oper.equalsIgnoreCase("cosh")){
				System.out.println("The answer to the hyperbolic cosine of "+num1+" is "+calc2Object.cosh(num1));
			}else if (oper.equalsIgnoreCase("tanh")){
				System.out.println("The answer to the hyperbolic cotangent of "+num1+" is "+calc2Object.tanh(num1));
			}else if (oper.equalsIgnoreCase("asin")) {
				System.out.println("The answer to the arc sine of "+num1+" is "+calc2Object.asin(num1));
			}else if (oper.equalsIgnoreCase("acos")){
				System.out.println("The answer to the arc cosine of "+num1+" is "+calc2Object.acos(num1));
			}else if (oper.equalsIgnoreCase("atan")) {
				System.out.println("The answer to the arc tangent of "+num1+" is "+calc2Object.atan(num1));
			}else if (oper.equalsIgnoreCase("natlog")) {
				System.out.println("The answer to the natural logarithm of "+num1+" is "+ calc2Object.natlog(num1));
			}else if (oper.equalsIgnoreCase("tenlog")) {
				System.out.println("The answer to the base-10 logarithm of "+num1+" is "+calc2Object.log_ten(num1));
			}else if (oper.equalsIgnoreCase("degrad")) {
				System.out.println(num1+" converted into radians is "+calc2Object.deg_rad(num1));
			}else if (oper.equalsIgnoreCase("raddeg")) {
				System.out.println(num1+" converted into degrees is "+calc2Object.rad_deg(num1));
			}
			else {
				System.out.println("You did not type what I told you to, so you lose the opportunity to use this calculator.");
				
			}
		}
		System.out.println("Would you like to use the base converter? Type yes or no");
		z = stuffie.next();
		if (z.equalsIgnoreCase("yes")){
			System.out.println("What is your number in base 10? Please only enter integers");
			num3 = stuffie.nextInt();
			System.out.println("To what base would you be converting it to? Please only enter integers");
			num4 = stuffie.nextInt();
			System.out.println(num3+" in base 16 is "+calc2Object.ten_sixt(num3,num4));
		}
	}
}
