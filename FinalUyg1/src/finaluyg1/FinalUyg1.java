
package finaluyg1;
enum Gun { Pazartesi, Salı, Carsamba, Persembe, Cuma, Cumartesi, Pazar };//Gun isminde bir enum oluşturuldu.

public class FinalUyg1 {

    
    public static void main(String[] args) {
        Gun secilenGun = Gun.Carsamba;//Çalışması için gerekli parametre eklendi.
 
     if (secilenGun == Gun.Cumartesi || secilenGun == Gun.Pazar)
     {
         System.out.println("Hafta sonu seçtiniz.");
     }
     else
     {
         System.out.println("Hafta içi seçtiniz.");
     }

        
    }
    
}
