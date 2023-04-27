package lesson13StreamField;

public class StringBuild {
    public static void main(String[] args) {
        String s = "Hello";
        String s1 = new String(" world");
        String s2 = "!";
        String s3 = s + s1 + s2;
        System.out.println("s3 = " + s3);

        StringBuilder superS = new StringBuilder("Hello");
        superS.append(" world!");

        System.out.println("superS = " + superS);


        String string = "";
        StringBuilder stringBuilder = new StringBuilder();

        for (int i = 0; i <= 20000; i++) {
            string += " " + Integer.toString(i);

        }
        System.out.println("string = " + string);
    }


}
