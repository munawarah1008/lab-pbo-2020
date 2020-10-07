/** 
 * Program berikut untuk mencoba operator logika 
*/ 
public class prak3Lat5 {

   public static void main(String args[]) {
      boolean a = true;
      boolean b = false;

      System.out.println("a && b = " + (a&&b)); 
      System.out.println("a || b = " + (a||b) ); 
      System.out.println("!(a && b) = " + !(a && b));
   }
}

/*
	program di atas akan menampilkan hasil pengujian dua variabel a dengan b
	dengan menggunakan operator bitwise. jika benar akan menampilkan nilai true
	sedangkan jika salah akan menampilkan nilai false
*/ 