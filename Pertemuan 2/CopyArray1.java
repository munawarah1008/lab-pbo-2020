/**  
 * Program berikut untuk menguji kesamaan string
*/  
public class CopyArray1 {  
	public static void main(String args[]) { 

		String str1 = "Pemrograman";
		String str2 = "Java";
		String str3 = "PemrogramanJava";

			System.out.println("String 1:"+str1);
			System.out.println("String 2:"+str2);
			System.out.println("String 3:"+str3);
			System.out.println("String 1 = String 3 ==>"+str1.equals(str3));
			System.out.println("String 2 = String 3 ==>"+str2.equals(str3));
			System.out.println("String 1 + String 2 = String 3 ==>"+(str1+str2).equals(str3));

		String str4 = "Universitas Syiah Kuala";
		String str5 = "universitas syiah kuala";

			System.out.println("String 4:"+str4);
			System.out.println("String 5:"+str5);
			System.out.println("Perintah Pembandingan dibawah mengabaikan antara huruf besar dengan huruf kecil");
			System.out.println("String 4 = String 5 ==> "
			+str4.equalsIgnoreCase(str5));
			System.out.println("String 4 + String 5 = String 5 + String 4 ==> "
			+(str4+str5).equalsIgnoreCase(str5+str4));

	}
}

/*

pada baris 11, 12, 13 akan dicetak nilai di setiap variabel yang telah dideklarasikan
baris 14  akan dieksekusi apakah string1=string3 => Pemrograman = PemrogramanJava (false) 
baris 15 akan dieksekusi apakah string2=string3 => Java = PemrogramanJava (false)
baris 16 akan dieksekusi apakah string1+string2=string3 => Pemrograman+Java = PemrogramanJava (true)
baris 17 akan dilakukan pengecekan kesamaan string dengan tidak memperhatikan huruf besar dan kecilnya (IgnoreCase)
baris 24 akan dieksekusi apakah string4=string5 => Universitas Syiah Kuala = universitas syiah kuala (true)
baris 26 akan dieksekusi apakah string4+string5=string5+string4 => Universitas Syiah Kualauniversitas syiah kuala = universitas syiah kualaUniversitas Syiah Kuala (true)
/* 

*/