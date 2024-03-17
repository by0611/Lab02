import java.util.Scanner;
public class JPA01 {
    static Scanner scn = new Scanner(System.in);
    public static void main(String[] args) {
        for(int i =0;i<=2;i++){
        System.out.println("Input: ");
        int score = scn.nextInt();
        if(score>=60){
            System.out.println("You pass!");}
        System.out.println("End");
    }}
}

