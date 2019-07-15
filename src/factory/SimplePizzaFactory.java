//package factory;
//
///**
// * @Author: EdenChanIy
// * @Date: 2019/7/5 15:29
// * 简单工厂
// */
//public class SimplePizzaFactory {
//    public static Pizza createPizza(String type){ //简单工厂的创建方法通常声明为静态
//        Pizza pizza = null;
//
//        if(type.equals("cheese")){
//            pizza = new CheesePizza();
//        }else if(type.equals("pepperoni")){
//            pizza = new PepperoniPizza();
//        }else if(type.equals("clam")){
//            pizza = new ClamPizza();
//        }else if(type.equals("veggie")){
//            pizza = new VeggiePizza();
//        }
//        return pizza;
//    }
//}
