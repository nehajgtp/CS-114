public class Assignment5
{
   public static void main(String arg[])
   {
      BinarySearchTree5 b1 = new BinarySearchTree5();

      b1.insert(5);   
      b1.insert(3);
      b1.insert(2);
      b1.display();
      System.out.println();
      BinarySearchTree5 b2 = b1; //shallow copy
      BinarySearchTree5 b3 = b1.clone(); //deep copy
      b1.insert(7);
      b1.display();
      System.out.println();
      b2.display();
      System.out.println();
      b3.display();
      
      
      

   }
}