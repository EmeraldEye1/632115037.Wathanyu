package week7;

public  class Pet {
    String pet;
    String name;
    String species;
    String color;
    int age;
    public Pet(){

    }
    public Pet(String pet,String name,String species ,String color){
      this.pet = pet;
      this.name =name;
      this.species = species;
      this.color =color;
      
}
    public void introduce(){
        System.out.println("My"+pet);
        System.out.println("Name of my pet :  "+name+  "   Pet species type :  "+species+   "    Pet color is :  "+color+  "Pet age  "+age+  "year old");
        
    }
}

