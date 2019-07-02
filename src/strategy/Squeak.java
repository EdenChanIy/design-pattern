package strategy;

/**
 * @Author: EdenChanIy
 * @Date: 2019/7/2 11:20
 * 针对吱吱叫
 */
public class Squeak implements QuackBehavior{
    public void quack(){
        //实现吱吱叫逻辑
        System.out.println("吱吱吱");
    }
}
