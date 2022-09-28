public class Main {
    public static void main(String[] args) {

        //Exercise 1
        byte clientOS=0;
        if (clientOS==0) {
            System.out.println("Установите версию приложения для iOS по ссылке https://online.sberbank.ru/CSAFront/index.do");
        } else if (clientOS==1) {
            System.out.println("Установите версию приложения для Android по ссылке http://www.sberbank.ru/sms/apk/");
        } else {
            System.out.println("Введите значение 0, если у Вас iOS или 1, если у Вас Android");
        }
        System.out.println();


        //Exercise 2
        int clientDeviceYear=2014;
        boolean oldIOS=clientOS==0&&clientDeviceYear<2015&&clientDeviceYear>2000, newIOS=clientOS==0&&clientDeviceYear>=2015&&clientDeviceYear<=2022;
        boolean oldAndroid=clientOS==1&&clientDeviceYear<2015&&clientDeviceYear>2000, newAndroid=clientOS==0&&clientDeviceYear>=2015&&clientDeviceYear<=2022;
        if (oldIOS) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        } else if (newIOS) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else if (oldAndroid) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        } else if (newAndroid) {
            System.out.println("Установите версию приложения для Android по ссылке");
        } else {
            System.out.println("Проверьте введеные данные");
        }
        System.out.println();


        //Exercise 3
        int year=400;
        boolean year4=year%4==0, year100=year%100==0, year400=year%400==0;
        String yearVis=" год является високосным", yearNotVis=" год не является високосным";
        System.out.println(year400? year + yearVis:
                           year100? year + yearNotVis:
                           year4?   year + yearVis:year + yearNotVis);
        System.out.println();


        //Exercise 4
        int deliveryDistance=66;
        int days=1;
        if (deliveryDistance>0&&deliveryDistance<20) {
            days+=1;
        }
        if (deliveryDistance>=20&&deliveryDistance<60) {
            days+=1;
        }
        if (deliveryDistance>=60&&deliveryDistance<=100) {
            days+=1;
        }
        System.out.println("Потребуется дней: " + days);
        System.out.println();


        //Exercise 5
        int monthNumber=3;
        switch (monthNumber) {
            case 1:
            case 2:
            case 12:
                System.out.println(monthNumber + " месяц принадлежит к сезону зима");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println(monthNumber + " месяц принадлежит к сезону весна");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println(monthNumber + " месяц принадлежит к сезону лето");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println(monthNumber + " месяц принадлежит к сезону осень");
                break;
            default:
                System.out.println("Проверьте номер введеного месяца");
        }

    }
}