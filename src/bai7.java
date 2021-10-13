import java.text.DecimalFormat;
import java.util.Scanner;
import java.util.Scanner;
public class bai7 {
	public static void laplai() {
		  System.out.println("Bạn Muốn Tiếp Tục Hay Dừng lại");
		  
		  String username;
	        Scanner scaner = new Scanner(System.in);
	        System.out.print("");
	        username = scaner.nextLine();
	      
	        
		  if(username.equals("Tiếp tục") )
		  {		cau2();	}

			  if(username.equals("Dừng lại"))
			  { System.exit(0);}
	}
	
		   
		public static void cau2() {
			int aNumber ;
			int bNumber;
		
	    double nghiem;
	    DecimalFormat decimalFormat = new DecimalFormat("#.##");    // làm tròn đến 2 chữ số thập phân
	    Scanner scanner = new Scanner(System.in);
	    System.out.println("Giải Phương Trình Bậc 1 ");
	    System.out.println("Nhập vào số a: ");
	    aNumber = scanner.nextInt();
	    System.out.println("Nhập vào số b: ");
	    bNumber = scanner.nextInt();
	    System.out.println("Phương trình bạn vừa nhập vào là: " + aNumber + "x + " + bNumber + " = 0.");
	    if (aNumber == 0) {
	        if (bNumber == 0) {
	            System.out.println("Phương trình này có vô số nghiệm.");
	        } else {
	            System.out.println("Phương trình vô nghiệm.");
	        }
	    } else {
	        nghiem = (double) -bNumber / aNumber;   
	        System.out.println("Phương trình có nghiệm x = " + decimalFormat.format(nghiem) + ".");
	    }
		}
		
		
		public static void giaiPTBac2(float a, float b, float c) {
		       
	        if (a == 0) {
	            if (b == 0) {
	                System.out.println("Phương trình vô nghiệm!");
	            } else {
	                System.out.println("Phương trình có một nghiệm: "
	                        + "x = " + (-c / b));
	            }
	            return;
	        }
	    
	        float delta = b*b - 4*a*c;
	        float x1;
	        float x2;
	     
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
		// TODO Auto-generated method stub
		int n,a,b,c;
		Scanner scanner = new Scanner(System.in);
	     
	    System.out.println("Nhập 1 hoặc 2  ");
	    System.out.println("1 : Giải Phương Trình Bậc 1  ");
	    System.out.println("2 : Giải Phương Trình Bậc 2  ");
	    n = scanner.nextInt();
		
	    while (n < 0 && n >3 )  ;
	    {
	    if (n == 1 ) {
	    	
			cau2();
			laplai();
			
		}
		else if (n == 2 ) {
			System.out.print("Giải Phương Trình Bậc 2 ");
			 System.out.println("Nhập a ");
			    a = scanner.nextInt();
			    System.out.println("Nhập b ");
			    b = scanner.nextInt();
			    System.out.println("Nhập c ");
			    c = scanner.nextInt();
			giaiPTBac2(a, b, c);
			
		}
		
	    
	}
	}

}