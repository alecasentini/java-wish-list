
	package org.java.integer;

	public class Numeri {
	    private int[] elenco;
	    private int indice;

	    public Numeri(int[] array) {
	        this.elenco = array;
	        this.indice = 0;
	    }

	    public int getElementoSuccessivo() {
	        if (hasAncoraElementi()) {
	            return elenco[indice++];
	        } else {
	            throw new IllegalStateException("Non ci sono più elementi");
	        }
	    }

	    public boolean hasAncoraElementi() {
	        return indice < elenco.length;
	    }

	    public static void main(String[] args) {
	        int[] array = {2, 3, 5, 7, 11};
	        Numeri ciclatore = new Numeri(array);

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


