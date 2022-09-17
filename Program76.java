


import java.io.*;
class Program76{
	    public static void main(String[] args)throws IOException{
		    BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		    System.out.print("Input: ");
		    int num=Integer.parseInt(br.readLine());
		    System.out.print("Limit: ");
		    int lim=Integer.parseInt(br.readLine());

		    for(int i=1;i<=lim; i=i+num){
			    System.out.print(i+" ");

		    }
	    }
}
