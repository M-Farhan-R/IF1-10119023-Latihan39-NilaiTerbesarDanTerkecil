/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package if1.pkg10119023.latihan39.nilaiterbesardanterkecil;

/**
 *
 * @author Muhammad Farhan R 
 */
public class Nilai {
    private int max;
    private int min;
    
    public int nilaiTerbesar(int[] nilai){
        max = nilai[0];
        for(int i = 1 ; i < nilai.length ; i++){
            if(max < nilai[i])
                max = nilai[i];
        }
        System.out.println("Nilai Terbesar adalah "+max);
        return max;
    }
    
    public int nilaiTerendah(int[] nilai){
        min = nilai[0];
        for(int i = 1 ; i < nilai.length ; i++){
            if(min>nilai[i])
                min = nilai[i];
        }
        System.out.println("Nilai Terkecil adalah "+min);
        return min;
    }
}
