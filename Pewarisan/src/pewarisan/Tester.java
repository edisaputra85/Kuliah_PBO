package pewarisan;
public class Tester {
    public static void main(String[] args) {
        Dosen dosen = new Dosen(); //instantiate objek dosen dari kelas Dosen (subclass)
        dosen.setNama("Edi Saputra"); //method setNama() berasal dari kelas manusia (superclass)
        dosen.setUmur(35);//method setUmur() berasal dari kelas manusia (superclass)
        dosen.setNip("19xxxxxxxxxxx");//method setNip() berasal dari kelas Dosen (subclass)
        dosen.setMatakuliah("Pemrograman Berorientasi Objek");//method setMatakuliah() berasal dari kelas Dosen (subclass)
        System.out.println("NIP Dosen : " + dosen.getNip());//method getNIP() berasal dari class Dosen
        dosen.mengajarApa();//method mengajarApa() berasal dari class Dosen
        dosen.siapaKamu();//method siapaKamu() yang digunakan adalah override method yang ada pada class Dosen
    }  
}
