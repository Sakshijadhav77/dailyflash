


import java.io.*;
class Program75 {
	    public static void main(String[] args)throws IOException{
		    BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		    System.out.println("Enter Number 1: ");
		    System.out.print("Real part: ");
		    int real=Integer.parseInt(br.readLine());
		    System.out.print("Imaginary part: ");
		    int imag=Integer.parseInt(br.readLine());
								            
		    System.out.println("Enter Number 2: ");
		    System.out.print("Real part: ");
		    int real2=Integer.parseInt(br.readLine());
		    System.out.print("Imaginary part: ");
		    int imag2=Integer.parseInt(br.readLine());

	
		    System.out.print("The Addition of "+real+" + "+imag+"i & "+real2+" + "+imag2+"i "+"is "+(real+real2)+" + "+(imag+imag2)+"i");
	    }
}

