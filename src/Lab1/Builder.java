package Lab1;

import java.util.Scanner;

public class Builder extends Worker implements Info, Workable {
    int projectsCompleted;

    public Builder() {
        super("Строитель");
        this.projectsCompleted = 0;
    }

    public int getProjectsCompleted() {
        return projectsCompleted;
    }

    public void setProjectsCompleted(int projectsCompleted) {
        this.projectsCompleted = projectsCompleted;
    }
    @Override
    public void onLeave() {
        System.out.println("Строитель взял отпуск");
    }

    @Override
    public void working() {
        System.out.println("Строитель работает");
    }

    @Override
    public void showInfo() {
        System.out.println("Имя строителя " + getName() + " .Должность " + getPost() + " .Зарплата " + getSalary() + " .Стаж " + getExperience()  +
                " .Количество законченных проектов " + getProjectsCompleted() + " .");

    }

    @Override
    public void setInfo() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Имя строителя:");
        setName(scan.next());
        System.out.print("Зарплата:");
        setSalary(scan.nextInt());
        System.out.print("Стаж:");
        setExperience(scan.nextInt());
        System.out.print("Сколько законченных проектов:");
        setProjectsCompleted(scan.nextInt());

    }
}
