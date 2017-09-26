public class Main {
    public static void main(String[] args) {
        TalentiertePerson bob = new TalentiertePerson("Bob");
        Normalo peter = new Normalo("Peter");
        Industrieller hans = new Industrieller("Hans");


        System.out.println(bob.rohrVerlegen());
        System.out.println(bob.lampeWechseln());

        peter.rohrVerlegen();
        peter.lampeWechseln();

        System.out.println(hans.rohrVerlegen());


        //TP: Zange benutzen
        //TP: Alte rausschrauben, Neue reinschrauben
        //N: Zange benutzen
        //N: Alte rausschrauben, Neue reinschrauben
        //IK: Wir packen dies zu unserer Liste.
    }

}

//http://www.fredosaurus.com/notes-java/oop/interfaces/q-interfaces-handyperson-1.html