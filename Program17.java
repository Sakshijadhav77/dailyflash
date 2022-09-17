



import java.io.*;
class Program17 {
	    public static void main(String[] args)throws IOException{
		            BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
			            System.out.println("P: ");
				            int p=Integer.parseInt(br.readLine());  //Principal
					            System.out.println("R: ");
						            int r=Integer.parseInt(br.readLine());  //Rate
							            System.out.println("T: ");
								            int t=Integer.parseInt(br.readLine());  //Time Period

									            int si=(p*r*t)/100;  
										            System.out.println("Simple Interest= "+si);  //Simple Interest
											        }
}

