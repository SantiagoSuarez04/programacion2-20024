package Session5;

public class Superhero {
    public String Sper_name = "";
    public int superpowers = 0;
    public String[] superpower = new String[superpowers];
    public boolean isAlive = false;
    public int universe = 0;

    public Superhero(String super_name_param, int superpowers_param, String[] superpower_param, boolean isAlive_param,
            int universe_param) {
        this.Sper_name = super_name_param;
        this.superpowers = superpowers_param;
        this.superpower = superpower_param;
        this.isAlive = isAlive_param;
        this.universe = universe_param;

    }

    public void ShowPowers() {
        for (int i = 0; i < superpower.length; i++) {
            System.out.println(superpower[i]);
        }
    }
}
