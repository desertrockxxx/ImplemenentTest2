/*Der Talentierte KANN es, doch er ist nicht gelernt, deswegen RETURNt er es*/
class TalentiertePerson extends Mensch implements Elektriker, Klempner {
    public        TalentiertePerson(String name) { super(name); }

    public String lampeWechseln() { return "TP: Alte rausschrauben, Neue reinschrauben";}

    public String rohrVerlegen(){ return "TP: Zange benutzen"; }

    @Override public String toString() { return "TalentiertePerson " + getName(); }
}