//saghi jamal
//sana eslami
import java.awt.Color;

public class Shape {

    protected Color Color;
    protected Pattern Pattern;
    

    public Shape(Color c , Pattern p)
    {
        Color = c;
        Pattern = p;
    }

    public boolean equals(Shape obj) {
        if (obj == null) {
            return false;
        }
        return this.Color == obj.Color && this.Pattern == obj.Pattern;
    }



    public void main(String[] args) {

        Circle c = new Circle(Color.BLUE, Pattern.DOTTED, 10);
        System.out.println(c);

        Square s = new Square(Color.BLUE, Pattern.DOTTED, 10);
        System.out.println(s);
    }
    enum Pattern {
        SOLID, DOTTED, STRIPPED
    }
}

class Circle extends Shape{

    public int Radius;
    
    public Circle(Color c , Pattern p , int r)
    {
        super(c , p);
        Radius = r;
    }

    @Override
    public String toString() {
        return "Circle [color:"+Color+", pattern:"+Pattern+", radius:"+Radius+"]";
    }

    public boolean equals(Circle obj) {
        if (obj == null) {
            return false;
        }
        
        //super.method(parameter)
        return super.equals(obj) && this.Radius == obj.Radius;
    }

    
    
}
class Square extends Shape{

    public int length;

    public Square(Color c , Pattern p , int l)
    {
        super(c, p);
        length = l;
    }

    @Override
    public String toString()
    {
        return "Square [color:"+Color+", pattern:"+Pattern+", length:"+length+"]";
    }

    public boolean equals(Square obj)
    {
        if(obj == null){

            return false;
        }
        return super.equals(obj) && this.length == obj.length;
    } 
}