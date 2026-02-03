// SO IN EXICONTROLLED LOOP THERE IS ONLY DO WHILW LOOP IN WHICH THE CONDITION WHICH CHECKED AFTER THE FIRST STATEMENT WHILE DONE

//EXAMPLE TAKING INPUT UNTIL THE INPUT IS NOT A FACTOR OF SEVEN OR SEVEN ITSELF
    import java.util.*;

public class Exitcontrolled {
    public static void main(String[] args){
        do{
        Scanner sc=new Scanner (System.in);
        int num=sc.nextInt();
        if(num%7==0){
            System.out.println("Thank You!");
            break;
        }
     }while(true);
    }
    
}

//IN DO WHILE THE WORK DONE AT LEAST ONE TIME IF THE CONDITION IS TRUE OR NOT
