


import java.io.*;
class Program33 {
	    public static void main(String[] args)throws IOException{
		    BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		    System.out.println("input: ");
		    int num=Integer.parseInt(br.readLine());
		    if(num%2==0){
			    System.out.println(num+" is an even number");
		    }else {
			    System.out.println(num+" is a odd number");
		    }
	    }
}

