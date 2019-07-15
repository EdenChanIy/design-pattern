package command;

/**
 * @Author: EdenChanIy
 * @Date: 2019/7/15 15:53
 */
public class SimpleRemoteControl {
    Command slot;

    public SimpleRemoteControl(){}

    public void setCommand(Command command){
        slot = command;
    }

    public void buttonWasPressed(){
        slot.execute();
    }
}
