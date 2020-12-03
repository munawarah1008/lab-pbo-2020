import java.util.Scanner;
import java.util.ArrayList;
/**
 * Class Bus adalah class yang mewakili bus yang ditumpangi oleh penumpang
 * dimana hanya memuat 6 kursi saja
 *
 * @author Munawarah
 * @version 03-12-2020
 */
public class Bus
{
    /**
     * atribut pada class ini berupa arrayList yang akan menampung objek dalam dari class Penumpang
     * terdiri dari penumpang biasa dan penumpang prioritas
     */
    private ArrayList<Penumpang> penumpangBiasa;
    private ArrayList<Penumpang> penumpangPrioritas;
    
    /**
     * method constructor bus akan menciptakan array untuk penumpang biasa dan prioritas
     */
    public Bus()
    {
      penumpangBiasa = new ArrayList<>();
      penumpangPrioritas = new ArrayList<>();
    }
    
    /**
     * @return penumpangBiasa
     * method accessor ini akan mengembalikan penumpang biasa
     */
    public ArrayList<Penumpang> getPenumpangBiasa()
    {
        for(Penumpang penumpang:penumpangBiasa){
            penumpang.getNama();
        }
        return penumpangBiasa;
    }
    
    /**
     * @return penumpangPrioritas
     * method accessor ini akan mengembalikan penumpang prioritas
     */
    public ArrayList<Penumpang> penumpangPrioritas()
    {
        for(Penumpang penumpang : penumpangPrioritas){
            penumpang.getNama();
        }
        return penumpangPrioritas;
    }
    
    /**
     * @return penumpangBiasa.size()
     * method accessor ini akan mengembalikan berapa banyak penumpang biasa
     */
    public int getJumlahPenumpangBiasa()
    {
        return penumpangBiasa.size();
    }
    
    /**
     * @return penumpangPrioritas.size();
     * method accessor ini akan mengembalikan berapa banyak penumpang biasa
     */
    public int getJumlahPenumpangPrioritas()
    {
        return penumpangPrioritas.size();
    }
    
    /**
     * @return boolean
     * method ini akan menentukan penumpang berhasil naik atau tidak
     */
     public boolean naikPenumpang (Penumpang penumpang){
        
        if((penumpangPrioritas.size() < 2 ) && ((penumpang.getUmur()<10) || (penumpang.getUmur() > 60) || (penumpang.getHamil()==true))){
            System.out.println("Penumpang bernama "+penumpang.getNama()+" <BERHASIL> ditambahkan!");
            this.penumpangPrioritas.add(penumpang);
            return true;
        }
        else if(penumpangBiasa.size() < 4 ){
            System.out.println("Penumpang bernama "+penumpang.getNama()+" <BERHASIL> ditambahkan!");
            this.penumpangBiasa.add(penumpang);
            return true;
        } else{
            System.out.print("Penumpang bernama " +penumpang.getNama()+ " <GAGAL> ditambahkan!");
            System.out.println("<Tidak Ada Kursi Kosong!>");
            System.out.println("");
            return false;
        } 
    }
    
    /**
     * @return boolean
     * method ini akan menentukan penumpang berhasil turun atau tidak
     */
   public boolean turunkanPenumpang(String nama){
       
        for (int i = 0; i < penumpangBiasa.size(); i ++) {  
           if(nama.equals(penumpangBiasa.get(i).getNama())){
              penumpangBiasa.remove(i);
              System.out.println("Penumpang bernama "+nama+" telah diturunkan!");
             return penumpangBiasa.equals(nama);
           } 
        }
           
        for (int i = 0; i < penumpangPrioritas.size(); i ++) {  
            if(nama.equals(penumpangPrioritas.get(i).getNama())){
              penumpangPrioritas.remove(i);
              System.out.println("Penumpang bernama "+nama+" telah diturunkan");
             return penumpangPrioritas.equals(nama);
            }
        }
        
        for (int i = 0; i < (penumpangBiasa.size()+penumpangPrioritas.size()); i ++) {  
           if(( nama !=(penumpangPrioritas.get(i).getNama()) || (nama != penumpangBiasa.get(i).getNama()))){
               System.out.println("Tidak Ada penumpang yang diturunkan"); 
               return false;
           }
        } 
       return penumpangPrioritas.equals(nama);
    }
    
    /**
     * @return String
     * method ini akan mengembalikan list penumpang 
     */
    public String toString(){
           String daftar1 = "  ";
           String daftar2 = "  ";
           int i=0, j=0;
           
            for(Penumpang p : penumpangBiasa) {
               daftar1 += p.getNama().toString();
               if (i<(penumpangBiasa.size()-1) ){
                 daftar1 += ", "; 
                }
                else {
                  daftar1 += " "; 
                }
                
                i++;
            }
            
            for(Penumpang p : penumpangPrioritas) {
               daftar2 += p.getNama().toString();
               if (j<(penumpangPrioritas.size()-1) ){
                 daftar2 += ", "; 
                }
                else {
                  daftar2 += " "; 
                }
                
                j++;
            }
            
            if(penumpangBiasa.isEmpty() == true ){  
              System.out.println("\nDaftar nama penumpang Biasa : <kosong>") ;
            }else{
              System.out.println("\nDaftar nama penumpang biasa : " +daftar1);
            }
            
            if(penumpangPrioritas.isEmpty() == true ){  
              System.out.println("Daftar nama penumpang prioritas : <kosong>") ;
            }else{
              System.out.println("Daftar nama penumpang prioritas : " +daftar2);
            }
          
          System.out.println("Jumlah semua penumpang : " +(penumpangBiasa.size()+penumpangPrioritas.size()));
           
          return "\nDaftar nama penumpang biasa :"+daftar1+"daftar nama penumpang prioritas :"+daftar2+"jumlah1 semua penumpang : "+(penumpangBiasa.size()+penumpangPrioritas.size())+"\n";
    }
    
   
}
