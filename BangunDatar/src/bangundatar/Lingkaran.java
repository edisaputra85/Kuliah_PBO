package bangundatar;
//kelas Lingkaran memiliki lingkup akses publik
public class Lingkaran{
    public final double PHI = 3.14;
    //deklarasi atribut jejari memiliki lingkup akses publik
    private double jejari;
    //getter getJejari() disediakan untuk kelas lain yang ingin mendapatkan nilai atribut jejari 
    public double getJejari(){
       return jejari;   
    }
    //setter setJejari() disediakan untuk kelas lain yang ingin memodifikasi nilai atribut jejari 
    public void setJejari(double jejari){
       this.jejari = jejari;   
    }
    //method hitungKeliling memiliki lingkup akses publik dan return nilai keliling
    public double hitungKeliling(){
        return 2*PHI*jejari;//rumus keliling lingkaran
    }
    //method hitungLuas memiliki lingkup akses publik dan return nilai luas
    public double hitungLuas(){
        return PHI*jejari*jejari;//rumus luas persegi
    }   
}

