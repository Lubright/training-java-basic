package exercise.ex1_Interface;

public class Shark extends Fish{

    public Shark() {
        super("");
    }
    public Shark(String name) {
        super(name);
    }

    @Override
    public void swim() {
        System.out.println(this.getClass().getName() + "; " + this.getName() + " is swimming.");
    }
}
