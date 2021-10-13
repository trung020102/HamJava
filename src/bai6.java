import java.util.Scanner;

public class bai6 {
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
	public static void phuongTrinhBac2(float a, float b, float c) {
	       Scanner sc = new Scanner(System.in);
	        System.out.println("nhập a: ");
	        a = sc.nextFloat();
	        System.out.println("nhập b: ");
	        b = sc.nextFloat();
	        System.out.println("nhập c: ");
	        c = sc.nextFloat();
	        if (a == 0) {
	            if (b == 0) {
	                System.out.println("Phương trình vô nghiệm!");
	            } else {
	                System.out.println("Phương trình có một nghiệm: "
	                        + "x = " + (-c / b));
	            }
	            return;
	        }
	        // tính delta
	        float delta = b*b - 4*a*c;
	        float x1;
	        float x2;
	        // tính nghiệm
	        if (delta > 0) {
	            x1 = (float) ((-b + Math.sqrt(delta)) / (2*a));
	            x2 = (float) ((-b - Math.sqrt(delta)) / (2*a));
	            System.out.println("Phương trình có 2 nghiệm là: "
	                    + "x1 = " + x1 + " và x2 = " + x2);
	        } else if (delta == 0) {
	            x1 = (-b / (2 * a));
	            System.out.println("Phương trình có nghiệm kép: "
	                    + "x1 = x2 = " + x1);
	        } else {
	            System.out.println("Phương trình vô nghiệm!");
	        }
	    }
	

public static void hamChon() {
    float a = 0 , b = 0, c = 0;
    Scanner sc = new Scanner(System.in);
    System.out.println("nhập chọn giải PT bậc 1 hay PT bậc 2: ");
    System.out.println("2 cách nhập:");
    System.out.println("1: giải phương trình bậc 1");
    System.out.println("2: giải phương trình bậc 2");
    String cachString = sc.next();
    switch (cachString){
        case "1" :
            phuongTrinhBac1(a, b);
        case "2":
            phuongTrinhBac2(a, b, c);
    }
}
public static void main(String[] args) {
    hamChon();
 }
}