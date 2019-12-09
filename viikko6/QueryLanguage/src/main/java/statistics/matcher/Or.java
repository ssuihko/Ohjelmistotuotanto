package statistics.matcher;

import statistics.Player;

public class Or implements Matcher {

    private Matcher[] matchers;

    public Or(Matcher... matchers) {
        this.matchers = matchers;

    }

    @Override
    public boolean matches(Player p) {
            if (matchers[0].matches(p) || matchers[1].matches(p)) {
                return true;
            }
        return false;
    }
}
