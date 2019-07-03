package observer;

/**
 * @Author: EdenChanIy
 * @Date: 2019/7/3 15:30
 */
public class CurrentConditionsDisplay implements Observer, DisplayElement {
    private float temperature;
    private float humidity;
    private Subject weatherData;

    public CurrentConditionsDisplay(Subject weatherData){
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    public void update(float temperature, float humidity, float pressure){
        this.temperature = temperature;
        this.humidity = humidity;
        display();
    }

    public void display(){
        System.out.println("当前温度："+temperature+"\n当前湿度："+humidity);
    }
}
