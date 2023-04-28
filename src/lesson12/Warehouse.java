package lesson12;

public class Warehouse {
    //- “Склад” (англ. Warehouse).
    //Поля: countOrder (количество собранных заказов),
    // balance (доход от доставленных заказов).
    //Get и set методы для обоих полей.
    // Для получения информации о значениях полей склада переопределите метод toString().

    private int countOrder;
    private int balance;

    public int getCountOrder() {
        return countOrder;
    }

    public int getBalance() {
        return balance;
    }

    public void setCountOrder(int countOrder) {
        this.countOrder = countOrder;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    @Override
    public String toString() {
        return "Warehouse{" +
                "countOrder=" + countOrder +
                ", balance=" + balance +
                '}';
    }
}
