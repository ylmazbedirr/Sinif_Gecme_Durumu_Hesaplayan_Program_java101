import java.util.Scanner;
public class E_Sinif_Gecme_Durumu_Hesaplayan_Program {
    public static void main(String[] args) {
        int mat,fizik,turkce,kimya,muzik;

        Scanner scan = new Scanner(System.in);

        System.out.print("Mat: ");
        mat = scan.nextInt();
        mat = ((mat >= 0) && (mat <= 100)) ? mat : 0;

        System.out.print("Fizik: ");
        fizik = scan.nextInt();
        fizik = (fizik >=0) && (fizik <=100) ? mat :0 ;

        System.out.print("Turkce: ");
        turkce = scan.nextInt();
        turkce = (turkce >= 0) && (turkce <= 100) ? turkce : 0;

        System.out.print("Kimya: ");
        kimya = scan.nextInt();
        kimya = ((kimya >= 0) && (kimya <= 100)) ? kimya : 0;

        System.out.print("Muzik: ");
        muzik = scan.nextInt();
        muzik = ((muzik >= 0) && (muzik <= 100)) ? muzik : 0;

          double avarage = (mat+fizik+turkce+kimya+muzik) / 5;

            if(avarage >= 55){
                System.out.print("Tebrikler Sinifi " + avarage +" Ortlama ile Gecitiniz!");
            }else{
                System.out.println(avarage + " Ortalama ile sinifta kaldiniz!");
            }

    }
}
