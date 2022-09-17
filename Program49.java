


import java.io.*;
class Program49 {
	    public static void main(String[] args)throws IOException{
		    BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		    System.out.println("Limit: ");
		    int lim=Integer.parseInt(br.readLine());

		    for(int i=0;i<lim;i++){
			    for(int j=0;j<=i;j++){
				    if(i%2==0){
					    System.out.print("a"+" ");
				    }else{
					    System.out.print("A"+" ");
				    }
			    }
			    System.out.println();
		    }
	    }
}

