

import java.io.*;
class Program11{
	    public static void main(String[] args)throws IOException{
		    BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		    System.out.println("Input: ");
		    char ch=(char)br.read();  //taking input from user
		    if(ch>='a'&&ch<='z'){
			    System.out.println(ch+" is in lowercase");  //lowercase
		    }else if(ch>='A'&&ch<='Z'){
			    System.out.println(ch+" is in uppercase");   //uppercase
		    }
	    }
}

