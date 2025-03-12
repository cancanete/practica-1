package mates;

public class Matematicas {
    /**
     * Genera una aproximación al número pi mediante el método de
     * Montecarlo. El parámetro `pasos` indica el número de puntos
     * generados.
     */
    public static double generarNumeroPiIterativo(long pasos) {
        long dentroDelCirculo = 0;

        for (long i = 0; i < pasos; i++) {

            double x = Math.random();
            double y = Math.random();


            if (x * x + y * y <= 1) {
                dentroDelCirculo++;
            }
        }


        return (4.0 * dentroDelCirculo) / pasos;
    }
}
