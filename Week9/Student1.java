class Student1 extends Person {
    String workState;

    public Student1(String name,int bornYear, String workState){
        super(name, bornYear);
        this.workState = workState;
    }

    //overiding method
    public void introduce(){
        super.introduce();
        System.out.println("I'm a student and study in "+workState + ".");
    }
}
