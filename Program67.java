


import java.io.*;

import org.omg.IOP.IOR;
class Program67 {
	    public static void main(String[] args)throws IOException{
		    BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		    System.out.print("Input: ");
		    int num=Integer.parseInt(br.readLine());

	
		    int prec=num-2;
		    int succ=num+2;

		    System.out.println("Second Predecessor: "+prec);
		    System.out.print("Second Successor: "+succ);
	    }
}

