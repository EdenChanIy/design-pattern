package iterator;

/**
 * @Author: EdenChanIy
 * @Date: 2019/7/19 16:01
 */
public class DinerMenuIterator implements Iterator {
    MenuItem[] items;
    int position = 0;

    public DinerMenuIterator(MenuItem[] items){
        this.items = items;
    }

    public Object next(){
        MenuItem menuItem = items[position++];
        return menuItem;
    }

    public boolean hasNext(){
        if(position>=items.length || items[position]==null){
            return false;
        } else {
            return true;
        }
    }
}
