


import java.util.*;
class Program22 {
	    public static void main(String[] args){
		    Scanner sc=new Scanner(System.in);
		    System.out.println("Enter number of units: ");
		    int units=sc.nextInt();
		    double bill=0;		    
		    if(units<100){
			    bill=units*1.20;
		    }else if(units<300){
			    bill=100*1.20+(units-100)*2;
		    }else if(units>300){
			    bill=100*1.20+200*2+(units-300)*3;
		    }
		    System.out.println("The electricity bill for "+units+" is "+bill);
	    }
}


