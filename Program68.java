

import java.io.*;
class Program68 {
	    public static void main(String[] args)throws IOException{
		    BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		    System.out.print("Length: ");
		    int length=Integer.parseInt(br.readLine());
		    System.out.print("Breadth: ");
		    int breadth=Integer.parseInt(br.readLine());

		    int area=length*breadth;
		    System.out.print("Area of rectangle= "+area);
	    }
}

