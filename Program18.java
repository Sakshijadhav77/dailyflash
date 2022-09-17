

import java.io.*;
class Program18 {
	    public static void main(String[] args)throws IOException{
		    BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		    System.out.println("Year: ");
		    int year=Integer.parseInt(br.readLine());  //year from use
		    if(year%4==0 || year%400==0){
			    System.out.println(year+" is a leap year");  //leap year
		    }else{
			    System.out.println(year+" is a regular year"); //regular year
		    }
	    }
}




