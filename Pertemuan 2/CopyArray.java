/** 
 * Program berikut untuk menyalin array ke array lain
*/  
public class CopyArray {
    public static void main(String args[]) { 
      int[] array1 = { 7, 4, 8, 1, 4, 1, 4 };
      int[] array2 = new int[3]; 

      System.arraycopy(array1,0,array2,0,3);

      System.out.print("Array1 : ");
        for (int i=0; i<array1.length; i++)
            System.out.print(array1[i] + " "); 
            System.out.println();
  
            System.out.print("Array2 : "); 
        for (int i=0; i<array2.length; i++)
            System.out.print(array2[i] + " ");
 } 
}

/*
program di atas akan mencetak niai array 1 dan array 2 dimana array2
dikopi dari array 1 dari indeks 0 (pada array1) untuk mengopinya pada 
indeks 0 (pada array2) sebanyak 3 elemen jadi array2 akan dicetak 7, 4, 8 
*/