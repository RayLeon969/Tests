import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SuperMarket {


    /**
     * 超市水果商品栏
     */
    private static Map<String, Double> fruits = new HashMap<>();

    static {
        // 初始化加入草莓和苹果的价格
        fruits.put("草莓", 13.0);
        fruits.put("苹果", 8.0);
    }

    /**
     * 增加水果到商品栏
     * @param name 水果名
     * @param price 水果价格：钱/斤
     */
    public void addFruit(String name,Double price){

        if(!fruits.containsKey(name)){

            fruits.put(name,price);

        }

    }

    /**
     * 水果打折
     * @param name 水果名
     * @param discount 几几折
     */
    public void discountFruit(String name,Double discount){

        if(fruits.containsKey(name)){

             Double newPrice = fruits.get(name)*discount/10;
             fruits.put(name, newPrice);

        }

    }

    /**
     * 计算购物车内总价格
     * @param shoppingCart 购物车
     * @return
     * @throws Exception
     */
    public Double computePrice(Map<String,Integer> shoppingCart) throws Exception{
        double res = 0;

        for (String s : shoppingCart.keySet()) {
            if (fruits.containsKey(s)) {

                res += shoppingCart.get(s)*fruits.get(s);

            }else {
                new Exception("部分商品未录入价格,请先录入价格");
            }
        }

        return res;

    }

    /**
     * 计算购物车内总价格(带优惠活动满100减10)
     * @param shoppingCart 购物车
     * @return
     * @throws Exception
     */
    public Double computePriceWithPreferential(Map<String,Integer> shoppingCart) throws Exception{
        double res = 0;

        for (String s : shoppingCart.keySet()) {
            if (fruits.containsKey(s)) {

                res += shoppingCart.get(s)*fruits.get(s);


            }else {
                new Exception("部分商品未录入价格,请先录入价格");
            }
        }

        int num = 0;
        double flag = res;
        while (flag >= 100){
            flag = flag - 100;
            ++num;
        }
        res = res - num*10;
        return res;

    }









}
