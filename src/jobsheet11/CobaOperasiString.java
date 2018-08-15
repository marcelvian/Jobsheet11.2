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
        
        System.out.println("isi x sama dengan y : " + x.equals(y));
        
        String z = "Operasi";
        System.out.println("isi variable z : " + z);
        System.out.println("isi x sama dengan z (Case sensitive): "
                + x.equals(z));
        
        String r = "Operasi";
        System.out.println("isi variable r : "+ r);
        System.out.println("isi x sama dengan r (Case sensitive) : "
                + x.equals(r));
        System.out.println("isi x sama dengan r(Not case sensitive)"
                + x.equalsIgnoreCase(r));
        