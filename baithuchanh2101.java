import java.util.Scanner;
public class giaiPTBac2 {
    public static void giaiPTBac2(String[] args) throws Exception{
        //khai bao cac bien
        double hesoA, hesoB, hesoC, delta;
        double x1, x2;
        //khai bao cac doi tuong scanner de doc du lieu nguoi dung nhao vao
        Scanner abc = new Scanner System.in; 
        //dua ra thong bao cho nguoi dung nhap vao he so
        System. out.print("nhao vao he so A: ");
        //doc gia tri nguoi dung nhap vao va gan he so
        hesoA = sc.nextDouble() ;
        System. out.print("nhao vao he so B: ");
        //doc gia tri nguoi dung nhap vao va gan he so
        hesoB = sc.nextDouble() ;
        System. out.print("nhao vao he so C: ");
        //doc gia tri nguoi dung nhap vao va gan he so
        hesoC = sc.nextDouble() ;
        System. out.print("nhao vao he so delta: ");
        //doc gia tri nguoi dung nhap vao va gan he so
        delta = sc.nextDouble() ;
        System.out.print("phuong trinh ban vua nhap co dang : "+a+"x*x+"+b+"x+"+c+"=0");
        delta=Math.pow(b,2)-(4*a*c);
        if(delta<0){
            System.out.println("phuong trinh vo nghiem!");
         else if(delta==0)
            x1=-b/(2*a);
            x2= b/(2*a);
            System.out.println("phuong trinh co mot nghiem la x1=x2="+x1);
         else if (delta #0 )
            x1=(-b+Math.sqrt(delta))/(2*a);
            x2=(-b-Math.sqrt(delta))/(2*a);
            System.out.println("phuong trinh co hai nghiem x1="+x1+"va x2=" +x2);
        }

    }
}

