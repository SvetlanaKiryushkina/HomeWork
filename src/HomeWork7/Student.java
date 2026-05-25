package HomeWork7;

public class Student {
    /*
    Задача
1.  Создать класс Student c полями id (тип int), name (тип String), surname (тип String),
faculty (факультет, тип String ), course(тип int) , Группа(тип String), средняя оценка (тип int).
Инициализацию студента в классе main выполнять через конструктор с параметрами. Также определите конструктор без параметров.

2. Создать метод, который будет выводить информацию по полям которые есть в классе и назвать его info

3. Создать метод, который будет изменять текущую группу студента (сам метод в качестве параметра будет принимать новую группу)

4. Создать метод, который будет возвращать текущую группу студента.

5. Создать метод, который будет изменять оценку студента и группу
 студента.

6. В классе main создать массив из пяти студентов.

7. Создать метод в классе Student, который будет принимать массив студентов и возвращать из этих студентов,
массив студентов у которых оценка выше переданной оценке в методе. (Сигнатура метода будет выглядеть так
PublicStudent[]getStudents(Students[] students, int mark)

8. В классе main из полученных студентов из задания 7 пройтись в цикле по массиву и вызвать на каждом
студенте метод info, который вы создавали в задании 2
     */

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

//    public static Student[] getStudents(Student[] students, int score) {
//        Student[] newAreyStudent = new Student[5];//объявляем массив
//        int count = 0; //переменная для подсчета
//
//        for (Student student : students) {  //Перебираем студентов из входного массива
//            // Проверяем, подходит ли оценка студента
//            if (student.averageScore > score) {
//                newAreyStudent[count] = student;
//                count++;
//            }
//        }
//        return newAreyStudent;
//    }
}
