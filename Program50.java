


import java.io.*;
class Program50 {
	    public static void main(String[] args)throws IOException{
		    BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		    System.out.println("Input: ");
		    int num1=Integer.parseInt(br.readLine());
		    int num2=Integer.parseInt(br.readLine());

		    if(num1>num2){
			    int max=num1;
			    System.out.println("Maximum number amongst "+num1+" & "+num2+" is "+max);
		    }else{
			    int max=num2;
			    System.out.println("Maximum number amongst "+num2+" & "+num1+" is "+max);

																            }
	    }
}

