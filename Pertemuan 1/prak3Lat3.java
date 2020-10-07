/**  
 * Program berikut untuk mencoba operator relasional
*/ 
public class prak3Lat3 {

   public static void main(String args[]) {
      int a = 10;
      int b = 20;

      System.out.println("a == b = " + (a == b) );
      System.out.println("a != b = " + (a != b) );
      System.out.println("a > b = " + (a > b) );
      System.out.println("a < b = " + (a < b) );
      System.out.println("b >= a = " + (b >= a) );
      System.out.println("b <= a = " + (b <= a) );
   }
} 

/*
   nilai variabel a = 10
   nilai variabel b = 20
   baris pertama menampilkan hasil pengujian apakah angka 10 sama dengan angka 20
    maka didapatkan hasil false karena 10 tidak sama dengan 20
   baris kedua menampilkan hasil pengujian apakah angka 10 tidak sama dengan angka 20
    maka didapatkan hasil true karena 10 memang tidak sama dengan 20
   baris ketiga menampilkan hasil pengujian apakah angka 10 lebih besar dari angka 20
    maka didapatkan hasil false karena angka 10 tidak lebih besar dari 20
   baris keempat menampilkan hasil pengujian apakah angka 10 lebih kecil dari 20
    maka didapatkan hasil true karena angka 10 lebih kecil dari angka 20
   baris kelima menampilkan hasil pengujian apakah nilai 20 lebih besar sama dengan 10
    maka didapat hasil true karena angka 20 lebih besar sama dengan 10
   baris keenam menampilkan hasil pengujiakn apakah nilai 20 lebih kecil sama dengan 10
    maka didapat hasil false karena angka 20 tidak lebih kecil sama dengan 10
*/