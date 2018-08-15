package jobsheet11;

import java.util.Locale;

public class CobaOperasiString {
    public static void main(String[] args) {
       
        String identitas = "Marcel Sinko Octavian / X RPL 3 / 21";
        System.out.println("Identitas : "+ identitas);
        
                    String x = "Operasi";
        System.out.println("Isi variable x : "+ x);
        System.out.println("\""+ x + "\" panjang karakter = "+x.length());
        
        
        System.out.println("x adalah kosong : " + x.isEmpty());
        
        String y = "";
        System.out.println("Isi variable y : "+ y);
        System.out.println("y adalah kosong "
                + "  " + y.isEmpty());