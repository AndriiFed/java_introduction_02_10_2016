public class ManyIfs {
    public static void main(String[] args) {
        int dayOfTheWeek = 3;

        if (dayOfTheWeek == 1) {
            System.out.println("Понедельник");
        } else if (dayOfTheWeek == 2) {
            System.out.println("Вторник");
        } else if (dayOfTheWeek == 3) {
            System.out.println("Среда");
        } else {
            System.out.println("Такого дня недели не существует");
        }
    }
}
