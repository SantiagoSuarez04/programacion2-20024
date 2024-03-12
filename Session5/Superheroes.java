package Session5;

import java.util.ArrayList;

public class Superheroes {
    ArrayList<Superhero> dc_Superheros = new ArrayList<>();

    public void addSperheroesDC() {
        dc_Superheros.add(new Superhero("batman", 2, new String[] { "be rich", "intelligent" }, true, 1));
        dc_Superheros.add(new Superhero("superman", 2, new String[] { "fly", "superStrengh" }, false, 1));
    }

    public void Showsuperinformation() {
        for (var i = 0; i < dc_Superheros.size(); i++) {
            System.out.println(dc_Superheros.get(i).Sper_name);
        }
    }
}
