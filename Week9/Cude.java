public class Cude extends Rectangle{
    int length;
    
	public Cude(int height, int width,int length) {
        super(width , height);
        this.length =length;
     }
	/** Returns a self-descriptive string */   
   public String toString() {
    return "This is a cube with the side of ["+length+"]";
 }
 
}
