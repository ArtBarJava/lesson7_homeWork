package ru.geekbrains.oop.lesson7.observer;

public class Program {

    /**
     *  TODO: Доработать приложение, которое разрабатывалось на семинаре,
     *  поработать с шаблоном проектирования Observer,
     *  добавить новый тип соискателя.
     *  Добавить новую сущность "Вакансия", компания должна рассылать вакансии.
     *  Только после этого вы можете усложнить ваше приложение (при желании), например,
     *  добавить тип вакансии (enum),
     *  учитывать тип вакансии при отправке предложения соискателю.
     *  ***. Добавить возможность отписаться от рассылки новых вакансий.
     * @param args
     */
    public static void main(String[] args) {

        Publisher publisher = new JobAgency();

        Vacancy vacancy1 = new Vacancy("Backend Java Developer");
        Vacancy vacancy2 = new Vacancy("Frontend Developer");
        Vacancy vacancy3 = new Vacancy("FullSteck Developer");

        Company google = new Company("Google", publisher, 120000, JobType.PART_TIME, vacancy1);
        Company yandex = new Company("Yandex", publisher, 95000, JobType.FULL_TIME, vacancy2);
        Company geekBrains = new Company("GeekBrains", publisher, 98000, JobType.REMOTE, vacancy3);

        Student student1 = new Student("Студент #1", vacancy2);
        Master master1 = new Master("Мастер #1", JobType.REMOTE, vacancy2);
        Master master2 = new Master("Мастер #2", JobType.PART_TIME, vacancy3);
        JobSeeker jobSeeker1 = new JobSeeker("Соискатель #1", JobType.FULL_TIME, vacancy3);

        publisher.registerObserver(student1);
        publisher.registerObserver(master1);
        publisher.registerObserver(master2);
        publisher.registerObserver(jobSeeker1);

        for (int i = 0; i < 5; i++){
            google.needEmployee();
            yandex.needEmployee();
            geekBrains.needEmployee();

        }

    }

}
