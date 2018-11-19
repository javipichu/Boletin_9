/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin9_1;

import java.util.Scanner;

/**
 *
 * @author jalvarezotero
 */
class cuentaNumeros {
    

    private int num1;
    private int num2;
    private int num3;
    private int num4;
    private int num5;
    private int num6;
    private int num7;
    private int num8;
    private int num9;
    private int num10;

    public void pedirNum() {
        Scanner ler = new Scanner(System.in);
        System.out.println("Número 1 : ");
        num1 = ler.nextInt();
        System.out.println("Número 2 : ");
        num2 = ler.nextInt();
        System.out.println("Número 3 : ");
        num3 = ler.nextInt();
        System.out.println("Número 4 : ");
        num4 = ler.nextInt();
        System.out.println("Número 5 : ");
        num5 = ler.nextInt();
        System.out.println("Número 6 : ");
        num6 = ler.nextInt();
        System.out.println("Número 7 : ");
        num7 = ler.nextInt();
        System.out.println("Número 8 : ");
        num8 = ler.nextInt();
        System.out.println("Número 9 : ");
        num9 = ler.nextInt();
        System.out.println("Número 10 : ");
        num10 = ler.nextInt();

    }

    public void contarNum() {
        int cuenta = 0;
        int pos = 0;
        int neg = 0;
        int cero = 0;

        for (cuenta = 0; cuenta < 10; cuenta++){
            if (num1 > 0) {
                pos++;
            } else if (num1 < 0) {
                neg++;
            } else {
                cero++;
            }

        num1 = num2;
        num2 = num3;
        num3 = num4;
        num4 = num5;
        num5 = num6;
        num6 = num7;
        num7 = num8;
        num8 = num9;
        num9 = num10;
        }
          
        System.out.println("Positivos: "+pos+"\nNegativos: "+neg+"\nCeros: "+cero);
    }
    
}
