package HomeWork13Collections;

import java.util.List;

public class Faculty {
    //У факультета: наименование факультета, список групп (List<Group> groups. )

    private String nameFaculty;
    private List<Group> groups;

    public Faculty(String nameFaculty, List<Group> groups) {
        this.nameFaculty = nameFaculty;
        this.groups = groups;
    }

    public String getNameFaculty() {
        return nameFaculty;
    }

    public List<Group> getGroups() {
        return groups;
    }

    @Override
    public String toString() {
        return "Номер факультета: " + nameFaculty + " Cостав группы" + groups;
    }
}
