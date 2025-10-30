import java.util.Scanner;


public class Ex5String {

	public static void main(String[] args) {
		
		// Création d’un objet Scanner pour lire les entrées utilisateur
		Scanner scan = new Scanner(System.in);
		
		// Appel du bloc 5.1
        concatExamples(scan);
        // Appel du bloc 5.2
        searchWordInPhrase(scan);

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
    
    // Bloc 5.2 : Rechercher un mot dans une phrase
    public static void searchWordInPhrase(Scanner input) {
    	
    	System.out.println("\n=== Bloc 5.2 : Recherche d'un mot dans une phrase ===");
    	
    	// Lecture de la phrase complète
        System.out.print(" Entrez une phrase : ");
        String phrase = input.nextLine();
        
     // Lecture du mot recherché (peut contenir plusieurs caractères)
        System.out.print(" Entrez le mot à rechercher : ");
        String word = input.nextLine();
        
        String phraseLower = phrase.toLowerCase();
        String wordLower = word.toLowerCase();
        
        boolean found = phraseLower.contains(wordLower);
        
        if (found) {
            System.out.printf("Résultat : mot %s trouvé !", word);
        } else {
            System.out.println("Résultat : mot non trouvé.");
            
        }
        
        System.out.println(" Phrase : " + phrase);
        System.out.println("Mot recherché : " + word);
    }
   
}
