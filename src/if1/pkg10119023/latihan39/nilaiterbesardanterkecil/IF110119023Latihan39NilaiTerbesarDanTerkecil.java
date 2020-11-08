/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package if1.pkg10119023.latihan39.nilaiterbesardanterkecil;

/**
 *
 * @author 
 * NAMA              : Muhammad Farhan R 
 * KELAS             : IF1
 * NIM               : 10119023
 * Deskripsi Program : program menentukan nilai tebesar dan terkecil
 *
 */
import java.util.Scanner;
public class IF110119023Latihan39NilaiTerbesarDanTerkecil {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        IF110119023Latihan39NilaiTerbesarDanTerkecil a = new IF110119023Latihan39NilaiTerbesarDanTerkecil();
        Nilai n = new Nilai();
        a.inputData();
        a.tampilNilai();
        n.nilaiTerbesar(nilai);
        n.nilaiTerendah(nilai);
        System.out.println();
        System.out.println("Petugas : ".concat(a.petugas));
    }
    
    private String petugas;
    private int mhs;
    private static int[] nilai;
    
    public void inputData(){
        Scanner scan = new Scanner(System.in);
        System.out.println("=====Program Nilai Terbesar dan Terkecil Mahasiswa=====");
        System.out.print("Masukkan Nama Petugas\t : "); petugas = scan.next();
        System.out.print("Masukkan Banyak Nilai Mahasiswa : "); mhs = scan.nextInt();
        nilai = new int[mhs];
        for(int i = 1;i<=mhs;i++){
            System.out.print("Masukkan Nilai Mahasiswa ke-"+i+" = ");
            nilai[i-1] = scan.nextInt();
        }
        System.out.println();
    }
    
    public void tampilNilai(){
        System.out.println("=====Hasil Nilai Mahasiswa=====");
        for(int i = 1 ; i <= mhs ; i++){
            System.out.println("Nilai Mahasiswa ke-"+i+" = "+nilai[i-1]);
        }
        System.out.println();
    }

}
