class PrimeMini extends Person{
    String workState;

    public PrimeMini(String name,int bornYear, String workState){
        super(name, bornYear);
        this.workState = workState;
    }

    //overiding method
    public void introduce(){
        super.introduce();
        System.out.println("I'm a prime minister and work in "+workState + ".");
    }
}
