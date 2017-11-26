/**
 * Created by Марина on 26.11.2017.
 */
class Plane extends Equipment {
    Plane (int q, String s ){
       super(q, s);
    }
    void action(){
        System.out.println("Самолет");
    }
}
