


import java.io.*;
class Program30 {
	    public static void main(String[] args)throws IOException{
		    BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		    System.out.println("limit: ");
		    int lim=Integer.parseInt(br.readLine());
		    for(int i=0;i<=lim;i++){
			    int num=0;
			    for(int j=0;j<=lim;j++){
				    System.out.print(num+" ");
			    }
			    System.out.println();
		    }
	    }
}

