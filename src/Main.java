public class Main {
    public static void main(String[] args) {

        //Exercise 1

        int count = 1;

        while (count <= 10) {
            if (count == 10) {
                System.out.println(count);
                break;
            }
            System.out.print(count + " ");
            count++;

        }

        for (int i = 10; i >= 1; i--) {
            if (i == 1) {
                System.out.println(i);
                break;
            }
            System.out.print(i + " ");
        }


        //Exercise 2

        int firstFriday = 4;

        for (int i = firstFriday; i <= 31; i = i + 7) {
            System.out.println("Сегодня пятница, " + i + "-е число. Необходимо подготовить отчет.");
        }


        //Exercise 3

        int currentYear = 2021;
        int pastYear = 1821;
        int futureYear = 2121;

        for (int i = 0; i <= 2121; i = i + 79) {
            if (i >= pastYear) {
                System.out.println(i);
            }
        }

        //Exercise 4


        for (int i = 1; i <= 30; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println(i + ": ping pong");
            } else if (i % 5 == 0) {
                System.out.println(i + ": pong");
            } else if (i % 3 == 0) {
                System.out.println(i + ": ping");
            } else {
                System.out.println(i);
            }

        }

        //Exercise 5

        int sum = 0;

        int num1 = 0;
        int num2 = 1;
        System.out.print(num1 + " " + num2 + " ");

        while (sum < 34) {
            sum = num1 + num2;
            System.out.print(sum + " ");
            num1 = num2;
            num2 = sum;

        }


    }
}