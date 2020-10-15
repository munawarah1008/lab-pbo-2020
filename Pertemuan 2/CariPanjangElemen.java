/**  
 * Program berikut untuk melihat panjang array
*/ 
public class CariPanjangElemen { 
	public static void main(String args[]) {
  		int x[][][][]=new int[2][][][]; 


  		x[0]=new int[1][][]; 
  		x[0][0]=new int[2][];
  		x[0][0][0]=new int[3];
  		x[0][0][1]=new int[2]; 
  		x[1]=new int[2][][];
  		x[1][0]=new int[1][];
  		x[1][0][0]=new int[2]; 
  		x[1][1]=new int[2][];
 		x[1][1][0]=new int[1];
  		x[1][1][1]=new int[3]; 
  
  		System.out.println(x[0].length); // dicetak 1
  		System.out.println(x[0][0].length); // dicetak 2
  		System.out.println(x[0][0][0].length); // dicetak 3
  		System.out.println(x[0][0][1].length); // dicetak 2
  		System.out.println();
  		System.out.println(x[1].length); // dicetak 2
  		System.out.println(x[1][0].length); // dicetak 1
  		System.out.println(x[1][0][0].length); // dicetak 2
  		System.out.println(x[1][1].length);  // dicetak 2
  		System.out.println(x[1][1][0].length); // dicetak 1
  		System.out.println(x[1][1][1].length); // dicetak 3
 } 
} 

/*
	program di atas akan mencari panjang setiap array
	dimana dapat dilihat nilai yang dicetak sesuai dengan 
	yang dideklarasikan misalnya pada baris ke-9 :
	x[0]=new int[1][][]; ===> maka panjang array nya adalah 1
							  sesuai dengan angka yang diisi dalam
							  kurung siku setelah kata "int"
*/