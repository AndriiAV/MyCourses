package site;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.StringJoiner;

public class Posters {
    private final ArrayList<Poster> listOfPosters = new ArrayList<>();

    public void sortingByName (){
// сортування по імені курсу, який міститься в оголошенні
    }
    public void sortingByDate (){
        Collections.sort(listOfPosters, new Comparator<Poster>() {
                    @Override
                    public int compare(Poster o1, Poster o2) {
                        return  o1.getStartDate().compareTo(o2.getStartDate());
                    }
                }
        );
    }
    public void filteringByName (){
    }
    public void filteringByDate (){
    }

    public void add(Poster poster) {
        listOfPosters.add(poster);
    }
    public void remove (Poster poster) {
        listOfPosters.remove(poster);
    }

    public ArrayList<Poster> getListOfPosters() {
        return listOfPosters;
    }

    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner("\n");
            for (Poster poster: listOfPosters) {
                joiner.add(poster.toString());
            }
            return "Posters:\n" + joiner.toString();
        }
}
