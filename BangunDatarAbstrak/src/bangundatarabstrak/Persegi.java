package bangundatarabstrak;
public class Persegi extends BangunDatar {

    //deklarasi atribut sisi memiliki lingkup akses private
    private double sisi;
    //Konstruktor Persegi tanpa parameter input
    //Konstruktor ini memberikan nilai default sisi=0 ketika objek di-instantiate
    public Persegi(){
        sisi= 5.0;
    }
    //Konstruktor Persegi dengan parameter input sisi
    //Konstruktor ini memberikan nilai awal atribut internal kelas sisi= parameter input sisi
    //ketika objek di-instantiate
    public Persegi(double sisi){
        this.sisi=sisi;
    }
    //getter getSisi() disediakan untuk kelas lain yang ingin mendapatkan nilai atribut sisi 
    public double getSisi(){
       return sisi;   
    }
    //setter setSisi() disediakan untuk kelas lain yang ingin memodifikasi nilai atribut sisi 
    public void setSisi(double sisi){
       this.sisi = sisi;   
    }
    //implementasi method abstrak hitungKeliling()
    @Override
    public double hitungKeliling(){
        return 4*sisi;//rumus keliling persegi
    }
    //implementasi method abstrak hitungKeliling()
    @Override
    public double hitungLuas(){
        return sisi*sisi;//rumus luas persegi
    }  
}
