/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Tutorial;

/**
 *
 * @author User2
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // void itu artinya hampa
        System.out.println(simpel());
        fungsiVoid("apa pun");
        selamatPagi("emak");
        selamatPagi("abah");
    }
    private static void selamatPagi(String nama){
        System.out.println("selamat pagi " + nama);
    }
    // fungsi atau method tanpa kembalian
    private static void fungsiVoid(String input){
       System.out.println(input);
    }
    // fungsi atau method dengan kembalian
    // sehingga menggunakan return untuk
    // mengembalikan nilainya (10.0f)
    private static float simpel(){
        return 10.0f;
    }
}
