import java.util.Scanner;
public class InherBicycle {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("This is the Normal Bicycle");
        System.out.println("Enter the current speed: ");
        int current = scan.nextInt();
        firstBicycle Set1 = new firstBicycle(current,5,5);
        Set1.isBicycle();
        Set1.isFirst();
        
        System.out.println("This is the Mountain Bicycle");
        Scanner scan2 = new Scanner(System.in);
        System.out.println("Enter the gear: ");
        int gear = scan2.nextInt(); 
        MountainBi Set2 = new MountainBi(current, 5, 0, gear);
        Set2.isBicycle();
        Set2.isMountain();
    }
}
