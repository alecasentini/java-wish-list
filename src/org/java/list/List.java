package org.java.list;

import java.util.ArrayList;
import java.util.Scanner;

public class List {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        ArrayList<String> regali  = new ArrayList<String>();
        ArrayList<String> destinatari = new ArrayList<String>();


        while (true) {
            System.out.print("Inserisci un regalo da aggiungere alla lista: ");
            String regalo = sc.nextLine();
            regali.add(regalo);
            
            System.out.print("Inserisci il destinatario del regalo: ");
            String destinatario = sc.nextLine();
            destinatari.add(destinatario);

            
            System.out.println("Numero di regali in lista: " + regali.size());

            System.out.print("Vuoi aggiungere un altro regalo alla lista? (Y/n): ");
            String risposta = sc.nextLine();

            if (risposta.equalsIgnoreCase("n")) {
                break;
            }
        }

        System.out.println("Ecco la lista dei regali:");
        for (int i = 0; i < regali.size(); i++) {
            String regalo = regali.get(i);
            String destinatario = destinatari.get(i);
            System.out.println((i + 1) +") " + regalo + " per " + destinatario);
        }
    }
}
