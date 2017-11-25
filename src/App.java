/**
 * Created by Марина on 25.11.2017.
 */
public class App {
    public static void main (String [] args){
        ComputerBlack computerBlack = new ComputerBlack(1,"Black");
        Keyboard keyboard = new Keyboard(1,"White","Сom-порт" );
        Monitor monitor = new Monitor(1,"Black",32 );

        System.out.println(computerBlack);
        System.out.println(keyboard);
        System.out.println(monitor);

    }

}
