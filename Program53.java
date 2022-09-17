

import java.io.*;
class Program53 {
	    public static void main(String[] args)throws IOException{
		    BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		    System.out.println("Input:");
		    System.out.print("Distance: ");
		    int dis=Integer.parseInt(br.readLine());
		    System.out.print("Time: ");
		    int time=Integer.parseInt(br.readLine());
								           
		    int v=dis/time;
		    System.out.print("The Velocity of a particle roaming in space is "+v+" m/sec.");
	    }
}

