public class Main {
    public static void main(String[] args) {
        System.out.println("Методы!");
    }



        //Задание 1
        System.out.println("Задание 1");

        public static boolean isLeapYear (int year){
            return year % 4 == 0 && year % 100 !=0 || year % 400 ==0;
        }

        public static void printLeapNotLapYear(int year) {
            if (isLeapYear(year)){
                System.out.println(year + " високосный год");
            }
        }
}