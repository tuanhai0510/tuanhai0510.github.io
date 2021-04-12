import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Team {

    ArrayList<Player> allPlayer = new ArrayList<Player>();

    ArrayList<Player> getAllPlayer() {

        allPlayer.add(new Player("Marc-André ter Stegen ", 1, Position.GK));
        allPlayer.add(new Player("Sergiño Dest ", 2, Position.DF));
        allPlayer.add(new Player("Gerard Piqué ", 3, Position.DF));
        allPlayer.add(new Player("Ronald Araújo ", 4, Position.DF));
        allPlayer.add(new Player("Sergio Busquets ", 5, Position.MF));
        allPlayer.add(new Player("Antoine Griezmann ", 6, Position.FW));
        allPlayer.add(new Player("Miralem Pjanić ", 7, Position.MF));
        allPlayer.add(new Player("Martin Braithwaite ", 8, Position.FW));
        allPlayer.add(new Player("Lionel Messi ", 9, Position.FW));
        allPlayer.add(new Player("Ousmane Dembélé ", 10, Position.FW));
        allPlayer.add(new Player("Riqui Puig ", 11, Position.MF));
        allPlayer.add(new Player("Neto ", 12, Position.GK));
        allPlayer.add(new Player("Clément Lenglet ", 13, Position.DF));
        allPlayer.add(new Player("Pedri ", 14, Position.MF));
        allPlayer.add(new Player("Francisco Trincão ", 15, Position.FW));
        allPlayer.add(new Player("Jordi Alba ", 16, Position.DF));
        allPlayer.add(new Player("Matheus Fernandes ", 17, Position.MF));
        allPlayer.add(new Player("Sergi Roberto ", 18, Position.DF));
        allPlayer.add(new Player("Frenkie de Jong ", 19, Position.MF));
        allPlayer.add(new Player("Ansu Fati ", 20, Position.FW));
        allPlayer.add(new Player("Samuel Umtiti ", 21, Position.DF));
        allPlayer.add(new Player("Junior Firpo ", 22, Position.DF));
        return allPlayer;

    }

    ArrayList<Player> buildTeam = new ArrayList<Player>();

    public ArrayList<Player> buildTeam() {
        buildTeam = new ArrayList<Player>();
        Random general = new Random();
        int goalKeeperSize = 0;
        int defenderSize = 0;
        int midFieldSize = 0;
        int forwarderSize = 0;
        System.out.println("");
        System.out.println("Line-up: ");
        while (goalKeeperSize < 1) {
            int rdGoalKeeper = general.nextInt(22);
            if (allPlayer.get(rdGoalKeeper).getPosition().equals(Position.GK)) {
                buildTeam.add(allPlayer.get(rdGoalKeeper));
                goalKeeperSize++;
            }
        }
        while (defenderSize < 4) {
            int rdDefender = general.nextInt(22);
            if (allPlayer.get(rdDefender).getPosition().equals(Position.DF)
                    && !buildTeam.contains(allPlayer.get(rdDefender))) {
                buildTeam.add(allPlayer.get(rdDefender));
                defenderSize++;
            }
        }
        while (midFieldSize < 4) {
            int rdMidField = general.nextInt(22);
            if (allPlayer.get(rdMidField).getPosition().equals(Position.MF)
                    && !buildTeam.contains(allPlayer.get(rdMidField))) {
                buildTeam.add(allPlayer.get(rdMidField));
                midFieldSize++;
            }
        }
        while (forwarderSize < 2) {
            int rdForwarder = general.nextInt(22);
            if (allPlayer.get(rdForwarder).getPosition().equals(Position.FW)
                    && !buildTeam.contains(allPlayer.get(rdForwarder))) {
                buildTeam.add(allPlayer.get(rdForwarder));
                forwarderSize++;
            }
        }
        return buildTeam;
    }

    public ArrayList<Player> buildTeam1(int defender, int midfielder, int forwarder) {
        buildTeam = new ArrayList<Player>();
        Random general = new Random();
        int gateKeeperSize = 0;
        int defenderSize = 0;
        int midFieldSize = 0;
        int forwaderSize = 0;
        System.out.println("List player: ");
        while (gateKeeperSize < 1) {
            int rdGateKeeper = general.nextInt(22);
            if (allPlayer.get(rdGateKeeper).getPosition().equals(Position.GK)) {
                buildTeam.add(allPlayer.get(rdGateKeeper));
                gateKeeperSize++;
            }
        }

        while (defenderSize < defender) {
            int rdDefender = general.nextInt(22);
            if (allPlayer.get(rdDefender).getPosition().equals(Position.DF)
                    && !buildTeam.contains(allPlayer.get(rdDefender))) {
                buildTeam.add(allPlayer.get(rdDefender));
                defenderSize++;
            }

        }

        while (midFieldSize < midfielder) {
            int rdMidField = general.nextInt(22);
            if (allPlayer.get(rdMidField).getPosition().equals(Position.MF)
                    && !buildTeam.contains(allPlayer.get(rdMidField))) {
                buildTeam.add(allPlayer.get(rdMidField));
                midFieldSize++;
            }
        }

        while (forwaderSize < forwarder) {
            int rdForwader = general.nextInt(22);
            if (allPlayer.get(rdForwader).getPosition().equals(Position.FW)
                    && !buildTeam.contains(allPlayer.get(rdForwader))) {
                buildTeam.add(allPlayer.get(rdForwader));
                forwaderSize++;
            }
        }

        buildTeam.forEach(System.out::println);

        return buildTeam;
    }
}