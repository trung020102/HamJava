import java.util.Scanner;

public class bai4 {
	
public static void phuongTrinhBac1(double a,double b) {
    double x;
    
    Scanner sc = new Scanner(System.in);
    System.out.println("nhap tham so a va b:");
    a = sc.nextDouble();
    b = sc.nextDouble();
    x = -b/a;
    System.out.println("phuong trinh " + a + "x" +" + "+ b + " = " );
    System.out.println("x = "+ x);
}
public static void main(String[] args) {
    double a = 0,b = 0;
    phuongTrinhBac1(a,b);
}
}
