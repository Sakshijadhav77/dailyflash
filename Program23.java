


import java.util.*;
class Program23 {
	    public static void main(String[] args){
		    Scanner sc=new Scanner(System.in);
		    System.out.println("Age: ");  
		    int age=sc.nextInt();   //age of user
		    System.out.println("Sex: ");
		    char sex=sc.next().charAt(0);   //sex of user
		    System.out.println("Marital Status: ");
		    char ms=sc.next().charAt(0);   //marital status of user
		    if(sex=='F'){
			    System.out.println("Will work only in urban areas.");  //for female
		    } if(sex=='M'){
			    if((age >= 20)&&(age<=40)){  
				    System.out.println("May work anywhere.");   //for male whose age lies between 20 and 40
			    }else if((age>=40)&&(age<=60)){
				    System.out.println("Will work only in urban areas.");  //for male whose age lies between 40 and 60
			    }else{
				    System.out.println("ERROR!");  
			    }
		    }
	    }

}

