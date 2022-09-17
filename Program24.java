


import java.io.*;
class Program24 {
	    public static void main(String[] args)throws IOException{
		    BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		    System.out.println("Limit: ");
		    int lim=Integer.parseInt(br.readLine());  //limit of loop
		    System.out.println("Input: ");
		    int num=Integer.parseInt(br.readLine());  //input
		    for(int i=num;i<=lim;i++){  //row
			    int x=num;   //storing of values
			    for(int j=num;j<=lim;j++){  //column
				    System.out.print(x+" ");
				    x+=2;   //increment by 2
			    }
			    System.out.println();  
		    }

	    }
}

