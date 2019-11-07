/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pbo2.pkg10118046.latihan47.nilaimahasiswa;

/**
 *
 * @author
 *  Nama              : M. Hilmy Naufal
 *  Kelas             : IF2
 *  NIM               : 10118046
 *  Deskripsi Program : menghitung nilai mahasiswa
 */
public class PBO210118046Latihan47NilaiMahasiswa {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Nilai nilai = new Nilai(30, 80, 40);
        System.out.println("QUIZ\t\t= " + nilai.getQuiz());
        System.out.println("UTS\t\t= " + nilai.getUts());
        System.out.println("UAS\t\t= " + nilai.getUas());
        
        System.out.println("\nNilai Akhir\t= " + nilai.hitungNilaiAkhir(nilai.getQuiz(), nilai.getUts(), nilai.getUas()));
        
        System.out.println("\nIndex = " + nilai.tampilIndex(nilai.hitungNilaiAkhir(nilai.getQuiz(), nilai.getUts(), nilai.getUas())));
        System.out.println("Keterangan = " + nilai.tampilKeterangan(nilai.tampilIndex(nilai.hitungNilaiAkhir(nilai.getQuiz(), nilai.getUts(), nilai.getUas()))));
    }

}
