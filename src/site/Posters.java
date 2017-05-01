package site;

import java.util.ArrayList;
import java.util.StringJoiner;

public class Posters {
    private final ArrayList<Poster> listOfPosters = new ArrayList<>();

    public void sortingByName (){
    }
    public void sortingByDate (){
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
