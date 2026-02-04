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

// import java.util.*;
// public class Entrycontrolled{
//     public static void main(String[] args){
//          System.out.print("ENTER THE NUMBER WHERE YOU WANT TO START:");
// Scanner sc=new Scanner(System.in);
// int num1=sc.nextInt();
// System.out.print("ENTER YOUR SECOND NUMBER:");
// int num2=sc.nextInt();
// int i=num1;
// while(i<=num2){
//     System.out.print(i +"\t");
//     i++;
// }

//     }
// }

// HERE ARE SOME QUESTION FOR ENTRY CONTROLLED LOOP

// PRINT THE SUM OF FIRST N NATURAL NUMBER 
//PERFORMING BY THE HELP OF FOR LOOP

// import java.util.*;
// public class Entrycontrolled{
//     public static void main(String[] args){
//         System.out.print("enter the netural number where you want to add:");
//         Scanner sc=new Scanner (System.in);
//         int num=sc.nextInt();
//         int sum=0;
//         for(int i=1;i<=num;i++){
//             sum=sum+i;

//         }
//         System.out.println(sum);
//     }
// }

//THE PREVIOUS QUESTION BY THE HELP OF WHILE LOOP

// import java.util.*;
// public class Entrycontrolled{
//     public static void main(String[] args){
//         System.out.print("ENTER THE NUMBER WHERE YOU WANT TO ADD THE SUM:");
//         Scanner sc=new Scanner (System.in);
//         int num=sc.nextInt();
//         int sum=0;
//         int i=1;
//         while(i<=num){
//             sum=sum+i;
//             i++;
//         }
//         System.out.println(sum);
//     }
// }

//NEXT EXAMPLE PRINT THE TABLE OF GIVEN NUMBER INPUT BY THE USER

// import java.util.*;
// public class Entrycontrolled{
//     public static void main(String[] args){
//         System.out.print("ENTER THE NUMBER WHICH YOU WANT TO PRINT THE NUMBER:");
//         Scanner sc=new Scanner (System.in);
//         int num=sc.nextInt();
//         for(int i=1;i<=10;i++){
//             System.out.println(num*i);
//         }

//     }
// }

//THEN BY THE HELP OF WHILE LOOP

// import java.util.*;
// public class Entrycontrolled{
//     public static void main(String [] args){
//         System.out.print("ENTER THE NUMBER WHICH YOU WANT TO PRINT THE TABLE:");
//         Scanner sc=new Scanner(System.in);
//         int num=sc.nextInt();
//         int i=1;
//         while(i<=10){
//             System.out.println(num*i);
//             i++;
//         }
//     }
// }

//EXTRA QUESTIONS
//Print all even numbers till n. 

// import java.util.*;
// public class Entrycontrolled{
//     public static void main(String [] args){
//        Scanner sc=new Scanner(System.in);
//        System.out.print("enter where you have to start the checking and countion of even number:");
//        int num1=sc.nextInt();
//        System.out.print("ENTER WHERE YOU HAVE TO STOP:");
//        int num2=sc.nextInt();

//        for(int i=num1;i<=num2;i++){
//         if(i%2==0){
//             System.out.print(i+"\t");
//         }
//        }
//     }
// }


//NEXT EXAMPLE 
// I HAVE A QUERY OF WORKING A PROGRAM IF I DONT WRITE THE INITIALIZATION ALSO CONDITION AND ALSO UPGRADATION WHAT WILL HAPPEN IN THE PROGRAM

// import java.util.*;
// public class Entrycontrolled{
//     public static void main(String[] args){
//         for(; ;){
//             System.out.println("Hello World!");
//         }
//     }
// }

// IN THAT CONDITION WE SAW IF WE DONT WRITE THE COUNDITION THEN THE LOOP RUN INFINATLY TIME AND IT WILL INFINITE TIME PRINT HELLO WORLD

//NEXT EXAMPLE

// Make a menu driven program. The user can enter 2 numbers, either 1 or 0.  
// If the user enters 1 then keep taking input from the user for a student’s 
// marks(out of 100).  
// If they enter 0 then stop. 
// If he/ she scores : 
// Marks >=90 -> print “This is Good” 
// 89 >= Marks >= 60 -> print “This is also Good” 
// 59 >= Marks >= 0 -> print “This is Good as well” 
// Because marks don’t matter but our effort does.


// import java.util.*;


// public class Entrycontrolled{
//     public static void main(String[] args){
//         Scanner sc=new Scanner(System.in);
//        int choice;
//              do{
//                  System.out.print("ENTER YOUR CHOOSE 1 AND 0:");
//           choice=sc.nextInt();
//                 if(choice==1){
//                     System.out.print("ENTER YOUR MARKS:");
//                     int marks=sc.nextInt();

//              if(marks<=100 && marks>=90){
//                 System.out.println("This is Good");

//                 }else if(marks<90 && marks>=60){
//                     System.out.println("this is also good");
//                 }else if(marks<60 && marks>=0){
//                     System.out.print("this is good as well");
//                 }else{
//                     System.out.println("Invalid Marks");
//                 }

//         }
//     }while(choice==0);
//     System.out.println("Thank you");
//     sc.close();
// }
// }

