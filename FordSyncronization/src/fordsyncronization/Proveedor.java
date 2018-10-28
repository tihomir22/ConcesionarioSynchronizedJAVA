/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fordsyncronization;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author sportak
 */
public class Proveedor extends Thread {

    private String pieza;
    private Coche coc;

    @Override
    public void run() {
        for (int i = 0; i < 30; i++) {
            try {
                this.coc.añadirPiezaCocheSync(this.pieza);
            } catch (InterruptedException ex) {
                Logger.getLogger(Proveedor.class.getName()).log(Level.SEVERE, null, ex);
            }

        }

    }

    public Proveedor(String pieza, Coche coch) {
        this.pieza = pieza;
        this.coc = coch;
    }

    public String getPieza() {
        return pieza;
    }

    public void setPieza(String pieza) {
        this.pieza = pieza;
    }

    public Coche getCoc() {
        return coc;
    }

    public void setCoc(Coche coc) {
        this.coc = coc;
    }

    @Override
    public String toString() {
        return "Proveedor{" + "pieza=" + pieza + ", coc=" + coc + '}';
    }

}
