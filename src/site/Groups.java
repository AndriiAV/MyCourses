package site;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Groups {
    private ArrayList<Group> listOfGroups = new ArrayList<>();

    public void sortingByTeacher (){
        Collections.sort(listOfGroups, new Comparator<Group>() {
                    @Override
                    public int compare(Group o1, Group o2) {
                        return  o1.getTeacher().compareTo(o2.getTeacher());
                    }
                }
        );
    }

    public void sortingByCourse (){
        Collections.sort(listOfGroups, new Comparator<Group>() {
                    @Override
                    public int compare(Group o1, Group o2) {
                        return  o1.getCourse().compareTo(o2.getCourse());
                    }
                }
        );
    }

    public void filtering (){
    }

    public void add(Group group) {
        listOfGroups.add(group);
    }
    public void remove (Group group) {
        listOfGroups.remove(group);
    }

    public ArrayList<Group> getListOfCourses() {
        return listOfGroups;
    }
}
