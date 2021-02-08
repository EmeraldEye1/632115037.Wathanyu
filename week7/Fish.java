package week7;

public class Fish extends Pet{
    
  public  Fish(String pet,String name,String species ,String color,int age){
    this.name =name;
    this.species = species;
    this.color =color;
    this.age =age;
    this.pet =pet;
}
  public void bit(){
      System.out.println("My fish "+name+" is live in fresh water");
      System.out.println("Swim speed :fast  ");
      
  }   
  public void live(){
    System.out.println( "My fish Swimming in the pool");
  } 
  public void speed(){
    System.out.println( "My fish speed like motorboat");
  }
}
    

