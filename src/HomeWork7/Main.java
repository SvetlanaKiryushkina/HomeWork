package HomeWork7;

public class Main {
    public static void main(String[] args) {

        //Инициализацию студента в классе main выполнять через конструктор с параметрами.
        Student studentOne = new Student(1, "Иванов", "Иван",
                "Информатика", "QA", 125, 563);

        String infoForStudentOne = studentOne.info();//объявляем переменную, что бы вывести инфу о студенте
        System.out.println(infoForStudentOne);
        System.out.println("**********************************");

        //изменяем текущую группу студента
        studentOne.changeGroup("Физкультура");
        String newGroup = studentOne.info();
        System.out.println(newGroup);
        System.out.println("**********************************");

        //Возвращаем текущую группу студента.
        String group = studentOne.getGroup();
        System.out.println("Текущая группа студента: " + group);
        System.out.println("**********************************");

        //изменяем оценку и группу студента
        studentOne.changeScoreAndGroup(10.5, "Экономика");
        String newInfo = studentOne.info();
        System.out.println(newInfo);
        System.out.println("**********************************");

        //В классе main создать массив из пяти студентов
        Student[] arrayFiveStudent = areyStudent(); //переменная массива. 1. Тип переменной Book [] 2. Название переменной 3. Объявление переменной
        for (Student x : arrayFiveStudent) {
            System.out.println(x.info());
        }
        System.out.println("**********************************");

//        Student[] newArrayStudent = areyStudent();
//        int goodScore = 6;
//        Student[] goodStudents = Student.getStudents(newArrayStudent, goodScore);
//            System.out.println(goodStudents[3]);
    }

    public static Student[] areyStudent() {

        Student oneStudent = new Student(1, "Петров", "Петр", "Информатика", "Не известно",
                1, 2);
        Student twoStudent = new Student(2, "Сидоров", "Семен", "Экономика", "Когтевран",
                2, 7.6);
        Student threeStudent = new Student(3, "Спилберг", "Стивен", "Физкультура", "Пуффендуй",
                3, 9.1);
        Student fourStudent = new Student(4, "Толстой", "Лев", "Медицина", "Слизерин",
                4, 8.8);
        Student fiveStudent = new Student(5, "Поттер", "Гарри", "Хогвардс", "Гриффиндор",
                5, 5.8);
        Student areyStudent[] = new Student[5];
        areyStudent[0] = oneStudent;
        areyStudent[1] = twoStudent;
        areyStudent[2] = threeStudent;
        areyStudent[3] = fourStudent;
        areyStudent[4] = fiveStudent;
        return areyStudent;
    }
}
