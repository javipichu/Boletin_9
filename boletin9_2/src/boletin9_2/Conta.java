/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin9_2;

/**
 *
 * @author jalvarezotero
 */
class Conta {

    void sumayProducto() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        double conta;
        double sum = 10;
        double producto = 10;

        for (conta = 11; conta < 90; conta++) {
            sum = sum + conta;
            producto = producto * conta;
        }
        System.out.println("Suma total: " + sum + "\nProducto total: " + producto);
    }
}
