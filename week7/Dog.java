package week7;

public class Dog extends Pet{
  public Dog(String pet,String name,String species ,String color,int age){
    this.name =name;
    this.species = species;
    this.color =color;
    this.age =age;
    this.pet =pet;
}
  public void bit(){
      
      System.out.println(name+"   is very big body" );
      System.out.println("have Long hair");
  }    
  public void run(){
    System.out.println("My dog "+name+"  is run to street");
  }
  public void bark(){
    System.out.println("Bark : Pew pew!!!!!!!");
  }
  public void hair(){
    System.out.println("Long hair");
  }    
  }


