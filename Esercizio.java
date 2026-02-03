public class Main {
    public static void main(String[] args) {
        Lista<String> rubrica = new Lista<>();
        
        System.out.println("=== RUBRICA CONTATTI ===\n");
        
        // Aggiungo contatti con vari metodi
        rubrica.aggiungiInTesta("Alice");
        rubrica.aggiungiInCoda("Bob");
        rubrica.aggiungiInCoda("Charlie");
        rubrica.aggiungiInTesta("Zoe");
        rubrica.aggiungiInPosizione("Marco", 2);
        
        System.out.println("Lista iniziale:");
        System.out.println(rubrica);
        System.out.println("Dimensione: " + rubrica.size());
        
        // Cerco un contatto
        String cercato = "Marco";
        int posizione = rubrica.indiceDi(cercato);
        System.out.println("\nPosizione di " + cercato + ": " + posizione);
        
        // Leggo in varie posizioni
        System.out.println("Primo contatto: " + rubrica.leggiTesta());
        System.out.println("Ultimo contatto: " + rubrica.leggiCoda());
        System.out.println("Contatto in posizione 2: " + rubrica.leggiInPosizione(2));
        
        // Rimuovo per nome
        System.out.println("\nRimuovo 'Bob'...");
        rubrica.cancella("Bob");
        System.out.println(rubrica);
        
        // Rimuovo per posizione
        System.out.println("\nRimuovo posizione 1...");
        String rimosso = rubrica.cancellaInPosizione(1);
        System.out.println("Rimosso: " + rimosso);
        System.out.println(rubrica);
        
        // Verifico presenza
        System.out.println("\nContiene 'Alice'? " + rubrica.contiene("Alice"));
        System.out.println("Contiene 'Bob'? " + rubrica.contiene("Bob"));
        
        // Dimensione finale
        System.out.println("\nDimensione finale: " + rubrica.size());
        System.out.println("Lista vuota? " + rubrica.isEmpty());
        
        // Concateno un'altra lista
        Lista<String> altriContatti = new Lista<>();
        altriContatti.aggiungiInCoda("Diana");
        altriContatti.aggiungiInCoda("Eva");
        
        System.out.println("\nConcateno altri contatti...");
        rubrica.concatena(altriContatti);
        System.out.println(rubrica);
        System.out.println("Dimensione finale: " + rubrica.size());
    }
}