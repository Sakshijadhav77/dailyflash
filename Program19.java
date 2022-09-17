

import java.io.*;
class Program19 {
	    public static void main(String[] args)throws IOException{
		    BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		    System.out.println("Limit: ");
		    int lim=Integer.parseInt(br.readLine());  //limit from user
		    System.out.println("Input: ");
		    int num=Integer.parseInt(br.readLine());  //input from user
		    int x=num;
		    for(int i=num;i<=lim;i++){  //row
			    for(int j=num;j<=lim;j++){   //column
				    System.out.print(x+" ");
				    x++;
			    }
			    System.out.println();
		    }
	    }
}





