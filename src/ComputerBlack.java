/**
 * Created by Марина on 25.11.2017.
 */
public class ComputerBlack {
    protected int number;
    protected String color;

    public ComputerBlack(int number,String color){
        this.number = number;
        this.color = color;
    }

    @Override
    public String toString() {
        return ("Kомпьютер: В наличии, шт: "+number+", Цвет: "+color);
    }

    public void work() {
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}


