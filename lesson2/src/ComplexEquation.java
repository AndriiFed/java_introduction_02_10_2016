public class ComplexEquation {
    public static void main(String[] args) {
        //a + b * 2 + 5 / (c + 9)
        int a = 5;
        int b = 7;
        int c = 12;

        int result = a + b * 2 + 5 / (c + 9); //приоритет как в математике
        System.out.println("Результат: " + result);

        System.out.println(); //переход на следующую строку
    }
}
