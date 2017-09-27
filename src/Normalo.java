/*Der Normalo ist NICHT gelernter oder talentierte Klempner oder Elektriker,
er hat trotzdem die Methode lampeWechseln() und rohrlegen(), DOCH
der Unterschied ist er kann es nicht, daher ist es VOID und nicht RETURN.*/
class Normalo extends Mensch {
    public      Normalo(String name) { super(name); }

    public void lampeWechseln() {System.out.println("N: Alte rausschrauben, Neue reinschrauben");}

    public void rohrVerlegen() {System.out.println("N: Zange benutzen"); }

    @Override public String toString() { return "Normalo " + getName(); }
}