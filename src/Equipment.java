/**
 * Created by Марина on 26.11.2017.
 */
abstract class Equipment {
    int quantity ;
    String Sostoynie ;

    Equipment (int q, String s ){
        quantity = q;
        Sostoynie = s;
    }

    abstract void action();
}

