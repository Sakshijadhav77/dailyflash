


import java.io.*;
class Program38{
	    public static void main(String[] args)throws IOException{
		    BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		    System.out.println("Limit: ");
		    int num=Integer.parseInt(br.readLine());
		    int sq=1;
		    for(int i=2;i<=num;i++){
			    System.out.print(sq*2+" ");
			    sq++;
		    }
	    }
}
