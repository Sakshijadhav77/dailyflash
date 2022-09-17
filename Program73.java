


import java.io.*;
class Program73 {
	    public static void main(String[] args)throws IOException{
		    BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		    System.out.println("Input: ");
		    int num1=Integer.parseInt(br.readLine());
		    int num2=Integer.parseInt(br.readLine());

		    int q=num1/num2;
		    int r=num1%num2;

		    System.out.println("Quotient: "+q);
		    System.out.println("Reminder: "+r);
	    }
}

