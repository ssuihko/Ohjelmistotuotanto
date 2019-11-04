package ohtuesimerkki;

import java.util.ArrayList;
import java.util.List;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class StatisticsTest {

    Reader readerStub = new Reader() {

        public List<Player> getPlayers() {
            ArrayList<Player> players = new ArrayList<>();

            players.add(new Player("Semenko", "EDM", 4, 12));
            players.add(new Player("Lemieux", "PIT", 45, 54));
            players.add(new Player("Kurri", "EDM", 37, 53));
            players.add(new Player("Yzerman", "DET", 42, 56));
            players.add(new Player("Gretzky", "EDM", 35, 89));

            return players;
        }
    };

    Statistics stats;

    @Before
    public void setUp() {

        stats = new Statistics(readerStub);
    }

    @Test
    public void retursNullPLayerNotFound() {
        Player player = stats.search("Player");

        assertNull(player);
    }

    @Test
    public void returnNameWhenPlayerFound() {
        Player player = stats.search("Semenko");
        
        assertEquals("Semenko", player.getName());
    }
    
    @Test
    public void PlayersInTheTeam() {
        
        List<Player> pl = stats.team("EDM");
        
        ArrayList<String> p = new ArrayList<String>();
;        
        for(Player po: stats.team("EDM")) {
            p.add(po.getName());
        }
        
        assertEquals("[Semenko, Kurri, Gretzky]", p.toString());
        
    }
    
    @Test
    public void TopScoresCorrect() {
        
        ArrayList<Player> list = new ArrayList<>();
        
        list.addAll(stats.topScorers(1));
        
        assertEquals(124, list.get(0).getPoints());
    }
    
}