package Switch;

import java.util.Scanner;

public class SwitchBoolean {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int marks=scan.nextInt();
		switch (marks) {
		
		case 10: 
		case 20: 
		case 30: System.out.println("A");break;
		
		case 40: 
		case 50: 
		case 60: System.out.println("B");break;
		
		case 70: case 80: case 90: System.out.println("B");break;
		default: System.out.println("A");break;
		
		}
	}

}
