package ru.geekbrains.oop.lesson7.observer;

public class Student implements Observer{

    private String name;
    private int salary;

    private JobType jobType;

    private Vacancy vacancy;

    public Student(String name, Vacancy vacancy){
        this.name = name;
        jobType = JobType.PART_TIME;
        this.vacancy = vacancy;
        salary = 5000;
    }


    @Override
    public void receiveOffer(String nameCompany, int salary, JobType jobType, Vacancy vacancy) {
        if (this.salary <= salary && this.jobType.equals(JobType.PART_TIME)){
            System.out.printf("Студент %s: Мне нужна эта работа! (компания: %s; заработная плата: %d; занятость: %s; на должность: %s )\n",
                    name, nameCompany, salary, jobType, vacancy.getTitle());
            this.salary = salary;
        }
        else {
            System.out.printf("-----Студент %s: Я найду работу получше! (компания: %s; заработная плата: %d; занятость: %s; на должность: %s ) \n",
                    name, nameCompany, salary, jobType, vacancy.getTitle());
        }
    }
}
