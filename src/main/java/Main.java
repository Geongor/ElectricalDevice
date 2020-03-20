import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {

        Manager manager = new Manager();
        manager.PrintList();
        manager.TotalPower();

        System.out.println("\n\nПосле сортировки:\n");

        manager.SortByPower();
        manager.PrintList();

        System.out.println("\n\nВ диапазоне от 500 до 1700:\n");

        manager.RangeOfPower(500,1700);
    }
}
