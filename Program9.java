



import java.io.*;
class Program9 {
	    public static void main(String[] args)throws IOException{
		    BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		    System.out.println("Limit: ");
		    int m=Integer.parseInt(br.readLine());  //taking limit from user
		    System.out.println("Number: ");
		    int n=Integer.parseInt(br.readLine());  //taking number from user
		    for(int i=0;i<=m;i++){  //rows
			    for(int j=0;j<=m;j++){   //columns
				    System.out.print(n);
			    }
			    System.out.println();
		    }
	    }
}

