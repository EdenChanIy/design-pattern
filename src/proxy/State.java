package proxy;

/**
 * @Author: EdenChanIy
 * @Date: 2019/7/23 10:33
 */
public interface State {
    void insertQuarter();
    void ejectQuarter();
    void turnCrank();
    void dispense();
}
