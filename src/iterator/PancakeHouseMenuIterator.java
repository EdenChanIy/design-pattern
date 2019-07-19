package iterator;

import java.util.ArrayList;

/**
 * @Author: EdenChanIy
 * @Date: 2019/7/19 16:05
 */
public class PancakeHouseMenuIterator implements Iterator {
    ArrayList items;
    int position = 0;

    public PancakeHouseMenuIterator(ArrayList items){
        this.items = items;
    }

    public Object next(){
        return items.get(position++);
    }

    public boolean hasNext(){
        if(position>=items.size() || items.get(position)==null){
            return false;
        } else {
            return true;
        }
    }
}
