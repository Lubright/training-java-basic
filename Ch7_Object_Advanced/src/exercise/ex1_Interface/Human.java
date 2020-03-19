package exercise.ex1_Interface;

public abstract class Human implements Swimmable {
    protected String name;

    public Human(){
        this("");
    }
    public Human(String name) {
        this.name = name;
    }

    @Override
    public void swim() {
        System.out.println(this.getClass().getName() + "; " + name + " is swimming.");
    }
}
