



import java.io.*;
class Program15 {
	    public static void main(String[] args)throws IOException{
		    BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		    System.out.println("Angles of triangle: ");
		    int a=Integer.parseInt(br.readLine());  //Angle1
		    int b=Integer.parseInt(br.readLine());  //Angle2
		    int c=Integer.parseInt(br.readLine());   //Angle3
		    int sum=a+b+c;  //sum of all three angles
		    if(sum==180){
			    System.out.println("The triangle with angles "+a+" "+b+" "+c+" "+" is a valid one");  //valid triangle
		    }else{
			    System.out.println("The triangle with angles "+a+" "+b+" "+c+" "+" is a invalid one");  //invalid triangle
		    }
	    }
}

