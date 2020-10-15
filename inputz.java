import java.io.BufferedReader;                                                           //importing classes//
import java.io.IOException; 
import java.io.InputStreamReader;
import java.util.Scanner;


//This class is to demonstrate BufferedReader// 
class a1  
{ 
    public void buffer()                                                                  //method for taking input by using buffer reader class // 
    throws IOException
    { 	
	System.out.println("_______________________________________________________________________________________________________________________");  //This is used only to beautify the programm//
	System.out.println("\n");
	System.out.println("This number entered by buffer reader");
        BufferedReader inp = new BufferedReader (new InputStreamReader(System.in));       //Creating object of bufferreader class and  new keyword is for dynamically allocation //
	System.out.print("Enter the number=> ");
	int T= Integer.parseInt(inp.readLine());                                          //for taking a int type  as an input  // 
	System.out.println("The number entered is=> "+T);
	System.out.println("_______________________________________________________________________________________________________________________");
	System.out.println("\n");
      
    } 
} 

//This class is to demonstrate Scanner// 

class a2
{
	public void scanner()                                                         //method for taking input by using buffer scanner class // 
	{
		System.out.println("This number entered by scanner");
		Scanner sc = new Scanner(System.in);                                     //Creating object of scanner class and  new keyword is for dynamically allocation //                                    
		System.out.print("Enter the no => ");
		int num = sc.nextInt();                                                  //for taking a int type  as an input // 
		System.out.print("\n");
		System.out.println("The no entered is => "+num);
		System.out.println("_______________________________________________________________________________________________________________________");
		System.out.println("\n");
	}
}


//This class is to demonstrate Console// 

class a3
{
    public void console()  
    {   
	System.out.println("This number entered by console");
	System.out.print("Enter your name => ");
        String name = System.console().readLine();                                      // Using Console to input data from user directly and it only takes string as an output typecasting is prohibited//
	System.out.println("Your name  is => "+name);
	System.out.println("_______________________________________________________________________________________________________________________");
	System.out.println("\n");
    } 
}



//This is main class//

class inputz
{	
	public static void main(String[] args)
	throws IOException
	{										//creating objects of classes//
		a1 a = new a1();						
		a2 b = new a2();
		a3 c = new a3(); 
		
											//calling functions of their respective classes//
		a.buffer();                                                      
		b.scanner();
		c.console();
	}  
	
}