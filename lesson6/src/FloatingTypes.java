public class FloatingTypes {
    public static void main(String[] args) {

        double number = 15.7;

        int numberInt = (int) number;

        System.out.println("Преобразование типов: " + numberInt);

        long roundedInt = Math.round(number);

        System.out.println("Округление: " + roundedInt);
    }
}
