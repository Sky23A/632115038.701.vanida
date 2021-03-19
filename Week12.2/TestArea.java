public class TestArea {
    public static void main(String[] args) {
        Area a1 = new Square(2);
        Area a2 = new Rectangle(5,3);
        Area a3 = new Triangle(3,4);

        System.out.println("The Square area is: "+ a1.getArea());
        System.out.println("The Rectangle area is: " + a2.getArea());
        System.out.println("The Triangle area is: " + a3.getArea());
    }
}
