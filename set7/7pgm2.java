
class Rectangle
{
 int length;
 int breadth;
 Rectangle()
 {
  length=20;
  breadth=25;
 }
 void display()
 {
  System.out.println("Length="+length);
  System.out.println("Breadth="+breadth);
 }
}

class Rect
{
 public static void main(String args[])
 {
  Rectangle r1=new Rectangle();
  r1.display();  
 }
}
