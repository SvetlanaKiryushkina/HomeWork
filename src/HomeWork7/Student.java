package HomeWork7;

import java.util.ArrayList;
import java.util.List;

public class Student {

    //переменные
    public int id;
    public String surname;
    public String name;
    public String faculty;
    public String group;
    public int course;
    public double averageScore;

    //конструктор с параметрами
    public Student(int id, String surname, String name, String faculty, String group, int course, double averageScore) {
        this.id = id;
        this.surname = surname;
        this.name = name;
        this.faculty = faculty;
        this.group = group;
        this.course = course;
        this.averageScore = averageScore;
    }

    // Конструктор без параметров
    public Student() {
    }

    //Метод, который выводит информацию по полям которые есть в классе и назвать его info
    public String info() {
        String result = "ID студента: " + id + "; Фамилия: " + surname + "; Имя студента: " + name
                + " Факультет: " + faculty + " ; Группа: " + group + " ; Курс: " + course +
                "; Средний бал: " + averageScore;
        return result;
    }

    //Mетод, который изменяет текущую группу студента (сам метод в качестве параметра будет принимать новую группу)
    public void changeGroup(String newGroup) {
        this.group = newGroup;
    }
    //Метод, который возвращает текущую группу студента. Используем гетеры. Работа с полями через методы.
    public String getGroup(){
        return  this.group;
    }

    //Метод, который изменяет оценку студента и группу студента.
    public void changeScoreAndGroup(double newScore, String newGroup) {
        this.averageScore = newScore;
        this.group = newGroup;
    }

    /*
     Создать метод в классе Student, который будет принимать массив студентов и возвращать из этих студентов,
     массив студентов у которых оценка выше переданной оценке в методе. (Сигнатура метода будет выглядеть так
     PublicStudent[]getStudents(Students[] students, int mark)
     */
    //метод с использованием списка
    public static Student[] getStudentsList(Student[] students, int mark) {
        List<Student> filteredStudents = new ArrayList<>();

        for (Student student : students) {
            if (student.averageScore > mark) {
                filteredStudents.add(student);
            }
        }
        // Преобразуем список в массив и возвращаем результат
        return filteredStudents.toArray(new Student[0]);
    }

    /*
     Создать метод в классе Student, который будет принимать массив студентов и возвращать из этих студентов,
     массив студентов у которых оценка выше переданной оценке в методе. (Сигнатура метода будет выглядеть так
     PublicStudent[]getStudents(Students[] students, int mark)
     Вариант с использованием массивов
     */
    public static Student[] getStudentsArray (Student[] students, int mark){
        int count = 0;
        for (Student student : students) {
            if (student.averageScore > mark) {
                count++;
            }
        }

        Student[] newArrayStudents = new Student[count];
        int c = 0;
        for (Student student : students) {
            if (student.averageScore > mark) {
                newArrayStudents[c] = student;
                c++;
            }
        }
        return newArrayStudents;
    }
}
