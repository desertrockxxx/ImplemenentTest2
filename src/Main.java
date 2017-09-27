public class Main {
    public static void main(String[] args) {
        TalentiertePerson bob = new TalentiertePerson("Bob");
        Normalo peter = new Normalo("Peter");
        IndustrieKlempner hans = new IndustrieKlempner("Hans");


        // Bob der Normalo kann nur darüber sprechen
        System.out.println(bob.rohrVerlegen());
        System.out.println(bob.lampeWechseln());

        // Peter der Talentierte kann es tatsächlich
        peter.rohrVerlegen();
        peter.lampeWechseln();

        // Hans der IndustrieKlempner kann es besser, doch nur Klempner Tätigkeiten
        System.out.println(hans.rohrVerlegen());


        //TP: Zange benutzen
        //TP: Alte rausschrauben, Neue reinschrauben
        //N: Zange benutzen
        //N: Alte rausschrauben, Neue reinschrauben
        //IK: Wir packen dies zu unserer Liste.
    }

}

//http://www.fredosaurus.com/notes-java/oop/interfaces/q-interfaces-handyperson-1.html