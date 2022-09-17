


import java.io.*;
class Program20 {
	    public static void main(String[] args)throws IOException{
		    BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		    System.out.println("Percentage: ");
		    int per=Integer.parseInt(br.readLine());  //percentage from user
		    if(per>=90){
			    System.out.println("Grade A");  //grade A
		    }else if(per>=80){
			    System.out.println("Grade B");  //grade B
		    }else if(per>=70){
			    System.out.println("Grade C");   //grade c
		    }else if(per >=60){
			    System.out.println("Grade D");   //grade D
		    }else if(per >=40){
			    System.out.println("Grade E");   //grade E
		    }else if(per >=30){
			    System.out.println("Grade F");  //grade F
		    }
	    }
}





