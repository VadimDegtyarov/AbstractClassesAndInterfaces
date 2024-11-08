package Lab1;

import java.util.Scanner;

public class Seller extends Worker implements Info, Workable {
    public Seller() {
        super("Продавец");
        this.commissionRate=0.2f;
    }

    double commissionRate;

    public double getCommissionRate() {
        return commissionRate;
    }

    public void setCommissionRate(double commissionRate) {
        this.commissionRate = commissionRate;
    }

    @Override
    public void onLeave() {
        System.out.println("Продавец взял отпуск");
    }

    @Override
    public void working() {
        System.out.println("Продавец работает");
    }

    @Override
    public void showInfo() {
        System.out.println("Имя продавца " + getName() + " .Должность " + getPost() + " .Зарплата " + getSalary() + " .Стаж " + getExperience() +
                " .Процент который берет продавец " + getCommissionRate() + " .");
    }

    @Override
    public void setInfo() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Имя продавца:");
        setName(scan.next());
        System.out.print("Зарплата:");
        setSalary(scan.nextInt());
        System.out.print("Стаж:");
        setExperience(scan.nextInt());
        System.out.print("Процент который берет продавец:");
        setCommissionRate(scan.nextDouble());
    }
}
