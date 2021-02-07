public class firstBicycle extends Bicycle {
    public firstBicycle(int current ,int speedUp ,int brake){
         this.current = current;
        this.brake = brake;
        this.speedUp = speedUp;
    }
    public void isFirst(){
        if(current<100){
        System.out.println("Current speed is : "+current);
        int answer = current-brake;
        System.out.println("-used break-");
        System.out.println("Current speed is : "+answer);
        int answer2 = answer + speedUp;
        System.out.println("- Speed up afthe break-");
        System.out.println("current speed is : "+answer2);
        System.out.println(" ");
        }
        else{
            System.out.print("Please try again ");
        }
        
    }
}
