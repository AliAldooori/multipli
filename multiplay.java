import java.util.Scanner;

public class multiplay {

	public static void main(String[] args) {
     Scanner input = new Scanner ( System.in);
     
     System.out.println("Enter your number ");
     int x = input.nextInt();
     
     for (int i = 1; i <= 10; i++) {
    	 int y = i * x ;
    	 
    	 System.out.println(x +"*"+ i +"="+ y);
		
	}
     
     
     
     
     
     
   //  input.close();
	}

}
