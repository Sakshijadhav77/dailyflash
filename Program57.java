


import java.io.*;
class Program57 {
	    public static void main(String[] args)throws IOException{
		    BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		    System.out.print("Input: ");
		    int startpt=Integer.parseInt(br.readLine());
		    int endpt=Integer.parseInt(br.readLine());

		    int n=1;
		    for(int i=startpt;i<=endpt;i++){
			    n=n*i;
			    System.out.println("Factorial of "+i+" is "+n);            
		    }
	    }
}
            
            

