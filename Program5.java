

import java.io.*;

class Program5 {
	    public static void main(String[] args)throws IOException{
		    BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		    System.out.println("Input: ");
		    int n=Integer.parseInt(br.readLine());
		    if(n%5==0 && n%11==0){
			    System.out.println(n+" is divisible by 5 & 11");
		    }else{
			    System.out.println(n+" is not divisible by 5 & 11");
		    }
	    }	        
}

