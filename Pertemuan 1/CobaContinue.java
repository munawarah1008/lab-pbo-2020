/** 
  * Program berikut untuk mencoba statemen break
*/ 
public class CobaContinue
{  
    public static void main(String arg[])
    {
      for (int i=0; i<10; i++)
      {
        for (int j=0; j<i+1; j++)
        {
          if(j==5)
            continue;
          System.out.print('*');
        }    
 
        System.out.println(); 
      }
    } 
}
/*
  program di atas hampir sama seperti kode CobaBreak hanya saja saat dalam 
  looping j nantinya jika j=5 program akan dilanjutkan tidak dihentikan seperti break.
  maka output nnti yang akan keluar bintangnya akan membentuk menyerupai segitiga sama 
  kaki
*/