package observer;

import java.util.Observable;
import java.util.Observer;

/**
 * @Author: EdenChanIy
 * @Date: 2019/7/3 15:30
 */
public class CurrentConditionsDisplay implements Observer, DisplayElement {
    Observable observable;
    private float temperature;
    private float humidity;

    public CurrentConditionsDisplay(Observable observable){
        this.observable = observable;
        observable.addObserver(this);
    }

    public void update(Observable obs, Object arg){
        if(obs instanceof WeatherData){ //instanceof是Java的一个二元操作符，作用是判断左边对象是否为右边类的实例
            WeatherData weatherData = (WeatherData)obs;
            this.temperature = weatherData.getTemperature();
            this.humidity = weatherData.getHumidity();
            display();
        }
    }

    public void display(){
        System.out.println("当前温度："+temperature+"\n当前湿度："+humidity);
    }
}
