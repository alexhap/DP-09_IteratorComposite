/**
 * Created by alex on 26.06.2015.
 *
 */

import java.util.Iterator;

public class DinnerMenuIterator implements Iterator {

    MenuItem[] items;
    int pos = 0;

    public DinnerMenuIterator(MenuItem[] items) {
        this.items = items;
    }

    public boolean hasNext() {
        return pos < items.length && items[pos] != null;
    }

    public Object next() {
        return items[pos++];
    }

    public void remove() {
        if (pos <= 0)
            throw new IllegalStateException("You can't remove before at least one call of next()");
        else if (items[pos - 1] != null) {
            for (int i = pos - 1; i < items.length - 1; i++)
                items[i] = items[i + 1];
            items[items.length - 1] = null;
        }
    }
}
