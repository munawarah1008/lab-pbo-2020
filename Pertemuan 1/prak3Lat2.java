/**
* Program berikut untuk mencoba operator assignment 
*/
public class prak3Lat2 {
    public static void main(String args[]){
	int a = 10;
	int b = 20;
	int c = 0;

	c = a + b;
	System.out.println("c = a + b = "+ c);

	c += a ;
	System.out.println("c += a  = " + c );

	c -= a ;
	System.out.println("c -= a = " + c );

        c *= a ;
        System.out.println("c *= a = " + c );

        a = 10;
        c = 15;
        c /= a ; 
        System.out.println("c /= a = " + c ); 

        a = 10;
        c = 15;
        c %= a ;
        System.out.println("c %= a  = " + c );

        c <<= 2 ;
        System.out.println("c <<= 2 = " + c );

        c >>= 2 ;
        System.out.println("c >>= 2 = " + c );

        c >>= 2 ;
        System.out.println("c >>= 2 = " + c );

        c &= a ; 
        System.out.println("c &= a  = " + c );

        c ^= a ;
        System.out.println("c ^= a   = " + c );

        c |= a ;
        System.out.println("c |= a   = " + c );

	}
}

/*
  baris pertama ditampilkan hasil penjumlahan nilai dari variabel a dan b dimana akan disimpan di variabel c
   dan yang ditampilkan adalah nilai c berasal dari 10 + 20 = 30
  baris kedua nilai c yang tadinya sudah menjadi 30 ditambah dengan nilai variabel a yaitu 10
   maka 30 + 10 = 40, yang disimpan di variabel c
  baris ketiga menampilkan nilai variabel c yang sudah 40 dikurangi dengan nilai variabel a yaitu 10
   maka 40 - 10 = 30, yang disimpan di variabel c
  baris keempat menampilkan nilai variabel c yang sudah bernilai 30 dikalikan dengan nilai variabel a yaitu 10
   maka 30*10 = 300, yang mana disimpan di variabel c
  baris kelima menampilkan nilai variabel c bernilai 15 dibagi dengan nilai variabel a yang bernilai 10
   maka didapat 15/10=1, yang mana disimpan di variabel c
  baris keenam menampilkan hasil bagi nilai variabel c bernilai 15 dibagi dengan nilai variabel a berniali 10
   maka didapat 15%10 = 5
  baris ketujuh menampilkan hasil penggeseran nilai biner dari 5 ke samping kiri sebanyak 2 kali.
   maka hasil yang ditampilkan adalah 20 
  baris selanjutnya menampilkan hasil penggeseran nilai biner dari 20 ke samping kanan sebanyak 2 kali.
   maka hasil yang ditampilkan adalah 5
  baris selanjutnya menampilkan hasil penggeseran nilai biner dari 5 ke samping kanan sebanyak 2 kali.
   maka hasi yang didapat 1
  baris selanjutnya menampilkan hasil penggunaan operator assignment & pada desimal 1
   maka hasil yang didapat adalah 0
  baris selanjutnya menampilkan hasil penggunaan operator assignment ^ pada desimal 0
   maka hasil yang didapat adalah 10
  baris selanjutnya menampilkan hasil penggunaan operator assignment | pada desimal 10
   maka hasil yang didapat adalah 10
*/