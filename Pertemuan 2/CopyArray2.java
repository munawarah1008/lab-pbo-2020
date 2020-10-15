/** 
 * Program berikut untuk menguji awalan atau akhir suatu string berntebet
*/ 
public class CopyArray2 { 
 public static void main(String args[]) {
  String str1 = "Informatika Universitas Syiah Kuala"; 
 
System.out.println(str1.startsWith("Inf"));
System.out.println(str1.endsWith("kuala")); 
System.out.println(str1.startsWith("Inf",1));
System.out.println(str1.startsWith("Inf",2));
System.out.println(str1.startsWith("Inf",3)); 

}
}

/*
baris 8 akan mengecek apakah str1 dimulai dengan "Inf" hasilnya true
baris 9 akan mengecek apakah str1 diakhiri dengan "kuala" hasilnya false, yang benar adalah "Kala"
baris 10 akan mengecek apakah str1 dimulai dengan "Inf" pada indeks ke 1 hasilnya false, yang benar adalah "nfo"
baris 11 akan mengecek apakah str1 dimulai dengan "Inf" pada indeks ke 2 hasilnya false, yang benar adalah "for"
baris 12 akan mengecek apakah str1 dimulai dengan "Inf" pada indeks ke 3 hasilnya false, yang benar adalah "orm"
*/

