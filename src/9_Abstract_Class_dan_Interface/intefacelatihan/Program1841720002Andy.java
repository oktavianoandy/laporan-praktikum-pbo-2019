package intefacelatihan;

public class Program1841720002Andy {

    public static void main(String[] args) {
        Rektor1841720002Andy pakRektor = new Rektor1841720002Andy();

        Mahasiswa1841720002Andy mahasiswaBiasa = new Mahasiswa1841720002Andy("Charlie");
        Sarjana1841720002Andy sarjanaCumlaude = new Sarjana1841720002Andy("Dini");
        PascaSarjana1841720002Andy masterCumlaude = new PascaSarjana1841720002Andy("ELok");
                      
        //pakRektor.beriSetifikatCumlaudeAndy(mahasiswaBiasa);
        pakRektor.beriSetifikatCumlaudeAndy(sarjanaCumlaude,sarjanaCumlaude);
        pakRektor.beriSetifikatCumlaudeAndy(masterCumlaude,masterCumlaude);
        
        //penambahan pada percobaan 3
        pakRektor.beriSetifikatMawapresAndy(sarjanaCumlaude);
        pakRektor.beriSetifikatMawapresAndy(masterCumlaude);
    }
}
