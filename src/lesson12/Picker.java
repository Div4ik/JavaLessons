package lesson12;

public class Picker implements Worker {
    //- “Сборщик” (англ. Picker), с полем salary, только get метод.

    private int salary;
    private Warehouse warehouse;

    public Picker(Warehouse warehouse) {
        this.warehouse = warehouse;
    }

    public int getSalary() {
        return salary;
    }

    @Override
    public void doWork() {
        salary += 80;
        warehouse.setCountOrder(warehouse.getCountOrder() + 1);
    }

    @Override
    public void bonus() {

    }

    @Override
    public String toString() {
        return "Picker{" +
                "salary=" + salary +
                '}';
    }
}
