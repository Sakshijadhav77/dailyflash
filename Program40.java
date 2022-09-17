


import java.io.*;
class Program40 {
	    public static void main(String[] args)throws IOException{
		    BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		    System.out.println("Limit: ");
		    int lim=Integer.parseInt(br.readLine());
		    int num=0;
		    for(int i=0;i<=lim;i++){
			    for(int j=0;j<=i;j++){
				    System.out.print(num+" ");
				    num++;
			    }
			    System.out.println();
		    }
	    }
}

