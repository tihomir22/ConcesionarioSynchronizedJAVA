/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fordsyncronization;

import java.util.ArrayList;

/**
 *
 * @author sportak
 */
public class Coche {

    private ArrayList<String> listaStrings = new ArrayList<>();
    private int contadorProv = 1;

    public Coche() {
    }

    public ArrayList<String> getListaStrings() {
        return listaStrings;
    }

    public void setListaStrings(ArrayList<String> listaStrings) {
        this.listaStrings = listaStrings;
    }

    public synchronized void añadirPiezaCocheSync(String pieza) throws InterruptedException {
//        System.out.println(this.listaStrings.size());
        if (this.listaStrings.size() < 5) {
            System.out.println("Agregando pieza " + pieza);
            this.listaStrings.add(pieza + " " + this.contadorProv);
            if (this.listaStrings.size() == 5) {
                System.out.println("coche num" + this.contadorProv + this.listaStrings.toString());
                this.contadorProv++;
                this.notifyAll();
                this.listaStrings.clear();
            } else {
                this.wait();
            }
        }
    }

    @Override
    public String toString() {
        return "Coche{" + "listaStrings=" + listaStrings + '}';
    }

}
