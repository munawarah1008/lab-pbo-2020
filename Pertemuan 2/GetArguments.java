/** 
 * Program berikut untuk mendapatkan nilai argumen pada method main 
*/ 
public class GetArguments { 
	public static void main(String args[]) {
  		System.out.println("Tanggal : " + args[0]); 
  		System.out.println("Bulan : " + args[1]); 
    	System.out.println("Tahun : " + args[2]);
 } 
}

/*
	program di atas jika dicompile akan menghasilkan eror
	karena nilai args nya belum diberikan.
	namun kita bisa menampilkan isinya jika saat di run
	kita menambahkan statment yang diinginkan
	misalnya java GetStatments 10 Agustus 2020
	nah nanti akan dicetak 
	    Tanggal : 10
	    Bulan : Agustus
	    Tahun : 2020
*/
