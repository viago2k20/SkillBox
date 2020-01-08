import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class Main
{
    private static int minIncome = 200000;//минимальная сумма дохода компании
    private static int maxIncome = 900000;//максимальная сумма дохода компании

    private static int officeRentCharge = 140000;//плата за аренду помещения
    private static int telephonyCharge = 12000;//плата за обслуживание телефонной связи
    private static int internetAccessCharge = 7200;//плата за интернет

    private static int assistantSalary = 45000;//зарплата ассистента
    private static int financeManagerSalary = 90000;//зарплата финансового менеджера

    private static double mainTaxPercent = 0.24;//основной процент налога
    private static double managerPercent = 0.15;//процент менеджера

    private static double minInvestmentsAmount = 100000;//минимальная сумма инвестирования

       public static void main(String[] args)
    {
        //расчет минимальной суммы дохода для инвестирования
        int i = minIncome;
        double t = 0;
        double m;
        while (t < 1)
        {
            i++;
            m = i*managerPercent;
            t = i/(calculateFixedCharges()+m+(i-m-calculateFixedCharges())*mainTaxPercent + minInvestmentsAmount);
        }
        System.out.println("Минимальная сумма дохода для инвестирования: " + i);

        while(true)
        {
            System.out.println("Введите сумму доходов компании за месяц " +
                "(от 200 до 900 тысяч рублей): ");
            int income = (new Scanner(System.in)).nextInt();

            if(!checkIncomeRange(income)) {
                continue;
            }

            double managerSalary = income * managerPercent;//вычисляет зарплаты менеджера
            double pureIncome = income - managerSalary -
                calculateFixedCharges();//вычисляет чистый доход
            double taxAmount = mainTaxPercent * pureIncome;//вычисляет общую сумму налога
            double pureIncomeAfterTax = pureIncome - taxAmount;//вычисляет доход после вычета налога

            boolean canMakeInvestments = pureIncomeAfterTax >=
                minInvestmentsAmount;//условие при котором компания может инвестировать

            System.out.println("Зарплата менеджера: " + managerSalary);//выводит в консоль зарплату менеджера
            System.out.println("Общая сумма налогов: " +
                (taxAmount > 0 ? taxAmount : 0));//выводит в консоль общую сумму налогов
            System.out.println("Компания может инвестировать: " +
                (canMakeInvestments ? "да" : "нет"));//выводит в консоль может ли компания инвестировать
            if(pureIncome < 0) {
                System.out.println("Бюджет в минусе! Нужно срочно зарабатывать!");
            }
        }
    }

    private static boolean checkIncomeRange(int income)//метод, который проверяет меньше или больше введенная сумма указанных границ
    {
        if(income < minIncome)
        {
            System.out.println("Доход меньше нижней границы");
            return false;
        }
        if(income > maxIncome)
        {
            System.out.println("Доход выше верхней границы");
            return false;
        }
        return true;
    }

    private static int calculateFixedCharges()//метод возвращает сумму постоянных ежемесячных затрат
    {
        return officeRentCharge +
                telephonyCharge +
                internetAccessCharge +
                assistantSalary +
                financeManagerSalary;
    }
}
