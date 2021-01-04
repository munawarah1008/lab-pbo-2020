public class Siswa { 
 private int nrp;
  
 public Siswa(int nrpx)
 { 
  this.nrp = nrp;
 }
  
 public void setNrp(int nrp)
 { 
  this.nrp = nrp;
 }
 
 public int getNrp()
 { 
  return nrp;
 } 
} 

/**
	Pada kode program di atas mengenai materi enkapsulasi dimana atributnya berakses private dan
	hanya dapat diakses dengan memanggil method mutator atau accessornya, yang dimana artinya
	atribut tersebut terlindungi dan tidak dapat diakses secara langsung oleh class yang lain
*/