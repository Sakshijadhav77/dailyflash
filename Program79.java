


import java.io.*;
class Program79 {
	    public static void main(String[] args)throws IOException{
	            BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		    System.out.print("lim: ");
		    int lim=Integer.parseInt(br.readLine());
		    System.out.print("startpt: ");
		    int startpt=Integer.parseInt(br.readLine());

	
		    for(int i=1;i<=lim;i++){
			    int num=startpt;
			    for(int j=1;j<=i;j++){
				    System.out.print(startpt+" ");
				    startpt--;
			    }
			    num=startpt++;
			    System.out.println();
		    }
	    }
}

