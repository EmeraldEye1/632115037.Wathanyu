package week8;
public class bikepro {
public static void main(String[] args) {
    bike common = new bike(10);
    common.speedup();
    common.Break();
    common.speedup();
    common.resultSpeed();
    System.out.println("");
    System.out.println("---------------------------------------------------------------------------");
    System.out.println("");
    mountainbike mountainbike  = new mountainbike(10);
    mountainbike.Speedup(2);
    mountainbike.BreakBike();
    mountainbike.resultSpeed();
    mountainbike.Speedup(3);
    mountainbike.resultSpeed();
    mountainbike.Speedup(14);
    mountainbike.resultSpeed();
}

    
}
