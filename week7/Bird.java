package week7;

public class Bird extends Pet{
    public  Bird(String pet,String name,String species ,String color,int age){
        this.name =name;
        this.species = species;
        this.color =color;
        this.age =age;
        this.pet =pet;
    }
      public void bit(){
          System.out.println("My bird "+name+" is live in cage");
         
         
      }    
      public void speak(){
        System.out.println("can speak hi");
      }
      public void check(){
        System.out.println("it form china ");
     

      }
      public void fly(){
        System.out.println("can fly lower");
      }
  }
    

