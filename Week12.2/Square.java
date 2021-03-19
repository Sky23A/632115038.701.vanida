public class Square extends Area {
    //Equal every where
    
    private double height;
    public Square() {

    }

    public Square( double height) {
        this.height = height;
    }

    public double getArea() {
        return height*height;
    }

}
