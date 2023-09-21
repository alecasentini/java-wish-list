package org.java.integer;

import java.util.ArrayList;
import java.util.List;

public class Numeri {
    private List<Integer> elenco;
    private int indice;

    public Numeri() {
        this.elenco = new ArrayList<>();
        this.indice = 0;
    }

    public Numeri(int[] array) {
        this();
        for (int num : array) {
            elenco.add(num);
        }
    }

    public void addElemento(int elemento) {
        elenco.add(elemento);
    }

    public int getElementoSuccessivo() {
        if (hasAncoraElementi()) {
            return elenco.get(indice++);
        } else {
            throw new IllegalStateException("Non ci sono più elementi");
        }
    }

    public boolean hasAncoraElementi() {
        return indice < elenco.size();
    }

    public static void main(String[] args) {
        Numeri ciclatore = new Numeri();

        ciclatore.addElemento(2);
        ciclatore.addElemento(3);
        ciclatore.addElemento(5);
        ciclatore.addElemento(7);
        ciclatore.addElemento(11);
        ciclatore.addElemento(13);

        while (true) {
            if (ciclatore.hasAncoraElementi()) {
                int elemento = ciclatore.getElementoSuccessivo();
                System.out.println("Elemento successivo: " + elemento);
                if (ciclatore.hasAncoraElementi()) {
                    System.out.println("C'è un altro elemento");
                    System.out.println("Premi Invio per continuare...");

                    try {
                        System.in.read();
                        System.in.skip(1);
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                } else {
                    System.out.println("Non ci sono più elementi");
                }
            } else {
                break;
            }
        }
    }
}