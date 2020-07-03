import java.util.Scanner;


public class CalculateAges {

    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        outputFinal( sc );
        
        
    }

    public static int question1(String messege, Scanner sc){
        System.out.println(messege);
        int input = sc.nextInt();
        return (input);
    }
    
       
    public static void outputFinal(Scanner sc){
        int year = question1("What year we have?" , sc);
        int[] age = new int[4];
        int[] born = new int[4];
        int[] y1960 = new int[4];
        int[] y2040 = new int[4];
        for (int i = 0; i < 4; i++){
            age[i] =  question1("How old are you?", sc);
            born[i]= year - age[i];
            y2040[i]= 2040 - born[i];
            if (born[i] <= 1960) 
                y1960[i] = 1960 - born[i];
            else {
                y1960[i] = 0; 
            }
                
        }
        outputPrint(born, y1960, y2040);
    }

public static void outputPrint(int[] born ,int[] y1960 , int[] y2040){
     for (int i = 0; i < 4; i++){
         System.out.print("The " + (i+1) + "'s person born" + born[i] + ".");
         System.out.print(" In 1960 was " + y1960[i] + " years old ");
         System.out.println("and in the year 2040 he will be " + y2040[i] + ".");
         
         
     }
    
}


}