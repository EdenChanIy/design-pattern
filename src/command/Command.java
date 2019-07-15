package command;

/**
 * @Author: EdenChanIy
 * @Date: 2019/7/15 15:50
 */
public interface Command {
    public void execute();
    public void undo();
}
