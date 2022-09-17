

import java.io.*;
class Program51{
	    public static void main(String[] args)throws IOException{
		    BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		    System.out.print("Min of Series: ");
		    int num1=Integer.parseInt(br.readLine());
		    System.out.print("Max of Series: ");
		    int num2=Integer.parseInt(br.readLine());

		    System.out.print("Series of Even Numbers Ranging between "+num1+" & "+num2+" is: ");
		    int i;
		    for(i=num1;i<=num2;i++){
			    if(i%2==0){
				    System.out.print(i+" ");
			    }
		    }

	    }
}
