/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package memilihkeramikcons;

/**
 *
 * @author hasna_madikha
 */
public class MemilihKeramikCons {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        KeramikCons A = new KeramikCons( 0.3, 0.3, 10, 54000);
        System.out.println("Merk keramik A");
        System.out.println("Jumlah Keramik yang dibutuhkan : " + Math.ceil(A.HitungButuhKeramik()) + " biji");
        System.out.println("Jumlah box yang dibutuhkan : " + Math.ceil(A.HitungButuhBox()) + " box");
        System.out.println("Total harga keramik : " + Math.ceil(A.HitungTotalHarga()) + " rupiah"); 
        
        KeramikCons B = new KeramikCons( 0.4, 0.4, 5, 65000);
        System.out.println("Merk keramik B");
        System.out.println("Jumlah Keramik yang dibutuhkan : " + Math.ceil(B.HitungButuhKeramik()) + " biji");
        System.out.println("Jumlah box yang dibutuhkan : " + Math.ceil(B.HitungButuhBox()) + " box");
        System.out.println("Total harga keramik : " + Math.ceil(B.HitungTotalHarga()) + " rupiah");
        
        KeramikCons C = new KeramikCons( 0.4, 0.3, 8, 60000);
        System.out.println("Merk keramik A");
        System.out.println("Jumlah Keramik yang dibutuhkan : " + Math.ceil(C.HitungButuhKeramik()) + " biji");
        System.out.println("Jumlah box yang dibutuhkan : " + Math.ceil(C.HitungButuhBox()) + " box");
        System.out.println("Total harga keramik : " + C.HitungTotalHarga() + " rupiah");
    }
    
}
