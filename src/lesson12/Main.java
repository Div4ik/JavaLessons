package lesson12;

public class Main {
    public static void main(String[] args) {
        Warehouse warehouse1 = new Warehouse();
        Courier courier = new Courier(warehouse1);
        Picker picker = new Picker(warehouse1);


        System.out.println(picker + " " + courier);
        System.out.println(warehouse1);
        picker.doWork();

        courier.doWork();
        System.out.println(picker + " " + courier);
        System.out.println(warehouse1);

        for (int i = 0; i < 1500; i++) {
            courier.doWork();
            picker.doWork();
        }

        System.out.println(picker + " " + courier);
        System.out.println(warehouse1);
//        System.out.println(courier.getSalary());
//        courier.doWork();
//        System.out.println(courier.getSalary());


    }
}
