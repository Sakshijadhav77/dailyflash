


import java.io.*;
class Program13{
	    public static void main(String[] args)throws IOException{
		    BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		    System.out.println("Input: ");
		    int n=Integer.parseInt(br.readLine());   //taking input from user
		    switch(n){
			    case 1:
				    System.out.println("January");  //January
				    break;

			    case 2:
				    System.out.println("February");  //February
				    break;

			    case 3:
				    System.out.println("March");   //March
				    break;

			
			    case 4:
				    System.out.println("April");   //April
				    break;

			
			    case 5:
				    System.out.println("May");   //May
				    break;

			
			    case 6:
				    System.out.println("June");  //June
				    break;

			
			    case 7:
				    System.out.println("July");  //July
				    break;

			
			    case 8:
				    System.out.println("August");  //August
				    break;

			    case 9:
				    System.out.println("September");  //September
				    break;

			
			    case 10:
				    System.out.println("October");  //October
				    break;

			
			    case 11:
				    System.out.println("November");  //November
				    break;

			
			    case 12:
				    System.out.println("December");   //December
				    break;               

			
			    default:
				    System.out.println("Invalid monthnumber");
				    break;
		    }
	
	    }

}



