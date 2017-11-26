import java.util.Arrays;

/**
 * Created by Марина on 26.11.2017.
 */
public class Stroka {
    public static void main(String[] args)
    {
        String stroka = new String("Java - строго типизированный  объектно-ориентированный язык программирования, разработанный компанией Sun Microsystems в последующем приобритенной компанией Oracle");
        System.out.println(stroka);
        System.out.println("Длина строки "+stroka.length()); // Задание1. длина строки

        String stroka2 = new String( "Schoner Tag!");
        stroka2 = stroka2.intern(); // задание3.создание строки с помощью конструктора и занесение строки в пул литералов

        if (stroka.equals(stroka2)){
            System.out.println ("Строки совпадают.") ;    // задание2.сранвение 2х строк
            }
        else {
            System.out.println ("Cроки не совпадают.");
            }

        String stroka3 = "Good day!";
        String stroka4 = stroka3 + stroka; // Задание 4. объединение строк с созданием класса
        System.out.println (stroka4);


        String stroka5 = "Super ";
        stroka5 = stroka5 +"day!";
        stroka5 = stroka5.concat(""); // Задание5. строк без созданием класса
        System.out.println (stroka5);

        char [] array = stroka.toCharArray();
        for (int i = 0; i < array.length; i++ ) {
            System.out.println(array[i]); // Задание 6.
        }

        byte [] array2 = stroka.getBytes();
        System.out.println("Преобразовали строку в байты: "+ Arrays.toString(array2)); // Задание 7.

        System.out.println(stroka.toUpperCase()); // Задание 8.

        int index1 = stroka.indexOf("a");
        System.out.println(stroka.indexOf("a")); // Задание 9.поиск первого вхождения символа в строке

        int index2 = stroka.lastIndexOf("a");
        System.out.println(index2); // Задание 10.поиск последнего вхождения символа в строке


        String stroka8 = "Sun";                       // Слово для поиска.
        if (stroka.matches("(.*)Sun(.*)")) {
        System.out.println("Есть слово Sun в строке ");
         }
        else {
            System.out.println("Не найдено"); //Задание 11.поиск слова Sun}
        }

        boolean end = stroka.endsWith("Oracle");
        System.out.println(end); // Задание 12. проверка окончания строки

        boolean start = stroka.startsWith("Java");
        System.out.println(start); // Задание 13. проверка начала строки

        String stroka6 = stroka.replace("a", "o");
        System.out.println(stroka6); // Задание 14. замена символов в строке

        String stroka7 = stroka.substring(44,90);
        System.out.println(stroka7); // Задание 15. получить подстроку


        StringBuilder strokaBuilder = new StringBuilder(stroka);
        System.out.println(strokaBuilder.toString()); // Задание 17. сделать из строки строку с типом StringBuilder

        StringBuilder strokaBuilder2 = new StringBuilder(stroka);
        strokaBuilder2.append(".");
        System.out.println(strokaBuilder2.toString()); // Задание 18. добавить символ точки

        StringBuilder strokaBuilder3 = new StringBuilder(stroka);
        String stroka9 = strokaBuilder3.substring(0,76);
        System.out.println(stroka9); // Задание 19. обрезка строки до 76 символа

        StringBuilder strokaBuilder4 = new StringBuilder(stroka);
        strokaBuilder4.reverse();
        System.out.println(strokaBuilder4); // Задание 20. обратная последовательность
    }


}
