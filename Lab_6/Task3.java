class Shape {
    public double volume;
    public double getVolume(){
        return volume;
    }
}

class SolidOfRevolution extends Shape{
    public double radius;
    public double getRadius(){
        return radius;
    }
}

class Pyramid extends Shape{
    public double s;
    public double h;
}

class Cylinder extends SolidOfRevolution{
    double height;
}

class Ball extends SolidOfRevolution{

}
public class Task3 {

}
