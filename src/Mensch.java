/*Jeder erbt von hier*/
public class Mensch {
    private String name;

    public Mensch(String name) { this.name = name; }

    public String getName()   { return name; }

    @Override public String toString() { return "Mensch " + getName(); }
}

