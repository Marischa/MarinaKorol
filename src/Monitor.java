/**
 * Created by Марина on 25.11.2017.
 */
public class Monitor extends ComputerBlack {
    private final int number;
    private final String color;
    protected int diaonal;

    public Monitor(int number,String color,int diaonal) {
        super(number,color);
        this.number = number;
        this.color = color;
        this.diaonal = diaonal;
    }

    @Override
    public String toString() {
        return ("Монитор: В наличии, шт: "+number+", Цвет: "+color+ ", Диагональ: "+diaonal);
    }

    public int getDiaonal() {
        return diaonal;
    }

    public void setDiaonal(int diaonal) {
        this.diaonal = diaonal;
    }

    public void bright() {
        System.out.println("Яркость в передлах нормы");
    }

    @Override
    public void work() {
        super.work();
    }
}
