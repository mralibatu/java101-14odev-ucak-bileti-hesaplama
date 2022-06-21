import java.util.Scanner;
public class BiletHesaplama {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int yas, ylcktipi;
        double mesafe, tutar = 0, indirimorani = 0, nrmltutar;

        System.out.println("Mesafeyi km cinsinden giriniz : ");
        mesafe = input.nextDouble();
        System.out.println("Yas giriniz : ");
        yas = input.nextInt();
        System.out.println("Lutfen seciniz : \n" + "1-Tek yon\n" + "2-Gıdıs-donus");
        ylcktipi = input.nextInt();

        nrmltutar = mesafe * 0.1;

        if (yas < 0 && mesafe < 0) {
            System.out.println("Hatali giris yaptiniz");
        } else {
            if (yas < 12) {
                indirimorani = 0.5;
            } else if (yas >= 12 && yas < 24) {
                indirimorani = 0.1;
            } else if (yas > 65) {
                indirimorani = 0.3;
            }
            double indirimlitutar = nrmltutar - (nrmltutar * indirimorani);

            switch (ylcktipi){
                case 1:
                    tutar = nrmltutar;
                    break;
                case 2:
                    tutar = (indirimlitutar - (indirimlitutar * 0.2)) * 2;
                    break;
            }
            System.out.println(indirimlitutar);
            System.out.println("Ucret = " + tutar);
        }

        }
    }
