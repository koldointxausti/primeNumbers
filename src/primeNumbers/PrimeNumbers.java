package primeNumbers;
import java.util.Scanner;

public class PrimeNumbers {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		boolean flag = true;
		while(flag) {
			System.out.println("Enter a number:");
			if(sc.hasNextInt()) {
				int num = sc.nextInt();
				int counter=0;
				if(num>0) {
					num--;
					for(int i=num;i>0;i--) {
						if(num%i==0) {
							System.out.println("it's not prime");
							break;
						}else {
							counter++;
						}
					}
					if(counter==num-1) {
						System.out.println("it is prime");
					}
					System.out.println("Do you want to try with another number? (y/n)");
					String again = sc.next();
					if(again.startsWith("n")) {
						flag=false;
						System.out.println("The program has been stopped.");
					}
				}else {
					System.out.println("It has to be a positive number.");
				}
			}else {
				System.out.println("It has to be a number. Enter one:");
			}
		}
	}
}
