


import java.io.*;
class Program47{
	    public static void main(String[] args)throws IOException{
    		    BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		    System.out.println("Inputs: ");
		    int num1=Integer.parseInt(br.readLine());
		    int num2=Integer.parseInt(br.readLine());
		    System.out.println("Before Swap: ");
		    System.out.println(num1);
		    System.out.println(num2);

		    int s;
		    s=num1;
		    num1=num2;
		    num2=s;

	
		    System.out.println("After Swap: ");
		    System.out.println(num1);
		    System.out.println(num2);



	    }
}
