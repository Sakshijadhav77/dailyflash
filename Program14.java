


import java.io.*;
class Program14 {
	    public static void main(String[] args)throws IOException{
		    BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		    System.out.println("Limit: ");
		    int lim=Integer.parseInt(br.readLine());  //Limit
		    int num=Integer.parseInt(br.readLine()); //Number
		    for(int i=num;i<=lim;i++){ //Row
			    int x=num;  
			    for(int j=num;j<=lim;j++){  //Column
				    System.out.print(x+" ");
				    x++;
			    }
			    System.out.println();  
		    }
	    }
}

