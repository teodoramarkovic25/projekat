package three.leteci;

public class FlyableFactory {
    public static Flyable bird() {
        Bird bird = new Bird();
        return bird;

    }
    public static Flyable plane() {
        Plane plane = new Plane();
        return plane;

    }

    private static class Bird implements Flyable {

        @Override
        public void fly() {
            System.out.println("Ja sam ptica i ja letim");
        }
    }

    private static class Plane implements Flyable {

        @Override
        public void fly() {
            System.out.println("Ja immam motor na mlazni pogon i letim");
        }
    }
}
