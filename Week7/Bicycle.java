import java.util.Scanner;

public class Bicycle {

    int current;
    int brake;
    int speedUp;
    int gear;
    public Bicycle(){
        //
    }

public Bicycle(int current , int brake , int speedUp ,int gear){
    this.current = current;
    this.brake = brake;
    this.speedUp = speedUp;
    this.gear = gear;
}
public void isBicycle(){
    
    if(current<100){
        System.out.println(" ");
    }
}
}