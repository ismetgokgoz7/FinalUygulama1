
package finaluyg3;


public class FinalUyg3 {
    public enum Gunler {Pazartesi, Sali,Carsamba,Persembe};
    public static Gunler x ;
    

   
    public static void main(String[] args) {
        x = Gunler.Sali;
        System.out.println("x = " + x);
        x=Gunler.Carsamba;
        switch (x)
        {
            case Pazartesi : System.out.println("Gün = "+x);break;
            case Sali : System.out.println("Gün = "+x);break;
            case Carsamba : System.out.println("Gün = "+x);break;
            case Persembe : System.out.println("Gün = "+x);break;
            default  : System.out.println("Diğer");
        }
        
    }
    
}
