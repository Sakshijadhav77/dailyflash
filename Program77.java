


import java.io.*;
class Program77 {
	    public static void main(String[] args)throws IOException{
	            BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		    System.out.print("Rupees: ");
		    double rupees=Double.parseDouble(br.readLine());

		    double convert=rupees/74.21;
		    System.out.print("In Dollars: "+convert);
	    }
}

