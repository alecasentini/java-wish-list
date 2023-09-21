package org.java.list;

import java.util.ArrayList;
import java.util.Scanner;

public class List {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        ArrayList<String> regali = new ArrayList<String>();

        while (true) {
            System.out.print("Inserisci un regalo da aggiungere alla lista: ");
            String regalo = sc.nextLine();

            regali.add(regalo);
            
            System.out.println("Numero di regali in lista: " + regali.size());

            System.out.print("Vuoi aggiungere un altro regalo alla lista? (Y/n): ");
            String risposta = sc.nextLine();

            if (risposta.equalsIgnoreCase("n")) {
                break;
            }
        }

        System.out.println("Ecco la lista dei regali:");
        for (String regalo : regali) {
            System.out.println(regalo);
        }
    }
}
