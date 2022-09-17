


import java.io.*;
class Program56{
	    public static void main(String[] args)throws IOException{
		    BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		    System.out.println("Input: ");
		    int n=Integer.parseInt(br.readLine());
		    int sum=1;
		    for(int i=2;i<n;i++){
			    if(n%i==0){
				    sum+=i;
			    }
		    }
		    if(sum==n){
			    System.out.println("Given number is a perfect number.");
		    }else{
			    System.out.println("Given number is not a perfect number.");
		    }

	
	    }
	    int divisor (int x){
		    return x;
	    }
}
