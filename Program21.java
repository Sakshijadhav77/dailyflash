


import java.io.*;
class Program21{
	    public static void main(String[] args)throws IOException{
		    BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		    System.out.println("radius: ");
		    int radius=Integer.parseInt(br.readLine());  //radius					       
		    double area=0;
		    area=(radius*radius)*3.14;   //area
		    System.out.println("Area of circle is: "+area);
	    }
}



