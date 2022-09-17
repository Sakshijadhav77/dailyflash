


import java.io.*;
class Program55 {
	    public static void main(String[] args)throws IOException{
		    BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		    System.out.println("Input: ");
		    int num1=Integer.parseInt(br.readLine());
		    int num2=Integer.parseInt(br.readLine());
		    int num3=Integer.parseInt(br.readLine());

		    if(num1>num3 && num1>num2){
			    int max=num1;
			    System.out.print("The maximum number amongst "+num1+" "+num2+" & "+num3+" is "+max);
		    }else if(num2>num1 && num2>num3){
			    int max=num2;
			    System.out.print("The maximum number amongst "+num1+" "+num2+" & "+num3+" is "+max);
		    }else if(num3>num1 && num3>num2){
			    int max=num3;
			    System.out.print("The maximum number amongst "+num1+" "+num2+" & "+num3+" is "+max);
		    }

	    }
}

