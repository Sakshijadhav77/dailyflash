


import java.io.*;
class Program59 {
	    public static void main(String[] args)throws IOException{
		    BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		    int n=Integer.parseInt(br.readLine());

		    int num=1;
		    for(int i=1;i<=n;i++){
			    for(int j=1;j<=i;j++){
				    int val=num*num*num;
				    System.out.print(val+" ");
				    num++
			    }
			    System.out.println();
		    }
	    }
}

