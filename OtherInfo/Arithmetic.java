 public class Arithmetic
   {
   
      private double num1, num2;
   
      public Arithmetic () // Ex 2.2.1
      {
         num1 = 0;
         num2 = 0;
      }
   
   
      public Arithmetic (double n1, double n2) // Ex 2.2.2
      {
         num1 = n1;
         num2 = n2;
      }
      
      public void display() // Ex 2.2.3 - (Must be removed for Exercise 5 No 2)
      {
         System.out.println("Num 1: " + num1 + " Num 2: " + num2);
      }
   
   
      public void setNum1 (double n1) // Ex 2.3.1
      {
         num1 = n1;
      }
   
   
      public void setNum2 (double n2) // Ex 2.3.1
      {
         num2 = n2;
      }
   
   
      public double getNum1 () //Exercise 3
      {
         return num1;
      }
   
   
      public double getNum2 () //Exercise 3
      {
         return num2;
      }
   
   
      public double add () //Activity 11
      {
         return num1 + num2;
      }
    
      public double subtract () //Exercise 4 No 1
      {
         return num1 - num2;
      }
   
      public double multiply () //Exercise 4 No 2
      {
         return num1 * num2;
      }
   
      public double divide () throws ArithmeticException //Exercise 4 No 2
      {
          if (num2 == 0){
              //System.out.println("Error: Can not divide by zero"); // Ex4 No 2.1
              throw new ArithmeticException();
          }   
          else{
              return num1 / num2;
          }
      }
   	
      
   
      public String toString() //Exercise 5
      {
         return "Num 1: " + num1 + "\nNum 2: " + num2;
      }
   	    
   } // Arithmetic class