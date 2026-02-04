//HERE THE QUESTION OF NESTED LOOP AND HOW A PATTERN FORMED
import java.util.*;
public class Pattern {
    public static void main(String[] args){
Scanner sc=new Scanner (System.in);
System.out.print("Enter How Many Row You Want:");
int row=sc.nextInt();
System.out.print("Enter How Many Asterics You Want In the line:");
int Coloum=sc.nextInt();
//outer loop is for how many line
for(int i=1;i<=row;i++){

    //here is the inner loop what is printing in the=at line and what printing in that line
    for(int j=1;j<=Coloum;j++){
        System.out.print("*");
    }
    System.out.println();
}
    }
    
}
