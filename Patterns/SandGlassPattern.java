
public class SandGlassPattern
{
  public static void main(String[] args)
  {
    // Number of rows in the first and second half 
    // of Sandglass pattern
    int num = 5; 

    //This outer loop Prints the first half of the pattern
    for (int i= 0; i<= num-1 ; i++)
    {
      
      for (int j=0; j<i; j++)
      {
        System.out.print(" ");
      }
      //Prints stars and the whitespaces in between them
      for (int k=i; k<=num-1; k++)
      {
        System.out.print("*" + " ");
      }
     
      System.out.println();
    }
    //This Outer loop Prints the second half of the pattern
    for (int i= num-1; i>= 0; i--)
    {
  
      for (int j=0; j<i; j++)
      {
        System.out.print(" ");
      }
  
      for (int k=i; k<=num-1; k++)
      {
        System.out.print("*" + " ");
      }

      System.out.println();
    }
  }
}  
