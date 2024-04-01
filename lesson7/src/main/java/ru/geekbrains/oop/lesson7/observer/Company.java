package ru.geekbrains.oop.lesson7.observer;

import java.util.Random;

public class Company {

    private Random random = new Random();
    private String name;

    private Publisher jobAgency;

    private int maxSalary;

    private JobType jobType;

    private Vacancy vacancy;

    public Company(String name, Publisher jobAgency, int maxSalary, JobType jobType, Vacancy vacancy) {
        this.name = name;
        this.jobAgency = jobAgency;
        this.maxSalary = maxSalary;
        this.jobType = jobType;
        this.vacancy = vacancy;
    }

    public void needEmployee(){
        int salary = random.nextInt(maxSalary);
        jobAgency.sendOffer(name, salary, jobType, vacancy);
    }
}
