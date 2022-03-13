import  java.util.Scanner;
public class last {
    public  static void main(String[]args){
        Scanner brt =new Scanner(System.in);

        System.out.print("matematik  notnuz =");
        int a = brt.nextInt();
        System.out.print("Rürkçe notunuz =");
        int b =brt.nextInt();
        System.out.print("fizik  notunuz =");
        int c =brt.nextInt();
        System.out.print("kimya notunuz =");
        int d =brt.nextInt();
        System.out.print("kimya  notunuz =");
        int e =brt.nextInt();

        if ((0<a)&&(a<100))
            if ((0<b)&&(b<100))
                if ((0<c)&&(c<100))
                    if ((0<d)&&(d<100))
                        if ((0<e)&&(e<100)){
                            double ort =(a+b+c+d+e)/5;
                            if (ort >55)
                                System.out.print( ort+"  gectiniz");
                            else
                                System.out.print( ort+  "kaldınız");
                        }


    }
}
