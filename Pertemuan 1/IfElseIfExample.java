/**  
 * Program berikut untuk mencoba seleksi if-else if
*/ 
public class IfElseIfExample { 
 
 public static void main(String[] args) {  
  int marks=65;  
    
  if(marks<50){  
   System.out.println("fail");  
  }  
  else if(marks>=50 && marks<60){  
   System.out.println("D grade");   
  }  
  else if(marks>=60 && marks<70){  
   System.out.println("C grade");  
  }  
  else if(marks>=70 && marks<80){  
   System.out.println("B grade");  
  }  
  else if(marks>=80 && marks<90){   
   System.out.println("A grade");   
  }
  else if(marks>=90 && marks<100){  
   System.out.println("A+ grade");  
  }
  else{  
   System.out.println("Invalid!");  
  }  
 }  
}  

/* 
  program di atas akan dilakukan pengecekan sebuah nilai dan dicari grade yang sesuai
  karena nilai 65 berada di antara >=60 dan <=70 maka akan dicetak C grade
*/ 