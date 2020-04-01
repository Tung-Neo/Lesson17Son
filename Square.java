package Lesson17.Lesson17Son;

public class Square extends Rectangle{
    public Square(){
        super();
    }
    public Square(double side){
        super(side, side);
    }
    public Square(double side, String color, boolean filled){
        super(side, side, color, filled);
    }
    public double getSide(){
        return this.getSide();
    }
    public void setSide(double side){
        setSide(side);
    }
    public void setWidth(double side){
        setWidth(side);
    }
    public void setLength(double side){
        setWidth(side);
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
