


import java.io.*;
class Program16{
	    public static void main(String[] args)throws IOException{
		    BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		    System.out.println("Side1: ");  
		    int a=Integer.parseInt(br.readLine());  //input of side1 from user
		    System.out.println("Side2: ");
		    int b=Integer.parseInt(br.readLine());   //input of side2 from user
		    System.out.println("Hypotenuse: ");
		    int h=Integer.parseInt(br.readLine());  //input of hypotenuse from user
		    int pt=a*a+b*b; 
		    //condition for pythagorean theorem
		     if(h*h==a*a+b*b){  
	 		     System.out.println("Triangle satisfies the Pythagorean Theorem");  //satisfies
		     }else{
			     System.out.println("Triangle does not satisfies the Pythagorean Theorem");  //does not satisfy
		     }
	    }
}

