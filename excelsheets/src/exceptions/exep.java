package exceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class exep {

	@SuppressWarnings("resource")
	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		try {
			int a=10/0;
			System.out.println(a);
		}catch(ArithmeticException e) {
			System.out.println(e);
		}
		try {
			int[] a= {1,2};
			System.out.println(a[2]);
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println(e);
		}
		try {
			int a=10/0;
			System.out.println(a);
		}catch(ArithmeticException e) {
			System.out.println(e);
		}
		try {
			int a=sc.nextInt();
			System.out.println(a);
		}catch(InputMismatchException e) {
			System.out.println(e);
		}
		sc.close();
		try {
			@SuppressWarnings("unused")
			FileInputStream f = new FileInputStream("C:\\Chakadhar\\Book3.xlsx");
		}catch(FileNotFoundException e) {
			System.out.println(e);
		}
	}

}
