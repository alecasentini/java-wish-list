package org.java.word;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Word {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Inserisci una parola: ");
        String parola = sc.nextLine().toLowerCase();

        Map<Character, Integer> charCounter = new HashMap<>();

        for (int i = 0; i < parola.length(); i++) {
            char carattere = parola.charAt(i);

            
            if (Character.isLetter(carattere)) {
                charCounter.put(carattere, charCounter.getOrDefault(carattere, 0) + 1);
            }
        }

        for (Map.Entry<Character, Integer> entry : charCounter.entrySet()) {
            char carattere = entry.getKey();
            int conteggio = entry.getValue();
            System.out.println(carattere + ":" + conteggio);
        }
    }
}

