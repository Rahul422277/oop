abstract class Shape 
{  
    double base; 
                   double hgt; 
          Shape(double b , double h) 
 { 
    base = b; 
  hgt = h; 
            } 
         abstract double shapeArea(); 
         public void display() 
 { 
        System.out.println("dimenstions are " + base  + " ," +hgt); 
  }      
} 
abstract class Shape 
{  
    double base; 
                   double hgt; 
          Shape(double b , double h) 
 { 
    base = b; 
  hgt = h; 
            } 
         abstract double shapeArea(); 
         public void display() 
 { 
        System.out.println("dimenstions are " + base  + " ," +hgt); 
  }      
} 
    class Triangle extends Shape 
{ 
    Triangle(double b , double h) 
             { 
                super(b,h); 
  }  
 double shapeArea() 
 { 
   return(0.5*base*hgt); 
            } 
 } 
 
class Rectangl extends Shape 
{ 
    Rectangl (double b , double h) 
                           { 
                super(b,h); 
  }  
 
  double shapeArea() 
                  { 
   return(base*hgt); 
                                } 
} 
 
 
public class AreaDemo 
{ 
   public static void main(String args[]) 
 { 
                  Shape t = new Triangle(34.5,89.75);  //upcasting 
      t.display(); 
      System.out.println("The area of triangle is "+t.shapeArea()); 
    
      Shape r = new Rectangl(34.5 , 75);  //upcasting 
      r.display(); 
      System.out.println("The area of Rectangle is "+r.shapeArea()); 
 
             } 
 
} 
 
