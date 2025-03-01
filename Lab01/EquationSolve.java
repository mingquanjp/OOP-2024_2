import java.util.Scanner;
class LinearEquationSolve {
    public static void FirstDegreeEquation1VAR(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap a: ");
        double a = sc.nextDouble();
        System.out.print("Nhap b: ");
        double b = sc.nextDouble();
        if(a == 0 ){
            if ( b==0) {
                System.out.println("Phuong trinh vo so nghiem");
            }else{
                System.out.println("Phuong trinh vo nghiem!");
            }
        }else{
            System.out.println("Phuong trinh co 1 nghiem x = " + (-b/a));
        }
    }
    public static void FirstDegreeEquation2VAR(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap a11: ");
        double a11 = sc.nextDouble();
        System.out.print("Nhap a12: ");
        double a12 = sc.nextDouble();
        System.out.print("Nhap b1: ");
        double b1 = sc.nextDouble();
        System.out.print("Nhap a21: ");
        double a21 = sc.nextDouble();
        System.out.print("Nhap a22: ");
        double a22 = sc.nextDouble();
        System.out.print("Nhap b2: ");
        double b2 = sc.nextDouble();
        //Cramer
        double D = a11 * a22 - a12 * a21;
        double Dx = b1 * a22 - b2 * a12;
        double Dy = a11 * b2 - a21 * b1;
        
        if(D==0){
            if(Dx ==0 && Dy ==0){
                System.out.println("PT co vo so nghiem");
            }else{
                System.out.println("PT vo nghiem!");
            }
        }else{
            System.out.println("He co nghiem duy nhat x = " +  (Dx/D) + " va y = " + (Dy/D));
        
    }
    }public static void SecondDegreeEquation1VAR(){
            Scanner sc = new Scanner(System.in);
            System.out.print("Nhap a: ");
            double a = sc.nextDouble();
            System.out.print("Nhap b: ");
            double b = sc.nextDouble();
            System.out.print("Nhap c: ");
            double c = sc.nextDouble();
           
            double delta = b*b - 4*a*c;
            if(delta<0){
                double re = -b /(2 * a);
                double im = Math.sqrt(-delta)/(2*a);
                System.out.println("Phuong trinh co nghiem phuc: ");
                System.out.println("x1 = " + re + " +" + im + "i");
                System.out.println("x1 = " + re + " -" + im + "i");
            }else if (delta ==0){
                System.out.println("Phuong trinh co nghiem kep x = " + (-b/(2*a)));
            }else{
                double x1 = (-b + Math.sqrt(delta))/(2 * a);
                double x2 = (-b - Math.sqrt(delta))/(2 * a);
        
                System.out.println("Phuong trinh co hai nghiem phan biet :");
                System.out.println("x1 = " + x1);
                System.out.println("x2 = " + x2);
            }
    }
}
public class EquationSolve{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int choice;
        do{
            System.out.println("\n===== CHUONG TRINH GIAI PHUONG TRINH =====");
            System.out.println("1. Giai phuong trinh bac nhat 1 an ");
            System.out.println("2. Giai he phuong trinh bac nhat 2 an");
            System.out.println("3. Giai he phuong trinh bac hai 2 an");
            System.out.println("0. Thoat chuong trinh");
            System.out.print("Nhap lua chon: ");
            choice = sc.nextInt();

            switch(choice){
                case 1:
                    LinearEquationSolve.FirstDegreeEquation1VAR();
                    break;
                case 2:
                    LinearEquationSolve.FirstDegreeEquation2VAR();
                    break;
                case 3:
                    LinearEquationSolve.SecondDegreeEquation1VAR();
                    break;
                case 0:
                    System.out.println("Thoat chuong trinh!");
                    break;
                default:
                    System.out.println("Lua chon ko hop le, hay chon lai!");
            }
        }while(choice!=0);
        
    }
    
}
