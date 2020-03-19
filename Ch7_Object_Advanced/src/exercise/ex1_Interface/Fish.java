package exercise.ex1_Interface;

public abstract class Fish implements Swimmable {
    protected String name;

    public Fish(){
        this("");
    }
    public Fish(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public abstract void swim();
}
