/********************************************
*	DACArecipient Tester
*********************************************
*	PROGRAM DESCRIPTION:
*	This program is to test methods of the DACArecipient class.
*********************************************/
class Main 
{
  public static void main(String[] args) 
	{
    DACArecipient test1 = new DACArecipient();
    DACArecipient test2 = new DACArecipient();
    

    System.out.println("Testing Default Settings:");
    System.out.println(test1);

    
    test2.setAll("Mendez", "Javier", "56-3-445", "Venezuela", 2451564, 3956753, 3956840, 'M');
    DACArecipient test3 = new DACArecipient("Mendez", "Javier", "56-3-445", "Venezuela", 2451564, 3956753, 3956840, 'M');
    
    System.out.println("\nTesting DACArecipient test2 Settings:");
    System.out.println(test2);

    System.out.println("Testing DACArecipient test3 Settings:");
    System.out.println(test3);

    System.out.println("\nDoes DACArecipient test2 information match default DACArecipient information?");
    System.out.println(test2.equals(test1));

    System.out.println("\nDoes DACArecipient test2 information match DACArecipient test3 information?");
    System.out.println(test2.equals(test3));

    System.out.println(test2.printCard());

  }
}