


import java.io.*;

class Program65{
	    public static void main(String[] args)throws IOException{
		    BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		    System.out.println("Date: ");
		    int date=Integer.parseInt(br.readLine());
		    System.out.println("Month: ");
		    int month=Integer.parseInt(br.readLine());
		    System.out.println("Year: ");
		    int year=Integer.parseInt(br.readLine());

		    switch(month){
			    case 1:
				    if(date<=31){
					    System.out.println(date+" - "+month+" - "+year);
				    }else{
					    System.out.println("Invalid day");
				    }
				    break;

			    case 2:
				    if(year%4==0){
					    if(date<=29){
						    System.out.println(date+" - "+month+" - "+year);
					    }
				    }else if(date>29){
					    System.out.println("Date doesn't exist");   
				    }else if(year%4!=0){
					    if(date<=28){
						    System.out.println(date+" - "+month+" - "+year);
					    }
				    }else{
					    System.out.println("Invalid day");
				    }
				    break;

			
			    case 3:
				    if(date<=31){
					    System.out.println(date+" - "+month+" - "+year);
				    }else{
					    System.out.println("Invalid day");
				    }
				    break;

			
			    case 4:
				    if(date<=30){
					    System.out.println(date+" - "+month+" - "+year);
				    }else{
					    System.out.println("Invalid day");
				    }
				    break;

			    case 5:
				    if(date<=31){
					    System.out.println(date+" - "+month+" - "+year);
				    }else{
					    System.out.println("Invalid day");
				    }
														
				    break;
			
			    case 6:
				    if(date<=30){
					    System.out.println(date+" - "+month+" - "+year);
				    }else{
					    System.out.println("Invalid day");
				    }
				    break;

		
			    case 7:
				    if(date<=31){
					    System.out.println(date+" - "+month+" - "+year);
				    }else{
					    System.out.println("Invalid day");
				    }
				    break;

			
			    case 8:
				    if(date<=31){
					    System.out.println(date+" - "+month+" - "+year);
				    }else{
					    System.out.println("Invalid day");
				    }
				    break;

			    case 9:
				    if(date<=30){
					    System.out.println(date+" - "+month+" - "+year);
				    }else{
					    System.out.println("Invalid day");
				    }
				    break;

			    case 10:
				    if(date<=31){
					    System.out.println(date+" - "+month+" - "+year);
				    }else{
					
					    System.out.println("Invalid day");
				
				    }
				    break;
			
			    case 11:
				    if(date<=30){
					    System.out.println(date+" - "+month+" - "+year);
				    }else{
					    System.out.println("Invalid day");
				    }
				    break;
				
			    case 12:
				    if(date<=31){
					    System.out.println(date+" - "+month+" - "+year);
				    }else{
					    System.out.println("Invalid day");
				    }
				    break;

			
			    default:
				    System.out.println("Invalid month");
				    break;
		    }
	    }
}
