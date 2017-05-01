package site;

import java.util.ArrayList;

public class Groups {
    private ArrayList<Group> listOfGroups = new ArrayList<>();

    public void sorting (){
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
