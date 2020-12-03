import java.util.*;
/**
 * Class Main adalah class utama yang akan mensimulasikan program bus trans koetaradja
 * dimana akan diciptakan sebuah objek bus
 *
 * @author Munawarah
 * @version 03-12-2020
 */
public class Main {
    
    /**
     * Method static void main akan mensimulasikan program
     * setiap program dijalankan akan disediakan menu yang akan dipilih user
     */
    public static void main(String[] args) {
      
        int pilihan, mulai =1 ;
        Scanner input = new Scanner(System.in);
        Bus bus = new Bus();
          
        while(mulai ==1) 
        {
            System.out.println("\n~~~~~~~~~~~~~~~ SELAMAT DATANG DI BUS TRANS KOETARADJA ~~~~~~~~~~~~~~~~");
            System.out.println("MENU : ");
            System.out.println("1. Naikkan Penumpang");
            System.out.println("2. Turunkan Penumpang");
            System.out.println("3. Lihat Penumpang");
            System.out.println("4. Selesai");
            System.out.print("Masukkan pilihan : ");
            pilihan = input.nextInt();
        
            switch(pilihan){
                case 1 : 
                    System.out.print("\nMasukkan nama : ");
                    String nama = input.next();
                    System.out.print("Masukkan umur : ");
                    int umur = input.nextInt();
                    System.out.print("Apakah anda Hamil ? (yes/no) : ");
                    boolean hamil = new Scanner(System.in).nextLine().equalsIgnoreCase("yes")?true:false;
                
                    Penumpang penumpang = new Penumpang(nama, umur, hamil);
                    bus.naikPenumpang(penumpang);
                    bus.toString();
                    System.out.println("");
                    System.out.println("======================================================================");
                    break;
                
                case 2: 
                    System.out.print("\nMasukan nama penumpang: ");
                    nama = input.next();
                    bus.turunkanPenumpang(nama);
                    bus.toString();
                    System.out.println("======================================================================");
                    System.out.println("");
                    break;
                    
                case 3:
                    bus.toString(); 
                    System.out.println("=========================================================================");
                    System.out.println("");
                    break;    
                
                case 4:
                    mulai=2;
                    break;
                 
                default:
                    System.out.println("Pilihan tidak tersedia, silahkan input ulang!");
                    break;
            }
        }
    }
}
        

       
    
