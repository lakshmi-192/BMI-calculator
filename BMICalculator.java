import java.util.Scanner;

public class BMICalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter weight");
        int weight = sc.nextInt();
        System.out.println("enter height");
        int height = sc.nextInt();
        sc.close();
        if (weight < 35 && height < 120) {
            System.out.println("underweight");
        } else if (weight == 50 && height == 150) {
            System.out.println("normal weight");
        } else if (weight > 35 && height > 120) {
            System.out.println("over weight");
        } else if (weight > 60 && height > 180) {
            System.out.println("obessed weight");
        } else {
            System.out.println("enter weight and height");
        }
    }
}
