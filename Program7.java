


import java.io.*;
class Program7 {
	    public static void main(String[] args)throws IOException{
		    BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		    System.out.println("Input");
		    char ch=(char)br.read(); //taking input from user
		    if(ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U'){
			    System.out.println(ch+" is a Vowel");   //is a vowel
		    }else if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'){
			    System.out.println(ch+" is a vowel");  //is a vowel
		    }else{
			    System.out.println(ch+" is not a vowel");  //not vowel
		    }
	    }    
}

