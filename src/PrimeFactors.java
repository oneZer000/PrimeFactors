import java.util.Scanner;

public class PrimeFactors {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int givenNum = in.nextInt();

        while (givenNum > 1){
            for (int i = 2; i < givenNum+1; i++){
                if (givenNum % i == 0){
                    givenNum /= i;
                    System.out.printf("%d\n", i);
                }
            }
        }
    }
}
