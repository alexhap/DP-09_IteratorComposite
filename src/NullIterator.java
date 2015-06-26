/**
 * Created by alex on 26.06.2015.
 *
 */

import java.util.Iterator;

public class NullIterator implements Iterator {

    public boolean hasNext() {
        return false;
    }

    public Object next() {
        return null;
    }

    public void remove() {
        throw new UnsupportedOperationException();
    }
}
