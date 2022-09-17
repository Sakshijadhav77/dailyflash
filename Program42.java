


import java.io.*;
class Program42{
	    public static void main(String[] args)throws IOException{
		    BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		    System.out.println("Num1: ");
		    int num1=Integer.parseInt(br.readLine());
		    System.out.println("Num2: ");
		    int num2=Integer.parseInt(br.readLine());
		    int multi=num1*num2;
		    System.out.println("Multiplication of "+num1+" + "+num2+" = "+multi);
		    if(num1>num2){
			    System.out.println("Division is "+num1/num2);
		    }else{
			    System.out.println("Division is "+num2/num1);
		    }
	    }
}
