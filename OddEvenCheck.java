import java.util.Scanner;

class OddEvenCheck{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		// User input the number 
		System.out.print("Enter a natural number : ");
		int number = sc.nextInt();
		
		// Check whether a natural number and odd or even
		
		if(number < 1){
			System.out.print("Please enter a natural number");
		}
		else{	
			for(int i=1; i<=number; i++){
				if(i % 2 == 0) {
					System.out.println(i + " is an even number");
				}
				else{
					System.out.println(i + " is an odd number");
					}
			}
		}
		sc.close();
	}
}