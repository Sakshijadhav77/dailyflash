


import java.io.*;
class Program34 {
	    public static void main(String[] args)throws IOException{
		    BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		    System.out.println("Input: ");				            
		    int sum=0;
		    for(int i=0;i<10;i++){
			    int num=Integer.parseInt(br.readLine());
			    sum+=num;
		    }
		    double avg=sum/10;
		    System.out.println("Sum of 10 entered numbers is "+sum); 
		    System.out.println("Average of 10 entered numbers is "+avg); 
	    }
}

