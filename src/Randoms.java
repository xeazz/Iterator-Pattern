import java.util.Iterator;
import java.util.Random;

public class Randoms implements Iterable<Integer> {
    protected final Random random;
    protected final int min;
    protected final int max;

    protected Randoms(int min, int max) {
        this.random = new Random();
        this.min = min;
        this.max = max;
    }

    public int generationInt() {
        return (int) (Math.random() * ((max - min) + 1)) + min;
    }

    @Override
    public Iterator<Integer> iterator() {
        return new CustomIterator();
    }

    public class CustomIterator implements java.util.Iterator<Integer> {

        @Override
        public boolean hasNext() {
            return true;
        }

        @Override
        public Integer next() {
            return Randoms.this.generationInt();
        }
    }
}

