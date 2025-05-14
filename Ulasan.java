/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ulasan;

/**
 *
 * @author Fadwa Pamulasih
 */
public class Ulasan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Flora kelengkeng = new Flora();
        System.out.println("Nama Pohon : "+ kelengkeng.nama);
        
        Rambutan rambutan = new Rambutan();
        System.out.println("Nama Pohon : "+ rambutan.buah);
    }
    
}
