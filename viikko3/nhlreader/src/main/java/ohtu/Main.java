
package ohtu;

import com.google.gson.Gson;
import java.io.IOException;
import org.apache.http.client.fluent.Request;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Main {
        public static void main(String[] args) throws IOException {
        String url = "https://nhlstatisticsforohtu.herokuapp.com/players";
        
        String bodyText = Request.Get(url).execute().returnContent().asString();

        Gson mapper = new Gson();
        Player[] players = mapper.fromJson(bodyText, Player[].class);



        String format = "%-20s%3d%3d%4d%n";

        System.out.println("Suomalaiset pelaajat pistejärjestyksessä:");
    
          Arrays.asList(players).stream().filter(p -> p.getNationality().equals("FIN")).sorted(Comparator.comparing(Player::total).reversed()).forEach(e -> System.out.printf(
                        format,
                        e.getName(),
                        e.getGoals(),
                        e.getAssists(),
                        e.total())
                );
            
}
}