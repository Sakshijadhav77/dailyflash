


import java.io.*;
class Program29 {
	    public static void main(String[] args)throws IOException{
		    BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		    System.out.println("limit: ");
		    int lim=Integer.parseInt(br.readLine());
		    for(int i=1;i<=lim;i++){
			    int num=i;
			    if(num%2==0){
				    System.out.print(num+" ");
				    num++;
			    }     
		    }
	    }
}

