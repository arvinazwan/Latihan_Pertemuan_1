/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author RIA FITRIANI
 */
public class latihan5 {
    // Variabel jumlahkambing menjadi variabel instance
    
    int jumlahKambing = 88;
    
    //Method untuk menampilkan jumlah kambing 
    public void tambahkambing(){
        System.out.println("Jumlah kambing: " + jumlahKambing);
    }
    
    public void tambahKambing() {
        jumlahKambing = jumlahKambing + 5;
        System.out.println("jumlah kambing setelah ditambah: " + jumlahKambing);
        
    }
    
   public static void main(String[] args) {
       kambingGlobal kambingSusu = new kambingGlobal();
       
       //Menampilkan jumlah kambing yang ada saat program pertama x berjalan 
       kambingSusu.getJumlahKambing();
       
       //Menambah satu kambing
       kambingSusu.tambahKambing();
       
       //Menampilkan jumlah kambingyang ada 
       kambingSusu.getJumlahKambing();
   }
    
}
