/*Der IndustrieKlempner kann nur rohrVerlegen(), doch er kanns gut*/
class IndustrieKlempner extends Mensch implements Klempner {

    public IndustrieKlempner(String name) { super(name); }

    public String rohrVerlegen() {return "IK: Wir packen dies zu unserer Liste.";}

}