package HomeWork13Collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Group {
    //У группы: номер группы, коллекция студентов (List<Student> students)
    private int numberGroup;
    private List<Student> students;

    public Group(int numberGroup, List<Student> students) {
        this.numberGroup = numberGroup;
        this.students = students;
    }

    public int getNumberGroup() {
        return numberGroup;
    }

    public void setNumberGroup(int numberGroup) {
        this.numberGroup = numberGroup;
    }

    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }

    //Переопределим equals и hashCode для работы с коллекциями они нужны обязательно

    public boolean equals(Object obj) {
        if (!(obj instanceof Group)) {
            return false;
        }

        Group group = (Group) obj;
        if (numberGroup == group.getNumberGroup() && students.equals(group.students)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        int result = students.hashCode() + numberGroup;
        return result;
    }

    @Override
    public String toString() {
        return "Номер группы: " + numberGroup + '\'' + "Список студентов: " + students;
    }

    /*
1.4. Реализовать метод в классе Group, который должен пройти по всем студентам в группе и удалить тех,
у кого средний бал ниже переданной оценки в параметре метода. (метод remove).
Сигнатура метода: public void removeStudentsByMark(int mark);
     */
    public void removeStudentsByMark(int mark) {
        Iterator<Student> iterator = students.iterator();

        while (iterator.hasNext()) {
            Student currentStudent = iterator.next();

            if (currentStudent.getAverageScore() < mark) {
                iterator.remove();
            }
        }
    }
    /*
    1.5. Реализовать метод, если в группе меньше 2 человек, перевести этих студентов в другую группу.
(методы коллекций size(), addAll()); Сигнатура метода: public void transferToGroup(Group newGroup)
     */

    public void transferToGroup(Group newGroup) {
        if (students.size() <= 2) {
            newGroup.students.addAll(this.students);
            this.students.clear();
        }
    }

    public List<String> getNameStudent() {

        List<String> nameStudents = new ArrayList<>();
        List<Student> students = this.getStudents();

        for (Student student : students) {
            nameStudents.add(student.getSurname());
        }
        return nameStudents;
    }

    /*
1.6. Реализовать метод в классе Group, который считает средний бал по группе. Сигнатуру и название придумайте сами.
     */

    public double adgScoreStudentInGroup() {
        List<Student> students = this.getStudents();
        double totalScore = 0;

        // пробежимся по списку и суммируем баллы каждого студента
        for (Student student : students) {
            totalScore += student.getAverageScore();
        }
        return totalScore / students.size();
    }
}
