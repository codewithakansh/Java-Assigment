import java.util.Scanner;

public class assigment2 {
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter an integer: ");
    int n = sc.nextInt();
    for(int i = 1; i <= n; i++){
        for(int j=1 ; j <= i ; j++){
            System.out.print("A");
        }
        System.out.println();


    }
}}