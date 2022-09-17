


import java.io.*;
class Program43 {
	    public static void main(String[] args)throws IOException{
		    BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		    System.out.println("Num1");
		    int num1=Integer.parseInt(br.readLine());
		    System.out.println("Num2");
		    int num2=Integer.parseInt(br.readLine());
		    int add=(num1*num1*num1)+(num2*num2*num2);
		    System.out.println("Addition is "+add);
		    if(num1>num2){
			    System.out.println("Subtraction is "+((num1*num1)-(num2*num2)));
		    }else{
			    System.out.println("Subtraction is "+((num2*num2)-(num1*num1)));
		    }
	    }

}

