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
public class KeramikCons {
    char merk;
    double panjangKeramik; /*dalam meter*/
    double pcs;
    double lebarKeramik; /*dalam meter*/
    double hargaPerBox;
    
    KeramikCons(double p, double l, double pc, double h){
        this.panjangKeramik = p;
        this.lebarKeramik = l;
        this.pcs = pc;
        this.hargaPerBox = h; 
    }
    
    double HitungButuhKeramik(){
        double butuhKeramik;
        butuhKeramik = 100 / (this.panjangKeramik * this.lebarKeramik);
        return butuhKeramik;
    }
    
    double HitungButuhBox(){
        double butuhBox;
        butuhBox = (100 / (this.panjangKeramik * this.lebarKeramik)) / this.pcs;
        return butuhBox;
    }
    
    double HitungTotalHarga(){
        double totalHarga;
        totalHarga = this.hargaPerBox * ((100 / (this.panjangKeramik * this.lebarKeramik)) / this.pcs);
        return totalHarga; 
    }
}
