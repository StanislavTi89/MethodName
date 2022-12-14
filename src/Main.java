import java.time.LocalDate;

public class Main {
    private final static int CURRENTTEAR = LocalDate.now().getYear();

    public static void main(String[] args) {
        System.out.println("Методы!");
        //Задание 1
        System.out.println("Задание 1");
        printLeapNotLapYear(2020);
        printVersionOS(2015,0);
    }

        public static boolean isLeapYear (int year){
            return year % 4 == 0 && year % 100 !=0 || year % 400 ==0;
        }

        public static void printLeapNotLapYear(int year) {
            if (isLeapYear(year)){
                System.out.println(year + " високосный год");
                return;
            }
            System.out.println(year + " не високосный год");
        }

        public static boolean isNowYear(int year){
        return year == CURRENTTEAR;
        }
        public static String getVersionOS (int versionOS){
        if (versionOS == 0){
            return "iOS";
        }
        return "Android";
        }

        public static void printVersionOS(int year, int versionOS) {
        if (isNowYear(year)){
            System.out.println("Установите полную версию приложения для вашего " + getVersionOS(versionOS));
        } else {
            System.out.println("Установите облегченную версию приложения для вашего " + getVersionOS(versionOS));
        }
        }
}