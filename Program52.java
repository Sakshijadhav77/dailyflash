

import java.io.*;
class Program52 {
	    public static void main(String[] args)throws IOException{
		    BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		    System.out.print("Input: ");
		    int num1=Integer.parseInt(br.readLine());
		    int num2=Integer.parseInt(br.readLine());

		    if(num1<num2){
			    int min=num1;
			    System.out.println("The minimum number amongst "+num1+" & "+num2+" is "+min);
		    }else{
			    int min=num2;
			    System.out.println("The minimum number amongst "+num2+" & "+num1+" is "+min);
		    }
	    }
}

