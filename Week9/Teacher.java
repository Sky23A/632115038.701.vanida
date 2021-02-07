class Teacher extends Person {
    String workState;

    public Teacher(String name,int bornYear, String workState){
        super(name, bornYear);
        this.workState = workState;
    }

    //overiding method
    public void introduce(){
        super.introduce();
        System.out.println("I'm a teacher and work in "+workState + ".");
    }
    
}
