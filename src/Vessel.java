/**
 * Created by Марина on 26.11.2017.
 */
public class Vessel {
    private String sostoynie;

    public Vessel(String sostoynie)
    {
        this.sostoynie = sostoynie;
    }

    public boolean equals(Object obj)
    {
        if(obj == this)
            return true;

        if(obj == null)
            return false;


        if(!(getClass() == obj.getClass())) //тип ссылки
            return false;
        else
        {
            Vessel tmp = (Vessel)obj;
            if(tmp.sostoynie == sostoynie)
                return true;
            else
                return false;
        }
    }

    public static void main(String[] args)
    {
        Vessel water = new Vessel("Водная");
        Vessel underwater =  new Vessel("Подводная");

        if(water.equals(underwater))
            System.out.println("Лодки одинаковые по виду!");
        else
            System.out.println("Лодки разные. Осторожно!Вы можете купить поводную лодку вместо яхты :)");
    }

}

