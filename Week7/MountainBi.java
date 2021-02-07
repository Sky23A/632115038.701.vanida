public class MountainBi extends Bicycle{

    public MountainBi(int current, int speedUp, int brake, int gear) {
        this.current = current;
        this.brake = brake;
        this.speedUp = speedUp;
        this.gear = gear;
   }
   public void isMountain(){
    if(current<100){
        System.out.println("Current speed is : "+current);
        int answer = current-brake;// break not work on gear
        System.out.println("-used break-");
        System.out.println("Current speed is : "+answer);
        int answer2 = answer + speedUp*gear;
        System.out.println("- Speed up afthe break-");
        System.out.println("current speed is : "+answer2);
        }
        else{
            System.out.print("Please try again ");
        }
   }
}
