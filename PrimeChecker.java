import java.util.Scanner;

public class PrimeChecker {
    public static boolean isPrime(int number){
        for(int i=2;i<number/2;i++){
            if(number%i==0){
                return false;
            }
        }

        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num1 = sc.nextInt();

        if(isPrime(num1)){
            System.out.println("The number is Prime");
        }
        else{
            System.out.println("The number is not Prime");
        }
    }
}
