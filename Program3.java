


import java.io.*;

class Program3 {
	    public static void main(String[] args)throws IOException{
		    BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		    System.out.println("Input: ");
		    int n=Integer.parseInt(br.readLine());
		    if(n%2==0){
			    System.out.println(n+" is an even number");
		    }else{
			    System.out.println(n+" is an odd number");
		    }
	    }	        
}

