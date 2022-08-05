public class Main {
    public static void main(String[] args) {


        //задание 1
        int i = 0;
        while (i < 10) {

            i++;
            System.out.print(i + " ");
        }
        System.out.println();
        for (; i >= 1; i--) {
            System.out.printf("%d " , i);
        }
        System.out.println();

        //задание 2
        int oneFriday = 5;
        for (int friday = oneFriday; friday <=31; friday += 7){
            System.out.printf("Сегодня пятница, %d-e число.Необходимо подготовить отчет, %n",friday);
        }

        //задание 3
        /*int period = 79;
        int currentYear = 2022;
        int start = currentYear - 200;
        int end = curerntYear + 100;
        int startYear = 0;
        for (int year = start; year <= end; year++){
        if (year % period == startYear) {
        system.out.println(year);
        }
        } */

        int periodFlight = 79;
        int yearsOnPeriodView = 2102;
        int peridVied = yearsOnPeriodView - periodFlight;
        for (int yearFlight = 0; yearFlight < peridVied; yearFlight ++){
            //Каждый год проверяем, является ли он летним и принадлежащим периоду просмотра
            if (yearFlight % 79 ==0){
                if ((yearFlight + periodFlight) < 2102 && 1822 <(yearFlight + periodFlight)){
                    //Выводим сообщение
                    System.out.println("летний год " + (yearFlight + periodFlight));
                }
            }
        }

    }
}