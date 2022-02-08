package generics;

public class Score<T> {

    T value;
    private int counter = 0;

    public Score() {
        counter++;
    }

    public Score(T t) {
        this();
        this.value = t;
    }

    public T getValue() {
        return value;
    }

    public int getCounter() {
        return counter;
    }

}

class ScoreTest {

    public static void main(String args[]) {

        Score<Integer> x = new Score<>();
        Score<Integer> y = new Score<>();
        Score<Double> z = new Score<>();

        System.out.println(x.getCounter());
        System.out.println(y.getCounter());
        System.out.println(z.getCounter());
    }
}