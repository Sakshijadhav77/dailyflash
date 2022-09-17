


import java.io.*;
class Program39{
	    public static void main(String[] args)throws IOException{
		    BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		    System.out.println("Limit: ");
		    int lim=Integer.parseInt(br.readLine());
		    System.out.println("Number: ");
		    int num=Integer.parseInt(br.readLine());
		    int sq=1;
		    for(int i=1;i<=lim;i++){
			    int prod=sq*num;
			    System.out.print(prod+" ");
			    sq++;
		    }
	    }
}
