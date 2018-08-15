
package jobsheet11;

import java.util.Scanner;

public class ConvertVocal2Angka {
    private static void tampilJudul(String identitas) 
    {
        System.out.println("Identitas : " + identitas);
        
        System.out.println("\nConvert kalimat alay angka (vokal ke anka)\n");
    }
     private static String tampilInput()
            {
                Scanner scanner = new Scanner (System.in);
            
            System.out.println("Masukan kalimat : ");
            String kalimat = scanner.nextLine();
            System.out.println("kalimat kali : " + kalimat);
            
            return kalimat;
            }