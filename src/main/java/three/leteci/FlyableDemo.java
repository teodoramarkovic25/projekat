package three.leteci;

public class FlyableDemo {
    public static void main(String[] args) {
        Flyable bird = FlyableFactory.bird();
        bird.fly();
        Flyable flyable2 =  FlyableFactory.plane();
        flyable2.fly();

    }
}
