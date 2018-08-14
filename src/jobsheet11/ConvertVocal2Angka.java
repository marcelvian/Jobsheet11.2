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
            
             public static String vocal2Angka(String kalimat)
    {
        char[][] arConvert = 
        {{'a','4'},{'i','l'},{'u','2'},{'e','3'},{'o','0'}};
        kalimat = kalimat.toLowerCase();
        for (int i = 0; i < arConvert.length; i++)
        {
            kalimat = kalimat.replace(arConvert[i][0], arConvert[i][1]);       
        }
         return kalimat; 
         
          private static void tampilPerkata(String kalimat, String convert)
    {
        String[] arrKal = kalimat.split(" ");
        String[] arrCon = convert.split(" ");
        
        for (int i = 0; i < arrCon.length; i++) {
            System.out.println(arrKal[i] + " => " + arrCon[i]);
              }
    }
    private static void tampilHasil(String convert)
    {
        System.out.println("Kalimat alay angka : " + convert);
    }
    
    public static void main(String[] args){
        String identitas = "Marcel sinko octavian / XRPL3 /21";
        
        tampilJudul(identitas);
        String kalimat = tampilInput();
        String convert = vocal2Angka(kalimat);
        tampilPerkata(kalimat, convert);
        tampilHasil(convert);
    }
    }

    
        
             
}
    

    

