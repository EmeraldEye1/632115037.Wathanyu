package week9;
import java.util.Scanner;

public class Student {
    Scanner name = new Scanner(System.in);
     Scanner surname = new Scanner(System.in);
     public String toString(){
      String myname =name.nextLine() ;
      String surname1 =surname.nextLine() ;
  return"my first name   "+myname +"  surname "+surname1;
   }
    public static void main(String[] args) {
        System.out.println("enter name and surname");
        Student p = new Student();
        System.out.println(p.toString());
        
    } 
    
}
