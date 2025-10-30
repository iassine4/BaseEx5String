import java.util.Scanner;


public class Ex5String {

	public static void main(String[] args) {
		
		// Création d’un objet Scanner pour lire les entrées utilisateur
		Scanner scan = new Scanner(System.in);
		
		// Appel du bloc 5.1
        concatExamples(scan);

	}
	
	 // Bloc 5.1 : Concaténation
    public static void concatExamples(Scanner input) {
    	
        System.out.println("=== Bloc 5.1 : Concaténation de chaînes ===");
        System.out.print(" Entrez la première chaîne : ");
        String text1 = input.nextLine();
        
        System.out.print(" Entrez la deuxième chaîne : ");
        String text2 = input.nextLine();
       
        // --- Méthode 1 : avec l’opérateur + ---
        /*
        String text1 = "Bonjour";
        String text2 = "le monde";
        */
        String result1 = text1 + " " + text2;
        System.out.println("Méthode 1 (+) : " + result1);
        
        // --- Méthode 2 : avec concat() ---
        String result2 = text1.concat(" ").concat(text2);
        System.out.println("Méthode 2 (concat) : " + result2);
        
        // --- Méthode 3 : avec StringBuilder ---
        StringBuilder strBuil = new StringBuilder();
        
        strBuil.append(text1).append(" ").append(text2);
        String result3 = strBuil.toString();
        System.out.println("Méthode 3 (StringBuilder) : " + result3);
    }
    
   
}
