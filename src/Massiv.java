/**
 * Created by Марина on 15.11.2017.
 */
public class Massiv {
        public static void main(String[]args) {
            int[] massiv = {7,2,10,4};
            int min = massiv[0];
            for (int i = 0;i < massiv.length;i++) {
                if (min > massiv[i]) {
                    massiv [i]=min;
                }
            }
            System.out.println("Mинимальное значение:"+min);

            double[] massiv1 = {1.5,3.6,10.7};
            double mind = massiv1[0];
            for (int j = 0; j < massiv1.length; j++) {
                if (mind < massiv1[j]) {
                    massiv1 [j] = mind;
                }
            }
            System.out.println("Mаксимальное значение:"+mind);

            int[] massiv2 = {7, 3, 10, 5};
            double summa = 0;
            for (int i = 0; i < massiv2.length; i++) {
                summa = summa + massiv2[i];
            }
            double srednee = summa/massiv2.length;
            System.out.println("Среднее значение:" + srednee);
        }
}




