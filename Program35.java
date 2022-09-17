


import java.io.*;
class Program35 {
	    public static void main(String[] args)throws IOException{
		    int x=0;
		    int y=1;
		    BufferedReader br=new BufferedReader(new InputStreamReader(System.in));        
		    System.out.println("limit: ");
		    int lim=Integer.parseInt(br.readLine());		
		    for(int i=0;i<=lim;i++){
			    for(int j=0;j<=lim;j++){
				    if(i%2==0){
					    System.out.print(x+" ");                    
				    }else{
					    System.out.print(y+" ");                   
				    }
			    }
			    System.out.println();
		    }
	    }
}

