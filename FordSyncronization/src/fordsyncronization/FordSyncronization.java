/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fordsyncronization;

/**
 *
 * @author sportak
 */
public class FordSyncronization {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Coche cochazo = new Coche();

        Proveedor prov1 = new Proveedor("Motor", cochazo);
        Proveedor prov2 = new Proveedor("Vidres", cochazo);
        Proveedor prov3 = new Proveedor("Rodes", cochazo);
        Proveedor prov4 = new Proveedor("Sistema Electric", cochazo);
        Proveedor prov5 = new Proveedor("Accesoris", cochazo);

        prov1.start();
        prov2.start();
        prov3.start();
        prov4.start();
        prov5.start();

    }

}
