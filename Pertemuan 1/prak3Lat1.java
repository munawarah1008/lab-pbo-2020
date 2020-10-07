/** 
 * Program berikut untuk mencoba operator aritmatika
*/ 
public class prak3Lat1{
	public static void main(String args[]){
		int a = 10;
		int b = 20;
		int c = 25;
		int d = 25;

		System.out.println("a + b = "+ (a+b) );
		System.out.println("a - b = "+ (a-b) );
		System.out.println("a * b = "+ (a*b) );
		System.out.println("b / a = "+ (b/a) );
		System.out.println("b % a = "+ (b%a) );
		System.out.println("c % a = "+ (c%a) );
		System.out.println("a++   = "+ (a++) );
		System.out.println("b--   = "+ (a--) );

		// Check the difference in d++ and ++d
		System.out.println("d++ = "+ (d++) );
		System.out.println("++d = "+ (++d) );
	}	
}

/*
 Program di atas mencoba menggunakan operator aritmatika seperti +,-,*,/,%,++,--
 baris pertama menampilkan ouput hasil penjumlahan antara variabel a dengan b, yaitu 10+20 = 30
 baris kedua menampilkan output hasil pengurangan antara variabel a dengan b, yaitu 10-20 = -10
 baris ketiga menampilkan output hasil perkalian antara variabel a dengan b, yaitu 10*20 = 200
 baris keempat menampilkan output hasil pembagian antara variabel b dengan a, yaitu 20/10 = 2
 baris kelima menampilkan output sisa bagi antara variabel b dengan a, yaitu 20%10 = 0
 baris keenam menampilkan output sisa bagi antara variabel c dengan a, yaitu 25%10 = 5
 baris ketujuh menampilkan output incremen ++, sebenarnya fungsinya untuk menambahkan angka dengan 1
  namum karena ini akan menampilkan a++, maka nilai a akan ditamilkan terlebih dahulu baru di tambah dengan 1
  maka dari itu hasil outputnya menampilkan angka yang merupakan nilai dari variabel a yaitu 10,
  tetapi dibelakang layar sebenarnya sudah bertambah satu.
 baris kedelapan menampilkan output decrement --, sebenarnya fungsinya adalah untuk mengurangkan sebuah nilai dengan 1
  namun karena pada kode di atas nilai a sebelumnya sudah diincrement kan dan sekarang decrement --
  karena operasinya a-- maka nilai a dulu yang dioutputkan baru setelahnya dikurangi 1. 
  makanya pada layar akan di tampilkan nilai a yang sudah di incerement kan sebelumnya yaitu 11.
 baris kesembilan menampilkan nilai d++, yang mana nilai variabel d yaitu 25 akan ditambah dengan 1
  namun karena d++ maka yang akan ditampilkan adalah output nilai d diawal yaitu 25, baru setelahnya ditambah 1
 baris kesepuluh menampilkan nilai ++d, nah berbeda dengan sebelumnya increment ini akan menambahkan
  nilai variabel d dengan 1 baru ditampilkan. sebelumya nilai d sudah menjadi 26 karena 25+1 = 26
  sekarang nilai d akan ditambah satu dulu baru ditampilkan dengan kata lain 1+26=27
  makanya akan ditampilkan nilai 27.
*/