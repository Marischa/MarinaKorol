/**
 * Created by Марина on 25.11.2017.
 */
public class Keyboard extends ComputerBlack {
    private final int number;
    private final String color;
    protected String connection = "Через Сom-порт";

    public String getConnection() {
        return connection;
    }
    public Keyboard(int number,String color, String connection) {
        super(number, color);
        this.number = number;
        this.color = color;
        this.connection = connection;
    }

    @Override
    public String toString() {
        return ("Клавиатура: В наличии, шт: "+number+", Цвет: "+color+ ", Подключение через: "+connection);
    }

    public void setConnection(String connection) {
        this.connection = connection;
    }

    public void sostoynie(){
        System.out.println("Подключен к компьютеру");
    }

    @Override
    public void work() {
        super.work();

    }
}


