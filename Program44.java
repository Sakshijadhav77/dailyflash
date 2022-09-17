


import java.io.*;
class Program44 {
	    public static void main(String[] args)throws IOException{
		    BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		    System.out.println("Num1");
		    int num1=Integer.parseInt(br.readLine());
		    System.out.println("Num2");
		    int num2=Integer.parseInt(br.readLine());
		    System.out.println("Sign");
		    char sign=(char)br.read();      
		    if(sign=='+'){
			    int add=num1+num2;
			    System.out.println("Addition of "+num1+" & "+num2+" is "+add);
		    }else if(sign=='-'){
			    if(num1>num2){
				    System.out.println("Subtraction of "+num1+" & "+num2+" is "+(num1-num2));
			    }else{
				    System.out.println("Subtraction of "+num1+" & "+num2+" is "+(num2-num1));
			    }
		    }else if(sign=='*'){
			    int multi=num1*num2;
			    System.out.println("Multiplication of "+num1+" & "+num2+" is "+multi);
		    }else if(sign=='/'){
			    if(num1>num2){
				    System.out.println("Division of "+num1+" & "+num2+" is "+(num1/num2));
			    }else{
				    System.out.println("Division of "+num1+" & "+num2+" is "+(num2/num1));
			    }
		    }else if(sign=='%'){
			    int mod=num1%num2;
			    System.out.println("Mod of "+num1+" & "+num2+" is "+mod);
		    }
	    }
}

