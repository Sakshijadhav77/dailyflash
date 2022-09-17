


import java.io.*;
class Program74 {
	    public static void main(String[] args)throws IOException{
		    BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		    System.out.println("Limit: ");
		    int lim=Integer.parseInt(br.readLine());
		    System.out.println("Enter end number: ");
		    int endpt=Integer.parseInt(br.readLine());
							            
		    int val=endpt;
		    for(int i=1;i<=lim;i++){
			    int num=val;
			    for(int j=1;j<=i;j++){
				    System.out.print(val+" ");
				    val--;
			    }
			    num=val++;
			    System.out.println();
		    }
	    }
}

