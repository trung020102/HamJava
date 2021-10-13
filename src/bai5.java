import java.util.Scanner;

public class bai5 {

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
	public static void main(String[] args) {
	  
	    float c=0;
		float b=0;
		float a=0;
		phuongTrinhBac2(a,b,c);
	}
	

}
    