


import java.io.*;
class Program64 {
	    public static void main(String[] args)throws IOException{
		    BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		    System.out.print("Input: ");
		    int num=Integer.parseInt(br.readLine());
		    System.out.print("Enter number: ");
		    int endpt=Integer.parseInt(br.readLine());

		    int val;
		    for(int i=0;i<=num;i++){
			    for(int j=0;j<=i;j++){
				    val=endpt;  
				    val=num;            
				    System.out.print(val+" ");
				    val--;

			    }   
			    num=val++;       
			    System.out.println();
		    }
	    }
} 

