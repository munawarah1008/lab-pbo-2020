/**  
 * Program berikut untuk mencoba array dua dimensi
*/  
public class Array2 { 
 public static void main(String args[]) {
 	  //Array 2 dimensi
  			int[][] arrx = new int[3][3]; 
  			arrx[0][0] = 1;
  			arrx[0][1] = 2;
  			arrx[0][2] = 3; 
  			arrx[1][0] = 4;
  			arrx[1][1] = 5;
  			arrx[1][2] = 6; 
  			arrx[2][0] = 7;
  			arrx[2][1] = 8;
  			arrx[2][2] = 9; 

  			System.out.println("Nilai arrx[0][0] : " + arrx[0][0]); //dicetak angka 1
  			System.out.println("Nilai arrx[0][1] : " + arrx[0][1]); //dicetak angka 2
  			System.out.println("Nilai arrx[0][2] : " + arrx[0][2]); //dicetak angka 3
  			System.out.println("Nilai arrx[1][0] : " + arrx[1][0]); //dicetak angka 4
  			System.out.println("Nilai arrx[1][1] : " + arrx[1][1]); //dicetak angka 5
  			System.out.println("Nilai arrx[1][2] : " + arrx[1][2]); //dicetak angka 6
  			System.out.println("Nilai arrx[2][0] : " + arrx[2][0]); //dicetak angka 7
  			System.out.println("Nilai arrx[2][1] : " + arrx[2][1]); //dicetak angka 8
  			System.out.println("Nilai arrx[2][2] : " + arrx[2][2]); //dicetak angka 9
 }
}    

/*
	program di atas untuk mencoba mencetak nilai di dalam array dua dimensi
	dimana variabelnya bernama arrx.
	bagian awal semua nilai dalam array di inisialisasi satu per satu
	baru setelahnya dicetak sesuai dengan index yang berurutan
	misalnya baris pertama kolom pertama, setelahnya baris pertama
	kolom kedua dan begitu terus setelahnya hingga semua nilai tercetak.
*/
 