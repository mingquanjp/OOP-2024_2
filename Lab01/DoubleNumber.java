import java.util.Scanner;
public class DoubleNumber {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap so thu nhat: ");
        double a = sc.nextDouble();
        System.out.print("Nhap so thu hai: ");
        double b = sc.nextDouble();

        System.out.println("a + b = " + (a+b));
        System.out.println("a - b = "+ (a-b));
        System.out.println("a * b = " + (a*b));
        if(b!=0){
            System.out.println("a / b = " + (a/b));
        }else{
            System.out.println("ErrorMAthDivide");
        }


    }
}
