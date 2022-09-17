


import java.io.*;
class Program27{
	    public static void main(String[] args)throws IOException{
		    BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		    System.out.println("limit: ");
		    int lim=Integer.parseInt(br.readLine());
		    int sum=0;
		    for(int i=1;i<=lim;i++){
			    sum+=i;
		    }
		    System.out.println("Sum of first 10 natural numbers is: "+sum);
	    }
}
