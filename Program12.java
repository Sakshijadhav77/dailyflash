



import java.io.*;
class Program12 {
	    public static void main(String[] args)throws IOException{
		    BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		    System.out.println("Input: ");
		    int n=Integer.parseInt(br.readLine());   //taking input from user
		    switch(n){
			    case 0:
				    System.out.println("Monday");  //Monday
				    break;											            
			    case 1:
				    System.out.println("Tuesday");  //Tuesday
				    break;

			    case 2:
				    System.out.println("Wednesday");   //Wednesday
				    break;

			
			    case 3:
				    System.out.println("Thrusday");   //Thrusday
				    break;

			
			    case 4:
				    System.out.println("Friday");   //Friday
				    break;

			
			    case 5:
				    System.out.println("Saturday");  //Saturday
				    break;

			
			    case 6:
				    System.out.println("Sunday");  //Sunday
				    break;

			
			    default:
				    System.out.println("Invalid weekday");
				    break;

		    }
	    }
}


