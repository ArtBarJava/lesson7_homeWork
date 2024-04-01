package ru.geekbrains.oop.lesson7.observer;

import java.util.ArrayList;
import java.util.Collection;

public class JobAgency implements Publisher{


    private Collection<Observer> observers = new ArrayList<>();

    @Override
    public void sendOffer(String companyName, int salary, JobType jobType, Vacancy vacancy) {
        for (Observer observer : observers){
            observer.receiveOffer(companyName, salary, jobType, vacancy);
        }

    }


    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }
}
