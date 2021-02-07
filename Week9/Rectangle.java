 class Rectangle extends Shape{
   int height, width;
   
	public Rectangle(int height, int width){
       this.height = height;
       this.width = width;
    }
	/** Returns a self-descriptive string */   
    public String toString() {
       return "This is a rectangle with width as ["+ width + "] and height as [ " + height+ "]";
    }
   
}
