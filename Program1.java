
import java.io.*;
class Program1{
	    public static void main(String[] args)throws IOException{
		         
             BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	     System.out.println("Inputs: ");
	     int m=Integer.parseInt(br.readLine());
	     int n=Integer.parseInt(br.readLine());
	
    	     if(m>n){
		     System.out.println(m+" is maximum");
	     }else{
		     System.out.println(n+" is maximum than "+m);
	     }                                                          

	    }
}
