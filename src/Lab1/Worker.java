package Lab1;

public abstract class Worker {
    private String name;
    private int salary;
    private int experience;
    private String post;

    public String getPost() {
        return post;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int getExperience() {
        return experience;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }

    public Worker(String post) {
        this.post = post;
        this.experience = 0;
        this.name = "Empty";
        this.salary = 0;
    }
}
