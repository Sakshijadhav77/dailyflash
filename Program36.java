


import java.io.*;
class Program36{
	    public static void main(String[] args)throws IOException{
		    BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		    System.out.println("Limit: ");
		    int num=Integer.parseInt(br.readLine());
		    int sq=1;
		    for(int i=1;i<=num;i++){
			    System.out.println("Square of "+i+": "+sq*sq);
			    sq++;
		    }
	    }
}
