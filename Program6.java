


import java.io.*;
class Program6{
	    public static void main(String[] args)throws IOException{
		    BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		    System.out.println("Input: ");
		    char ch=(char)br.read();  //taking input from user
		    if(ch>='a'&& ch<='z'||ch>='A'&& ch<='Z'){
			    System.out.println(ch+" is an alphabet");  //is an alphabet
		    }else{            
			    System.out.println(ch+" is not an alphabet"); //not an alphabet
		    }
	    }
}

