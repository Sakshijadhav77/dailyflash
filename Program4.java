


import java.io.*;

class Program4 {
	    public static void main(String[] args)throws IOException{
		    BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		    System.out.println("Limit: ");
		    int n=Integer.parseInt(br.readLine());
		    for(int i=0;i<=n;i++){
			    for(int j=0;j<=n;j++){
				    System.out.print(" * ");
			    }
			    System.out.println();
		    }
	    }    
}

