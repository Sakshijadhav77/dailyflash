


import java.io.*;
class Program41{
	    public static void main(String[] args)throws IOException{
		    BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		    System.out.println("Num1: ");
		    int num1=Integer.parseInt(br.readLine());
		    System.out.println("Num2: ");
		    int num2=Integer.parseInt(br.readLine());
		    int add=num1+num2;
		    System.out.println("Addition of "+num1+" + "+num2+" = "+add);
		    if(num1>num2){
			    System.out.println("Subtraction of "+num1+" - "+num2+" = "+ (num1-num2));
		    }else{
			    System.out.println("Subtraction of "+num2+" - "+num1+" = "+ (num2-num1));
		    }
	    }
}
