


import java.io.*;
class Program48 {
	    public static void main(String[] args)throws IOException{
		    BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		    System.out.println("Limit: ");
		    int lim=Integer.parseInt(br.readLine());

		    for(int i=1;i<=lim;i++){
			    if(i%2==0){
				    System.out.println("Cube of "+i+" : "+i*i*i+" and "+" Square of "+i+" : "+i*i);
			    }
		    }
	    }
}

