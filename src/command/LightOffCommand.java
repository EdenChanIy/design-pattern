package command;

/**
 * @Author: EdenChanIy
 * @Date: 2019/7/15 16:16
 */
public class LightOffCommand implements Command {
    Light light;

    public LightOffCommand(Light light){
        this.light = light;
    }

    public void execute(){
        light.off();
    }

    public void undo(){
        light.on();
    }
}
