/**
 * Created by Марина on 26.11.2017.
 */
public class ResAbstract {
    public static void main(String args[]) {
        Car car = new Car(1, "Неработоспособно");
        Plane plane = new Plane(3, "Работоспособно");

        Equipment equipments;
        equipments = car;
        System.out.println("Состояние машины"+ equipments.Sostoynie + "Наличие "+equipments.quantity);
        equipments = plane;
        System.out.println("Состояние самолета"+ equipments.Sostoynie + "Наличие "+equipments.quantity);

    }
}



