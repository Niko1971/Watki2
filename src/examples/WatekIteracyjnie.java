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
public class WatekIteracyjnie extends Watek {

    long time;
    long start = 0;
    long stop = 0;

    WatekIteracyjnie() {

    }

    WatekIteracyjnie(int liczba) {
        System.out.println("Utworzono watek " + liczba);
    }

    public int silniaIteracyjnie(int n) {
        int z = 1;
        int s = 1;
        while (z <= n) {
            s = s * z;
            z++;
        }
        return s;
    }

    public long getTime() {
        return time;
    }

    @Override
    public void run() {
        start = System.nanoTime();
        silniaIteracyjnie(liczba);
        stop = System.nanoTime();
        time = stop - start;
    }
}
