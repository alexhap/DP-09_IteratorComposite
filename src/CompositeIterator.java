/**
 * Created by alex on 26.06.2015.
 *
 */

import java.util.*;

public class CompositeIterator implements Iterator {

    private Stack<Iterator> stack = new Stack<>();

    public CompositeIterator(Iterator<MenuComponent> iterator) {
        stack.push(iterator);
    }

    public boolean hasNext() {
        if (stack.isEmpty()) return false;
        Iterator iterator = stack.peek();
        if (iterator.hasNext())
            return true;
        else {
            stack.pop();
            return hasNext();
        }
    }

    public Object next() {
        if (hasNext()) {
            Iterator iterator = stack.peek();
            MenuComponent component = (MenuComponent) iterator.next();
            if (component instanceof Menu)
                stack.push(component.createIterator());
            return component;
        } else
            return null;
    }

    public void remove() {
        throw new UnsupportedOperationException();
    }
}
