


import java.io.*;
class Program25 {
	    public static void main(String[] args)throws IOException{
		    BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		    System.out.println("Input: ");
		    char ch=(char)br.read();   //input
		    if(ch>='A'&&ch<='Z'||ch>='a'&&ch<='z'){   
			    int num=ch;   //storing values
			    System.out.println("ASCII value of "+ch+" is "+num);   //ASCII value
		    }else{
			    System.out.println("Invalid character");  //invalid 
		    }
	    }
}

