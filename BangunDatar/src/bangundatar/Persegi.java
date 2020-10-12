package bangundatar;
//kelas Persegi memiliki lingkup akses publik
public class Persegi{
    //deklarasi atribut sisi memiliki lingkup akses private
    private double sisi;
    //Konstruktor Persegi tanpa parameter input
    //Konstruktor ini memberikan nilai default sisi=0 ketika objek di-instantiate
    public Persegi(){
        this.sisi= sisi;
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
    //method hitungKeliling memiliki lingkup akses publik dan return nilai keliling
    protected double hitungKeliling(){
        return 4*sisi;//rumus keliling persegi
    }
    //method hitungLuas memiliki lingkup akses publik dan return nilai luas
    public double hitungLuas(){
        return sisi*sisi;//rumus luas persegi
    }   
}