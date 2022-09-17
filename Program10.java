



import java.io.*;
class Program10 {
	    public static void main(String[] args)throws IOException{
		    BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		    System.out.println("Input: ");  //number from user
		    int num1=Integer.parseInt(br.readLine());  //number1
		    int num2=Integer.parseInt(br.readLine());  //number2
		    int num3=Integer.parseInt(br.readLine());   //number3
		    if(num1>num2){
			    System.out.println(num1+" is max number among "+num1+" "+num2+" "+num3); //number1 is max
		    }else if(num2>num3){
			    System.out.println(num2+" is max number among "+num1+" "+num2+" "+num3);  //number2 is max
		    }else{
			    System.out.println(num3+" is max number among "+num1+" "+num2+" "+num3);   //number3 is max
		    }
	    }
}

