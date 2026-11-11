

import java.util.*;
//Madelyn Wang
// class created on Nov 2 2026
//This program is a collection of methods that utilize loops to print out characters in rows
public class  Practice {
public static void main(String [] args) {
    Scanner scan = new Scanner(System.in);
    int input = scan.nextInt();




    stars(input);
    odds(input);
    triangle(input);
    eo(input);
    pyramid(input);
   
}
//precondition: input is integer, 0 will not return anything, no negatives work
//postcondition: number of stars in input number of rows, with stars increasing every row
   public static void stars(int rows){
//  *
//  ***
//  *****




//  *******
//  *********
//  ***********
//  *************
   int index = 0;
   int j = 0;
   int p = 1;
  while(index<rows){
   j=0;
  
   while(j<p){
   System.out.print("*");
   j++;
   }
   p+=2;
   System.out.println("");
   index++;
  }


}


//precondition: input is integer, 0 will not return anything, no negatives work
  //post condition: numbers 1 to input displayed in ascending order, with number of numbers increasing every row
   public static void triangle(int rows){
       int in = 0;
       int a = 0;
       while(in <= rows) {
           a=0;
           while(a<in){
            System.out.print(in);
            a++;
           }
           System.out.println("");
          
          in++;
       }
   }
  //precondition: input is integer, 0 will not return anything, no negatives work, even numbers still work
//post condition: displays odd numbers from 1 to input with number of odd numbers decreasing in every row
   public static void odds(int start){
      if(start%2==0){
         start = start-1;
      }
       for(int i = start; i>=1; i-=2) {
           System.out.print(i);
           for(int j = i+start-2; j>= start; j--){
              System.out.print(i);
             
           }
          System.out.println("");
         
       }
   }
   //precondition: input is integer, 0 will not return anything, no negatives work
//post condition: makes series of Es and Os that number of rows correspond with input, starts with O if even and E if odd
   public static void eo(int maxE){
//O
//EE
//OOO
//EEEE
//OOOOO
//EEEEEE
//OOOOO
//EEEE
//OOO
//EE
//O
for(int i = 0; i<=maxE; i++){
   for(int g = 0; g<i; g++){
       if(maxE%2==0){
       if(i%2 == 0){
         System.out.print("E");
       } else{
          System.out.print("O");
       }
   } else {
        if(i%2 == 0){
         System.out.print("O");
       } else{
          System.out.print("E");
       }
   }
   }
System.out.println("");
}


 for(int i = 0; i<maxE; i++){
   for(int g = maxE-1; g>i; g--){
        if(maxE%2==0){
       if(i%2 == 0){
         System.out.print("O");
       } else{
          System.out.print("E");
       }
   } else {
if(i%2 == 0){
         System.out.print("O");
       } else{
          System.out.print("E");
       }
   }
     
   }
System.out.println("");
}
   }
//precondition: input is integer 0 will not return anything, no negatives work, input cannot be bigger than 10 or it wont make pyramid
//post condition: makes upside down pyramid of numbers with number of rows that is the input
public static void pyramid(int rows){
 int start = 1;
 int whileStart=0;
   for(int i = rows; i>=1; i--){
     
        for(int j = i*2-1; j>=1; j--){
          
           while(whileStart<=start){
              System.out.print(" ");
               whileStart++;
           }
          
              System.out.print(start);
             
           }
           start++;
           whileStart = 0;
        System.out.println("");
   }




}
}



