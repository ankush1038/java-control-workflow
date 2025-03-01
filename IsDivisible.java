import java.util.Scanner;

class IsDivisible{
	public static void main(String[] args){
			Scanner sc = new Scanner(System.in);
			
			// Enter the number
			System.out.print("Enter the number : ");
			int number = sc.nextInt();
			
			// Check divisibility
			if(number%5==0){
				System.out.print("Is the number " + number + " divisible by 5? Yes");	
			} 
			else{
				System.out.print("Is the number " + number + " divisible by 5? No");
			}
	}
}