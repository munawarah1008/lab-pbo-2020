/** 
 * Program berikut untuk mencoba seleksi if
*/
import java.util.Scanner;

public class IfExample {  
 public static void main(String[] args) {  
  int age=0;  
  Scanner sc = new Scanner(System.in);
  
  System.out.println("Masukkan umur anda:");
  age = sc.nextInt();
  
  if(age>=17)
   System.out.print("Anda sudah boleh buat KTP");      
	}    
}   

/* 
	program di atas jika di run akan meminta user menginputkan umur
	jika umur yang diinputkan lebih besar sama dengan 17,
	nantinya akan dicetak "Anda sudah boleh buat KTP"

*/
