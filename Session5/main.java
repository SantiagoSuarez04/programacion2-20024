package Session5;

public class main {
    public static void main(String[] args) {
        Superhero hero = new Superhero("batman", 2, new String[] { "be rich", "intelligent" }, true, 1);
        Superhero hero2 = new Superhero("superman", 2, new String[] { "fly", "superStrengh" }, false, 1);
        System.out.println(hero.Sper_name);
        hero.ShowPowers();
        hero2.ShowPowers();
    }
}
