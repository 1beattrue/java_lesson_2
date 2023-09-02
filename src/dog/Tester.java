package dog;

public class Tester {
    // Задание 5
    public static void main(String[] args) {
        DogKennel dogKennel = new DogKennel();
        Dog dog1 = new Dog("Bobik", 4);
        Dog dog2 = new Dog("Sharik", 3);
        Dog dog3 = new Dog("Persik", 5);
        System.out.println(dog1.humanAge());
        dogKennel.add(dog1);
        dogKennel.add(dog2);
        dogKennel.add(dog3);
        System.out.println(dogKennel);
    }
}
