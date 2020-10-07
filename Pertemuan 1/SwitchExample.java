/** 
 * Program berikut untuk mencoba seleksi switch-case
*/ 
public class SwitchExample { 

 public static void main(String[] args) {  
  int number=20; 

  switch(number){  
  case 10: System.out.println("10");break;  
  case 20: System.out.println("20");break;  
  case 30: System.out.println("30");break;  
  default:System.out.println("Not in 10, 20 or 30");  
  }
    
 }  
}   

/*
	program di atas akan memberikan pilihan, jika salah satu pilihan
	terpenuhi maka akan dijalankan. maka akan dicetak 20 karena number = 20
*/