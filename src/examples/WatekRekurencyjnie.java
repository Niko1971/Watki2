/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examples;

/**
 *
 * @author Bercik
 */
public class WatekRekurencyjnie extends Watek {

    long time;

    WatekRekurencyjnie() {

    }

    WatekRekurencyjnie(int liczba) {
        System.out.println("Utworzono watek " + liczba);
    }

    public int silniaRekurencyjnie(int i) {
        if (i == 0) {
            return 1;
        } else {
            return i * silniaRekurencyjnie(i - 1);
        }
    }

    public long getTime() {
        return time;
    }

    @Override
    public void run() {
        long start = 0;
        long stop = 0;
        start = System.nanoTime();
        silniaRekurencyjnie(liczba);
        stop = System.nanoTime();
        time = stop - start;
    }
}
