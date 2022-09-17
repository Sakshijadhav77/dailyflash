


import java.io.*;

class Program2 {
	    public static void main(String[] args)throws IOException{
	 	    BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		    System.out.println("Input: ");
		    int n=Integer.parseInt(br.readLine());

		    if(n<0){
			    System.out.println(n+" is the negative number");
		    }else if(n>0){
			    System.out.println(n+" is the positive number");
		    }else if(n==0){
			    System.out.println(n+" is zero");
		    }
	    }  
}

