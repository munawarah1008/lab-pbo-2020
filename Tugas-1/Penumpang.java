
/**
 * Ini adalah class Penumpang yang akan mewakili satu object dari penumpang
 *
 * @author Munawarah
 * @version 03-12-2020
 */
public class Penumpang
{
    // atribut yang dibutukan nama, umur dan status hamil
    private String nama;
    private int umur;
    private boolean hamil;
    
    /**
     * Ini adalah method constructor dengan parameter yang akan memberikan nilai awal 
     * dimana nama, umur dan status hamil akan diinputkan oleh user
     */
    public Penumpang(String nama, int umur, boolean hamil)
    {
        this.nama = nama;
        this.umur = umur;
        this.hamil = hamil;
    }
    
    /**
     * @return nama
     * Ini adalah method accessor yang akan mengembalikan nama penumpang
     */
    public String getNama()
    {
        return nama;
    }
    
    /**
     * @return umur
     * Ini adalah method accessor yang akan mengembalikan umur penumpang
     */
    public int getUmur()
    {
        return umur;
    }
    
    /**
     * @return hamil
     * Ini adalah method accessor yang akan mengembalikan status hamil penumpang
     * apakah true atau false
     */
    public boolean getHamil()
    {
        return hamil;
    }
    
}
