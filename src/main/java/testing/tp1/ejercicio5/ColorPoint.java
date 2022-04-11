package testing.tp1.ejercicio5;


public class ColorPoint extends Point 
{
   private Color color;
 
   public ColorPoint(int x, int y, Color color) { 
      super (x,y);
      this.color=color; 
   } 

   @Override 
   public boolean equals(Object o) { 
      if (!(o instanceof ColorPoint)) return false;
      ColorPoint cp = (ColorPoint) o;
      return (super.equals(cp) &&  (cp.color == this.color));
   }
}

enum Color { RED, WHITE, BLUE }
