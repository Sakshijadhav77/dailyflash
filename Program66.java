


import java.io.*;
class Program66{
	    public static void main(String[] args)throws IOException{
		    BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

		    System.out.println("Input: ");
		    int num=Integer.parseInt(br.readLine());

	
		    for(int i=10;i>=1;i--){
			    System.out.println(num+" X "+i+" = "+num*i);
		    }
	    }
}
