import java.util.Scanner;

public class Exam01 {
    public static void main(String[] args){

    Scanner sc = new Scanner(System.in);

    int a = sc.nextInt();
    int b = sc.nextInt();

    double result = (double) a / b;

        System.out.println(a +"/"+b +"="+result);

        sc.close();
    }
}


