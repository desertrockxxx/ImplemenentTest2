class Normalo extends Mensch {
    public      Normalo(String name) { super(name); }

    public void lampeWechseln() {System.out.println("N: Alte rausschrauben, Neue reinschrauben");}

    public void rohrVerlegen() {System.out.println("N: Zange benutzen"); }

    @Override public String toString() { return "Normalo " + getName(); }
}