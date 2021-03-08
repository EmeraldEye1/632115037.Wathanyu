package week9;
public class Human {
    public void hit(Animal animal){
          System.out.println(animal.roar());
    }
    public static void main(String[] args) {
        Animal dog = new Dog();
        Human human =new Human();
        System.out.println("the first calling hit(Animal)");
        human.hit(dog);
        dog = new Cat();
        System.out.println("the second calling hit(Animal)");
        human.hit(dog);
        System.out.println("the third calling hit(Animal)");
        dog = new Fish();
        human.hit(dog);
    }
    
}
