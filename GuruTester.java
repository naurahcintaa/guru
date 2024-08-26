import java.util.Scanner;
public class GuruTester {
        //constructor
    public static void main(String[] args) {
        //String-->int-->double
        Scanner input = new Scanner(System.in);
        System.out.println("Nama: ");
        String nama = input.nextLine();
        System.out.println("Mapel: ");
        String id = input.nextLine();
        System.out.println("Status: ");
        String Status = input.nextLine();
        System.out.println("NIP: ");
        int ipk = input.nextInt();
        input.close();

        
        KelasGuru buPasha = new KelasGuru(2024, "Pasha", "RPL", "tetap");
        KelasGuru pakT = new KelasGuru(1945, "T", "Olahraga", "tetap");
        KelasGuru buAul = new KelasGuru(2025, "Aul", "RPL", "tetap");
        KelasGuru pakFirman = new KelasGuru(2232, "Firman", "BK", "tetap");
        KelasGuru pakTulus = new KelasGuru(2222, "Tulus", "IPAS", "tetap");
        
    }
}
    

