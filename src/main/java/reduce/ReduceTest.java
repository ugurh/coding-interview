package reduce;

import java.util.Arrays;
import java.util.List;
import java.lang.Math;

public class ReduceTest {

    public static void main(String[] args) {
        List<String> names = Arrays.asList("a1", "a2", "b1", "c2", "c1");

        // java 8 implementation
        Player highestPlayer = names.stream()
                .map(name -> new Player(name, getPoints(name)))
                .reduce(new Player("", 0),(s1, s2) -> (s1.points > s2.points) ? s1 : s2);

        System.out.println(highestPlayer);
    }

    // class for player data
        private record Player(String name, long points) {

        public String toString() {
                return name + ":" + points;
            }
        }

    // generates random points for the players and returns the value
    private static long getPoints(final String name) {
        return (long) (Math.random() * 100);
    }
}