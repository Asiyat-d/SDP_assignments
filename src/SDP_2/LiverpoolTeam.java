package SDP_2;

import java.util.ArrayList;
import java.util.List;

// The base component (Player interface)
interface Player {
    void showPlayerDetails();
}

// Leaf component (Individual players)
class Forward implements Player {
    private String name;

    public Forward(String name) {
        this.name = name;
    }

    @Override
    public void showPlayerDetails() {
        System.out.println(name + " - Forward");
    }
}

class Midfielder implements Player {
    private String name;

    public Midfielder(String name) {
        this.name = name;
    }

    @Override
    public void showPlayerDetails() {
        System.out.println(name + " - Midfielder");
    }
}

class Defender implements Player {
    private String name;

    public Defender(String name) {
        this.name = name;
    }

    @Override
    public void showPlayerDetails() {
        System.out.println(name + " - Defender");
    }
}

class Goalkeeper implements Player {
    private String name;

    public Goalkeeper(String name) {
        this.name = name;
    }

    @Override
    public void showPlayerDetails() {
        System.out.println(name + " - Goalkeeper");
    }
}

// Composite component (Liverpool team as a whole)
class Team implements Player {
    private List<Player> players = new ArrayList<>();

    public void addPlayer(Player player) {
        players.add(player);
    }

    public void removePlayer(Player player) {
        players.remove(player);
    }

    @Override
    public void showPlayerDetails() {
        for (Player player : players) {
            player.showPlayerDetails();
        }
    }
}

// Testing the Composite pattern in action
public class LiverpoolTeam {
    public static void main(String[] args) {
        // Creating individual players
        Player salah = new Forward("Mohamed Salah");
        Player henderson = new Midfielder("Alexis Mac Allister");
        Player vanDijk = new Defender("Virgil van Dijk");
        Player alisson = new Goalkeeper("Alisson Becker");

        // Creating the Liverpool team (composite)
        Team liverpool = new Team();
        liverpool.addPlayer(salah);
        liverpool.addPlayer(henderson);
        liverpool.addPlayer(vanDijk);
        liverpool.addPlayer(alisson);

        // Showing the team details
        System.out.println("Liverpool Team Roster:");
        liverpool.showPlayerDetails();
    }
}
