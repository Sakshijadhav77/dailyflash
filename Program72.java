


import java.io.*;
class Program72 {
	    public static void main(String[] args)throws IOException{
		    BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		    System.out.println("Mass: ");
		    int mass=Integer.parseInt(br.readLine());
		    System.out.println("Velocity: ");
		    int velocity=Integer.parseInt(br.readLine());

		    double ke=0.5*mass*velocity*velocity;
		    System.out.println("Kinetic Energy of that Object is: "+ke);
	    }
}

