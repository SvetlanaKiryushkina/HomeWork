package HomeWork13Collections;

import java.util.ArrayList;
import java.util.List;

public class Mail {
    /*
2. Создать класс студент (Student), группа (Group), факультет (Faculty).
У студента поля: имя, фамилия, дата рождения, город рождения, средний бал.
У группы: номер группы, коллекция студентов (List<Student> students)
У факультета: наименование факультета, список групп (List<Group> groups. )
Реализовать во всех классах методы геттеры и сеттеры. - готово
1.1. Создать несколько студентов. - готово
1.2. Создать несколько групп. По этим группам распределить студентов. (метод коллекции add) - готово
1.3. Создать Факультет. Распределить туда группы. (метод коллекции add) - готово
1.4. Реализовать метод в классе Group, который должен пройти по всем студентам в группе и удалить тех,
у кого средний бал ниже переданной оценки в параметре метода. (метод remove).
Сигнатура метода: public void removeStudentsByMark(int mark); - готово
1.5. Реализовать метод, если в группе меньше 2 человек, перевести этих студентов в другую группу.
(методы коллекций size(), addAll()); Сигнатура метода: public void transferToGroup(Group newGroup);= готово
1.6. Реализовать метод в классе Group, который считает средний бал по группе. Сигнатуру и название придумайте сами. - готово
1.7*. Добавить поле для факультета энамовского типа: ACTIVE (Активный) и NOT_ACTIVE (Неактивный факультет).
Реализовать геттеры и сеттеры.
1.8* Реализовать метод по смене статуса факультета: Если общее количество студентов на факультете меньше 20-сделать факультет неактитвным. (Метод size() в коллекции)
1.9*. Вывести студентов в порядке возрастания среднего бала
1.10*. Вывести студентов в порядке убывания среднего бала.0
     */

    public static void main(String[] args) {

        Student studentOne = new Student("Иван", "Иванов", "21.09.1987", "Минск", 10);
        Student studentTwo = new Student("Петр", "Петров", "01.01.2005", "Брест", 6);
        Student studentThree = new Student("Сидр", "Сидоров", "02.02.2000", "Витебск", 8);
        Student studentFour = new Student("Алекс", "Пушкин", "01.01.1896", "Питер", 9);

        List<Student> students = new ArrayList<>();
        students.add(studentOne);
        students.add(studentThree);
        students.add(studentFour);
        students.add(studentTwo);

        List<Student> students1 = new ArrayList<>();
        students1.add(studentTwo);
        students1.add(studentFour);

        Group groupOne = new Group(10, students);
        Group groupTwo = new Group(20, students1);

        List<Group> groups = new ArrayList<>();
        groups.add(groupOne);

        List<Group> groups20 = new ArrayList<>();
        groups20.add(groupTwo);

        Faculty faculty = new Faculty("Экономический", groups20);
        List<Faculty> faculties = new ArrayList<>();
        faculties.add(faculty);
        System.out.println(faculties);

        System.out.println(groupOne.adgScoreStudentInGroup());

        System.out.println("Размер списка " + students.size());

        groupOne.removeStudentsByMark(8);
        System.out.println("ФИО студентов с высоким баллом " + groupOne.getNameStudent());

        groupTwo.transferToGroup(groupOne);
        System.out.println(groupTwo);
        System.out.println(groupOne.getNameStudent());



    }
}
