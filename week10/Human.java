package week10;
public class Human {
    public void hit(Animal animal){
          System.out.println(animal.roar());
    }
    public static void main(String[] args) {
        Animal Dog = new Dog();
        Human human =new Human();
        System.out.println("the first calling hit(Animal)");
        human.hit(Dog);
        Dog = new Cat();
        System.out.println("the second calling hit(Animal)");
        human.hit(Dog);
        System.out.println("the third calling hit(Animal)");
        Dog = new Fish();
        human.hit(Dog);
    }
    
}
