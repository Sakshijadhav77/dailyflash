


import java.io.*;
class Program54 {
	    public static void main(String[] args)throws IOException{
		    BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		    System.out.println("Limit: ");
		    int lim=Integer.parseInt(br.readLine());

		    int num=1;
		    for(int i=1;i<=lim;i++){
			    for(int j=1;j<=i;j++){
				    System.out.print(num*num+" ");
				    num++;
			    }
			    System.out.println();
		    }
	    }
}

