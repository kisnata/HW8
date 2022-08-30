import java.io.PrintStream;

public class Main {
    public static void main(String[] args) {

        task1();
        task2();
        task3();
    }
        public static void task1() {

            var firstName = "Ivan";
            var middleName = "Ivanovich";
            var lastName = "Ivanov";
            var fullName = String.format("%s %s %s", lastName, firstName, middleName);
            System.out.printf("ФИО сотрудника - %s", fullName);
        }

    public static void task2() {
        var firstName = "Ivan";
        var middleName = "Ivanovich";
        var lastName = "Ivanov";

        var fullName = String.format("%s %s %s", lastName, firstName, middleName);
        var result = fullName.toUpperCase();
        System.out.printf(" Данные ФИО сотрудника для заполнения отчета - %s", result);
    }
    public static void task3() {
     var fullName = "Иванов Семён Семёнович";
     var split = fullName.split(" ");
     String result = "";
     for (String current : split) {
         if (current.contains("ё")) {
             var replacement = current.replace("ё", "е");
             result += replacement;
         } else {
             result += current;
         }
         result += " ";
     }
         System.out.printf(" Данные ФИО сотрудника - %s", result);
         }
        }


