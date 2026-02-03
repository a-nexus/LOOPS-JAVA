//THIS ENTRY CONTROLLED FOR LOOP
//FIRST EXAMPLE OF PRINTING HELLO WORLD AS UESR INPUT
// import java.util.*;

// public class Entrycontrolled {
// public static void main(String[] args){
//     System.out.print("HOW MANY TIME YOU WANT TO PRINT HELLO WORLD:");
//     Scanner sc=new Scanner(System.in);
//     int num=sc.nextInt();
//     for(int i=0;i<num;i++){
//         System.out.println("HELLO WORLD");
//     }
// }    
// }


//IN THIS EXAMPLE USER CAN ALSO PRINT WHAT HE WANT AND ALSO HOW MANY TIME 

// import java.util.*;
// public class Entrycontrolled{
//     public static void main(String[] args){
//         System.out.print("PLS ENTER WHAT YOU WANT TO PRINT:");
//          Scanner sc=new Scanner (System.in);
//          String alpha=sc.nextLine();
//          System.out.print("ENTER HOW MANY TIME YOU WANT TO PRINT:");
//          int num=sc.nextInt();
//          for(int i=0;i<num;i++){
//             System.out.println(alpha);
//          }
//     }
// }

// PRINT THE NUMBER TO num1 TO num2 AS PER USER INPUT

// import java .util.*;
// public class Entrycontrolled{
//     public static void main(String[] args){
// System.out.print("ENTER THE NUMBER WHERE YOU WANT TO PRINT THE NUMBER:");
// Scanner sc=new Scanner (System.in);
// int num1=sc.nextInt();
// System.out.print("ENTER THE NUMBER WHERE THE PRINT OF NUMBER WHILE STOP:");
// int num2=sc.nextInt();
// for(int i=num1;i<=num2;i++){
//     System.out.print(i+"\t");
// }
//     }
// }


//LETS TALK ABOUT WHILE LOOP AND TRY THE PREVIOUS QUESTION BUT USING WHILE NOT FOR

import java.util.*;
public class Entrycontrolled{
    public static void main(String[] args){
         System.out.print("ENTER THE NUMBER WHERE YOU WANT TO START:");
Scanner sc=new Scanner(System.in);
int num1=sc.nextInt();
System.out.print("ENTER YOUR SECOND NUMBER:");
int num2=sc.nextInt();
int i=num1;
while(i<=num2){
    System.out.print(i +"\t");
    i++;
}

    }
}