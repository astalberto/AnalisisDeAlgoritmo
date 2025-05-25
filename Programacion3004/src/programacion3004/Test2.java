/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package programacion3004;

/**
 *
 * @author alber
 */
import java.util.stream.IntStream;

public class Test2 {

    private static final IntStream values = IntStream.range(100_000, 1_000_000);

    public static void main(String[] args) {
        var results = values.parallel().filter(Test2::isPrime);
        System.out.printf("Nro. primos: %d%n", results.count());
    }

    public static boolean isPrime(int nro) {
        if (nro < 2) {
            return false;
        }
        if (nro == 2) {
            return true;
        }
        if (nro % 2 == 0) {
            return false;
        }
        for (var i = 2; i < nro; i++) {
            if (nro % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static boolean isPrime2(int nro) {
        if (nro < 2) {
            return false;
        }
        if (nro == 2) {
            return true;
        }
        if (nro % 2 == 0) {
            return false;
        }

        int sqrt = (int) Math.sqrt(nro);
        for (int i = 3; i <= sqrt; i += 2) {
            if (nro % i == 0) {
                return false;
            }
        }
        return true;
    }
}
