package session8_lists.challenges;

import java.util.ArrayList;
import java.util.List;

public class challenge8 {

    public static void main(String[] args) {
        String[] movieList = {"Barbie", "Oppenheimer", "Interstellar"};
        ArrayList<String> arrayList = new ArrayList<>(List.of(movieList));

        String movie = "Oppenheimer";
        System.out.println(arrayList.indexOf(movie));

    }
}