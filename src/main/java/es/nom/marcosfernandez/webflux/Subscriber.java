package es.nom.marcosfernandez.webflux;

public class Subscriber {

    public static void print(Character character) {
        try {
            Thread.sleep(4000);
        } catch (Exception e) {
            System.out.println("SubscriberException: "+e.getLocalizedMessage());
        }
        System.out.println("Subscriber: "+character);
    }

}
