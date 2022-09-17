


import java.io.*;
class Program8 {
	    public static void main(String[] args)throws IOException{
		    BufferedReader br=new BufferedReader(new InputStreamReader(System.in));  
		    System.out.println("Input: ");
		    char str=(char)br.read();   //taking input from user
		    if(str>=65 && str<=90||str>=97 && str<=122){  
			    System.out.println(str+" is an alphabet");   //is an alphabet
		    }else if(str>=32&&str<=47||str>=58&&str<=64||str>=91&&str<=96||str>=123&&str<=126){ 
			    System.out.println(str+" is a special character");  //is a special character
		    }
	    }
}

