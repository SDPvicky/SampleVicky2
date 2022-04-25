import java.util.Scanner;

public class ASMD {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Print the first value");
        int val1 = sc.nextInt();
        System.out.println("Print the Second value");
        int val2 = sc.nextInt();

        System.out.println("The addition value is: "+(val1+val2));
        System.out.println("The subtraction value is: "+(val1-val2));
        System.out.println("The multiplication value is: "+(val1*val2));
        System.out.println("The division value is:"+(val1/val2));


    }
}
