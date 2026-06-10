package HomeWork13Collections;

public class Student {
    //У студента поля: имя, фамилия, дата рождения, город рождения, средний бал.
    private String name;
    private final String surname;
    private String birthday;
    private String cityOfBirth;
    private double averageScore;

    public Student(String name, String surname, String birthday, String cityOfBirth, double averageScore) {
        this.name = name;
        this.surname = surname;
        this.birthday = birthday;
        this.cityOfBirth = cityOfBirth;
        this.averageScore = averageScore;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getAverageScore() {
        return averageScore;
    }

    public void setAverageScore(double averageScore) {
        this.averageScore = averageScore;
    }

    public String getCityOfBirth() {
        return cityOfBirth;
    }

    public void setCityOfBirth(String cityOfBirth) {
        this.cityOfBirth = cityOfBirth;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public String getSurname() {
        return surname;
    }

    //Переопределим equals и hashCode для работы с коллекциями они нужны обязательно
    public boolean equals(Object obj) {
        if (!(obj instanceof Student student)) {
            return false;
        }
        return name.equals(student.getName())
                && surname.equals(student.getSurname())
                && birthday.equals(student.getBirthday())
                && cityOfBirth.equals(student.getCityOfBirth())
                && averageScore == getAverageScore();
    }

    public int hashCode() {
        int result = name.hashCode() + surname.hashCode() + birthday.hashCode()
                + cityOfBirth.hashCode() + (int) averageScore;
        return result;
    }

    @Override
    public String toString() {
        return "Имя: " + name + '\'' +
                "фамилия: " + surname + '\'' +
                "день рождения: " + birthday + '\'' +
                "город рождения: " + cityOfBirth + '\'' +
                "средний балл: " + averageScore;
    }
}
