package week6;

public class career extends Person {
     String career;
    
    public career(String name ,int age,String gender){
        this.age = age;
        this.name = name;
        this.gender = gender;
    }
        public void job(){
            System.out.println(name +" job is "+career);
    
}
}
