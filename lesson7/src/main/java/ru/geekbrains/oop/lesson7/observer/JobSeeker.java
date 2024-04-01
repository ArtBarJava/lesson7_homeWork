package ru.geekbrains.oop.lesson7.observer;

public class JobSeeker implements Observer{

    private String name;
    private int salary;

    private JobType jobType;

    private Vacancy vacancy;

    public JobSeeker(String name, JobType jobType, Vacancy vacancy){
        this.name = name;
        this.jobType = jobType;
        this.vacancy = vacancy;
        salary = 50000;
    }

    @Override
    public void receiveOffer(String nameCompany, int salary, JobType jobType, Vacancy vacancy) {
        if (this.salary <= salary && this.jobType.equals(JobType.REMOTE)) {
            System.out.printf("Соискатель %s: Мне нужна эта работа! (компания: %s; заработная плата: %d; занятость: %s; на должность: %s )\n",
                    name, nameCompany, salary, jobType, vacancy.getTitle());
            this.salary = salary;

        }
        else {
            System.out.printf("-----Соискатель %s: Я найду работу получше! (компания: %s; заработная плата: %d; занятость: %s; на должность: %s )\n",
                    name, nameCompany, salary, jobType, vacancy.getTitle());
        }
    }
}
