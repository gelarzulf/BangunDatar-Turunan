/**
 * App
 */
public class App {

    public static void main(String[] args) {

        Lingkaran lingkaranA = new Lingkaran(7, "Lingakaran A");
        lingkaranA.getInfo();

        System.out.println("\t");

        Persegi persegiA = new Persegi("Persegi A", 5);
        persegiA.getInfo();
        
        System.out.println("\t");

        Segitiga_Sama_Kaki segitigaSamaKakiA = new Segitiga_Sama_Kaki("Segitiga Sama Kaki A", 5, 8);
        segitigaSamaKakiA.getInfo();

        System.out.println("\t");

        Segitiga_Sama_Sisi segitigaSamaSisiA = new Segitiga_Sama_Sisi("Segitiga Sama Sisi A", 5);
        segitigaSamaSisiA.getInfo();

        System.out.println("\t");

        Segitiga_Siku_Siku segitigaSikuSikuA = new Segitiga_Siku_Siku("Segitiga Siku Siku A", 10, 5, 8);
        segitigaSikuSikuA.getInfo();

        System.out.println("\t");

        Segitiga_Sembarang segitigaSembarangA = new Segitiga_Sembarang("Segitiga Sembarang A", 5, 9, 6);
        segitigaSembarangA.getInfo();
    }
}
