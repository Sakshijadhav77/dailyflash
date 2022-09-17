


import java.io.*;
class Program32 {
	    public static void main(String[] args)throws IOException{
		    BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		    System.out.println("limit: ");
		    int num=Integer.parseInt(br.readLine());
		    int sum=0;
		    for(int i=1;i<=num;i++){
			    sum+=i;
		    }
		    System.out.println("The sum of numbers up to 10 is "+sum);
	    }
}

