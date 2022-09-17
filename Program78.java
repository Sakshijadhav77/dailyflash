


import java.io.*;
class Program78 {
	    public static void main(String[] args)throws IOException{
	            BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		    System.out.print("lim: ");
		    int lim=Integer.parseInt(br.readLine());
		    System.out.print("End char: ");
		    char ch=(char)br.read();

		    for(int i=lim;i>=0;i--){
			    for(int j=0;j<=i;j++){
				    System.out.print(ch+" ");
			    }
			    ch++;
			    System.out.println();
		    }
	    }
}

