import java.util.Scanner;


public class Ex5String {

	public static void main(String[] args) {
		
		// Création d’un objet Scanner pour lire les entrées utilisateur
		Scanner scan = new Scanner(System.in);
		
		// Appel du bloc 5.1
        concatExamples(scan);
        // Appel du bloc 5.2
        searchWordInPhrase(scan);
        // Bloc 5.3 : Remplacement du mot
        replaceWordInPhrase(scan);
        
        // Fermeture du scanner
        scan.close();

	}
	
	// Méthode utilitaire pour demander une saisie utilisateur
	public static String askUserInput(Scanner input, String message) {
	    System.out.print(message);
	    return input.nextLine();
	}
	
	 // Bloc 5.1 : Concaténation
    public static void concatExamples(Scanner input) {
    	
        System.out.println("=== 5.1 : Concaténation de chaînes ===");
       
        String text1 =  askUserInput(input," Entrez la première chaîne : ") ;
        
        String text2 = askUserInput(input, " Entrez la deuxième chaîne : ");
       
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
    	
    	System.out.println("\n=== 5.2 : Recherche d'un mot dans une phrase ===");
    	
    	// Lecture de la phrase complète
    	String phrase = askUserInput(input, " Entrez une phrase : ");
        
        // Lecture du mot recherché (peut contenir plusieurs caractères)
    	String word = askUserInput(input, " Entrez le mot à rechercher : ");
        
     /*   
        String phraseLower = phrase.toLowerCase();
        String wordLower = word.toLowerCase();
      */  
        String regexWrd = "(?i)\\b" + word + "\\b"; // (?i) => ignore la casse

        //boolean found = phraseLower.contains(wordLower); // .contains() verifie les sous-chaînes
        boolean found = phrase.matches(".*" + regexWrd + ".*");
        
        if (found) {
            System.out.printf("Résultat : mot (%s) trouvé !", word);
        } else {
            System.out.println("Résultat : mot non trouvé.");
            
        }
        
        System.out.println(" Phrase : " + phrase);
        System.out.println("Mot recherché : " + word);
    }
   
    
   
}
