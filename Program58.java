


import java.io.*;
class Program58 {
	    public static void main(String[] args)throws IOException{
		    BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		    System.out.print("Current: ");
		    int i=Integer.parseInt(br.readLine());
		    System.out.print("Resistance: ");
		    int r=Integer.parseInt(br.readLine());

		    int v=i*r;
		    System.out.println("Voltage V= "+v);
	    }
}

