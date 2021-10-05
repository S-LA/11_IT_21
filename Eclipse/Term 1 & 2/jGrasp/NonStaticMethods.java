import it.Gogga;
public class NonStaticMethods{
   public static void main(String[] args){
      /*
      * non-static methods belong to a specific object
      * They require instantiation of an object
      *  "Something some = new Something();"
   //       */
      Gogga.setGridSize(15,15);
      Gogga bug = new Gogga();
      Gogga parky = new Gogga();
      int dir = bug.getDirection();
      System.out.println(dir);
      if(dir==2){
         bug.turnLeft();
         bug.move();
         System.out.println(bug.getDirection());
      }
      
      
      int currentX = bug.getXPos();
      System.out.println(currentX);
      
      bug.turnRight();
      while(bug.getXPos()!=13){
         bug.move();
      }
      
     
      
   }
}