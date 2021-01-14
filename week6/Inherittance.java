package week6;

public class Inherittance {
    public static void main(String[] args) {
        Artist art  =new Artist("Ball",20,"Male");
        career ca  =new career("martin",27,"female");
        career2 car  =new career2("Eva",19,"female");
        career1 care  =new career1("Lucus",29,"Male");
        career3 caree =new career3("Jordi",27,"Male");
        career4 career =new career4("Dasha",25,"female");
        
        
        art.genre ="hip hob  ";
        ca.career ="Doctor";
        car.career="SuperStar";
        care.career ="Student";
        caree.career="Mathematician";
        career.career="Modeling";
        art.introduce();
        art.playMusic();
        ca.introduce();
        ca.job();
        car.introduce();
        car.job();
        care.introduce();
        care.job();
        caree.introduce();
        caree.job();
        career.introduce();
        career.job();
        
        
       
        
    }

    
}
