//HERE THE QUESTION OF NESTED LOOP AND HOW A PATTERN FORMED
//OUESTION IS HOW TO PRINT THE RECTANGLE PATTERN

// import java.util.*;
// public class Pattern {
//     public static void main(String[] args){
// Scanner sc=new Scanner (System.in);
// System.out.print("Enter How Many Row You Want:");
// int row=sc.nextInt();
// System.out.print("Enter How Many Asterics You Want In the line:");
// int Coloum=sc.nextInt();
// //outer loop is for how many line
// for(int i=1;i<=row;i++){

//     //here is the inner loop what is printing in the=at line and what printing in that line
//     for(int j=1;j<=Coloum;j++){
//         System.out.print("*");
//     }
//     System.out.println();
// }
//     }
    
// }

//NEXT QUESTION HOW TO PRINT HOLLOW RECTANGLE

// import java.util.*;
// public class Pattern{
//     public static void main(String[] args){
//         Scanner sc=new Scanner(System.in);
//         System.out.print("ENTER HOW MANY ROWS YOU WANT:");
//         int row=sc.nextInt();
//         System.out.print("ENTER HOW MANY COLUMN YOU WANT:");
//         int column=sc.nextInt();
//         for(int i=1;i<=row;i++){
//             for(int j=1;j<=column;j++){
//                 //SO THE LOGIC IS IF WE EXAMINE THE HOLLOW RECTANGLE THEN WE SEE THE J OR I COMES 1 THEN THE * PRINTED AND IF THEY ARE EQUAL TO ROW AND COLUMN RESPECTIVLY THEN.
//                 if(j==1 || i==1 || j==column ||i==row){
//                     System.out.print("*");
//                 }else{
//                     System.out.print(" ");
//                 }
//             }
//             System.out.println();
//         }
//     }
// }


// NEXT QUESTION HALF PIRAMID

// import java.util.*;
// public class Pattern{
//     public static void main(String[] args){
//         Scanner sc=new Scanner(System.in);
//         System.out.print("ENTER THE NUMBER OF ROW YOU WANT:");
//         int row=sc.nextInt();//THE CONCEPT IS WE TAKE ONLY ONE INPUT IN THAT BECAUSE OF THE COUNT OF ROW IS EQUAL TO THE PRINT OF ASTERICS 
//         for(int i=1;i<=row;i++){
//             for(int j=1;j<=i;j++){
//                 System.out.print("*");//IF THE INNER LOOP BREAK AND THE OUTER LOOP COMES IN USE THE INNER LOOP J VALUE IS RESET 
//             }
//             System.out.println();
//         }
//     }
// }

//NEXT QUESTION
//PRINTING THE INVERTED HALF PYRAMID

// import java.util.*;
// public class Pattern{
//     public static void main(String[] args){
//         Scanner sc=new Scanner(System.in);
//         System.out.print("ENTER THE NUMBER OF ROW YOU WANT:");
//     int row=sc.nextInt();
//     for(int i=1;i<=row;i++){
//         //WE SAW IN INNER LOOP I CHANGED THE INCREMENT CONDITION TO DECREAMENT AND ASLO J IS HAVE SAME VALUE OF ROW AND ITS GO IN DECREASING ORDER
//         for(int j=row;j>=i;j--){
//             System.out.print("*");
//         }System.out.println();
//     }
//     }
// }

//NEXT QUESTION PRINT HALF PYRAMID ROTATED 180 DEGREEE 


// import java.util.*;
// public class Pattern{
//     public static void main(String[] args){
//         Scanner sc=new Scanner(System.in);
//         System.out.print("ENTER HOW MANY ROW YOU WANT:");
//         int row=sc.nextInt();
//         for(int i=1;i<=row;i++){
//             for(int j=1;j<=row-i;j++){
//                 System.out.print(" ");
//             }for(int j=1;j<=i;j++){
//                 System.out.print("*");
//             }
//             System.out.println();
//         }

//     }
// }

//NEXT QUESTION
//PRINT THE PATTERN HALF PYRAMID WITH NUMBER 

// import java.util.*;
// public class Pattern{
//     public static void main(String [] args){
//          Scanner sc=new Scanner(System.in);
//          System.out.print("ENTER HOW MANY ROWS YOU WANT:");
//          int row=sc.nextInt();
//          for(int i=1;i<=row;i++){
//             for(int j=1;j<=i;j++){
//                 System.out.print(j);
//             }System.out.println();
//          }
//     }
// }


//NEXT QUESTION
//PRINT THE PATTERN INVERTED HALF PYRAMID WITH NUMBER

import java.util.*;




public class Pattern{
    public static void main(String[] args){
        Scanner sc=new Scanner (System.in);
        System.out.print("ENTER HOW MANY ROW YOU WANT:");
        int row=sc.nextInt();
        for(int i=row;i>=1;i--){
            for(int j=1;j<=i;j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
}