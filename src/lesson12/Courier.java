package lesson12;

public class Courier implements Worker {

    //Каждый раз когда сотрудник выполняет свою работу (вызов метод doWork()),
    // ему выплачивается заработная плата (сокр. ЗП) (80 - сборщику, 100 - курьеру).
    //А также при вызове doWork() у Сборщика, происходит увеличение значения
    // поля countOrder в классе Warehouse на 1.
    // При вызове doWork() у Курьера, происходит увеличение переменной balance в классе Warehouse на 1000.
    private int salary;
    private Warehouse warehouse;
    private boolean getBonus = true;

    public Courier(Warehouse warehouse) {
        this.warehouse = warehouse;
    }

    public int getSalary() {

        return salary;
    }

    @Override
    public String toString() {
        return "Courier{" +
                "salary=" + salary +
                '}';
    }

    @Override
    public void doWork() {
        salary += 100;
        warehouse.setBalance(warehouse.getBalance() + 1000);
    }

    @Override
    public void bonus() {
        if (warehouse.getBalance() >= 1_000_000 && getBonus) {
            salary *= 2;
            getBonus = false;
        }
    }
}
