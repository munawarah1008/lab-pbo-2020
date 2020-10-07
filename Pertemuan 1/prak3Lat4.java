/** 
 * Program berikut untuk mencoba operator bitwise
*/ 
public class prak3Lat4 {

   public static void main(String args[]) {
      int a = 60; /* 60 = 0011 1100 */
      int b = 13; /* 13 = 0000 1101 */
      int c = 0; 

      c = a & b;        /* 12 = 0000 1100 */
      System.out.println("a & b = " + c );

      c = a | b;        /* 61 = 0011 1101 */
      System.out.println("a | b = " + c );

      c = a ^ b;        /* 49 = 0011 0001 */
      System.out.println("a ^ b = " + c );

      c = ~a;           /*-61 = 1100 0011 */
      System.out.println("~a = " + c );

      c = a << 2;       /* 240 = 1111 0000 */
      System.out.println("a << 2 = " + c );
 
      c = a >> 2;       /* 15 = 1111 */ 
      System.out.println("a >> 2  = " + c );

      c = a >>> 2;      /* 15 = 0000 1111 */
      System.out.println("a >>> 2 = " + c );
   }
} 

/*
   baris pertama dilakukan penggunaan operator bitwise & pada desimal 60 dengan 13
    yang mana didapatkan hasil 12
   baris kedua dilakukan penggunaan operator bitwise | pada desimal 60 dengan 13
    yang mana didapat hasil 61
   baris ketiga dilakukan penggunaan operator bitwise ^ pada desimal 60 dengan 13
    yang mana didapat hasil 49
   baris keempat dilakukan penggunaan operator bitwise negasi ~ pada desimal 60 dengan 13
    yang mana didapat hasil -61
   baris keempat dilakukan penggunaan operator bitwise << pada desimal 60 dengan 13
    yang mana dilakukan penggeseran nilai binarynya ke samping kiri sebabnyak 2 kali.
    didapat hasil 240
   baris keempat dilakukan penggunaan operator bitwise >> pada desimal 60 dengan 13
    yang mana dilakukan penggeseran nilai binarynya ke samping kanan sebanyak 2 kali.
    didapat hasil 15
   baris keempat dilakukan penggunaan operator bitwise >>> pada desimal 60 dengan 13
    yang mana dilakukan penggeseran nilai binarynya ke samping kanan sebanyak 3 kali.
    didapat hasil 15

*/