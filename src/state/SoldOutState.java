package state;

/**
 * @Author: EdenChanIy
 * @Date: 2019/7/23 10:45
 */
public class SoldOutState implements State {
    GumballMachine gumballMachine;

    public SoldOutState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }

    public void insertQuarter(){
        System.out.println("You can't insert a quarter, the machine is sold out");
    }

    public void ejectQuarter(){
        System.out.println("You can't eject, you haven't insert a quarter yet");
    }

    public void turnCrank(){
        System.out.println("You turned, but there are no gumballs");
    }

    public void dispense(){
        System.out.println("No gumball dispensed");
    }
}
