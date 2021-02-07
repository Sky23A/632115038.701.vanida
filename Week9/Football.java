class Football extends Person {
    String workState;

    public Football(String name,int bornYear, String workState){
        super(name, bornYear);
        this.workState = workState;
    }

    //overiding method
    public void introduce(){
        super.introduce();
        System.out.println("I'm a football player and work in "+workState + ".");
    }
}
