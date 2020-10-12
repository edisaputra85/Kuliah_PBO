package bangundatarabstrak;
import java.text.DecimalFormat;
public class Tester {
    public static void main(String[] args) {
       //Instantiate objek decFormat untuk membentuk desimal dua angka di belakang koma
        DecimalFormat df = new DecimalFormat("#.##");
        // Instansiasi objPersegi
        Persegi objPersegi = new Persegi();
        //pemanggilan getter atribut sisi objPersegi
        System.out.println("Nilai awal Sisi persegi = " + df.format(objPersegi.getSisi()));
        objPersegi.setSisi(8.0);
        //pemanggilan getter atribut sisi objPersegi
        System.out.println("Nilai Sisi persegi setelah diubah = " + df.format(objPersegi.getSisi()));
        //Tampilkan hasil perhitungan keliling persegi
        System.out.println("Keliling persegi = " + df.format(objPersegi.hitungKeliling()));
        //Tampilkan hasil perhitungan luas persegi
        System.out.println("Luas persegi = " + df.format(objPersegi.hitungLuas()));
        System.out.println();
        
        // Instansiasi objLingkaran
        Lingkaran objLingkaran = new Lingkaran();  
        //pemanggilan setter atribut jejari objLingkaran
        objLingkaran.setJejari(7.0);
        //pemanggilan getter atribut jejari objLingkaran
        System.out.println("Jejari lingkaran = " + df.format(objLingkaran.getJejari()));
        //Tampilkan hasil perhitungan keliling lingkaran
        System.out.println("Keliling lingkaran = " + df.format(objLingkaran.hitungKeliling()));
        //Tampilkan hasil perhitungan luas lingkaran
        System.out.println("Luas lingkaran = " + df.format(objLingkaran.hitungLuas()));
    }   
}
