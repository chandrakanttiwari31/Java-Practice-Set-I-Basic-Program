import java.util.Scanner;

public class EvenNumber {  
//    public static void main(String[] args) {
//		
//	Scanner sc=new Scanner(System.in);
//	
//	System.out.println("Enter your number");
//	
//	int number = sc.nextInt();
//	String[] trick = { "even", "odd" };
//	
//	System.out.println(number + " is " + trick[number % 2]);
//} 
//}
	
	
	
 public static void main(String[] args) {
	
	 Scanner sc =new Scanner(System.in);
	 System.out.println("etter  your no");
	 int n=sc.nextInt();
	  try
	  
	  {
		
		int a=5/(n%2);
		System.out.println("number is odd number");
	  }
	  catch(Exception e)
	  {
		  
		  System.out.println("number is even number");
	  }
	  
	  
}	
}