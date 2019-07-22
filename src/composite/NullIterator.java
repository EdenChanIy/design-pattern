package composite;

import java.util.Iterator;

/**
 * @Author: EdenChanIy
 * @Date: 2019/7/22 11:25
 */
public class NullIterator implements Iterator {
    public Object next(){
        return null;
    }

    public boolean hasNext(){
        return false;
    }

    public void remove(){
        throw new UnsupportedOperationException();
    }
}
