public class TesSiswa 
{
    public static void main(String[] ar) 
    {
        Siswa s = new Siswa(12345);

        s.nrp = 8030001;
        System.out.println(s.nrp);
         
        s.nrp = 8030002;
        System.out.println(s.nrp); 
    }
} 

/**
	Kode di atas bertujuan untuk menciptakan objek dari class Siswa dimana 
	parameter yang dibutuhkan diinisialisasikan langsung.
	Namun saat dikompilasi akan menghasilkan kode yang eror karena atribut nrp
	memiliki akses private
*/