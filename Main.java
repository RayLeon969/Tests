import java.util.HashMap;
import java.util.Map;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    public static void main(String[] args) {

        SuperMarket superMarket = new SuperMarket();

        /*
        * 有一家超市，出售苹果和草莓。其中苹果 8 元/斤，草莓 13 元/斤。
        * 现在顾客 A 在超市购买了若干斤苹果和草莓，需要计算一共多少钱？
        * 请编写函数，对于 A 购买的水果斤数 (水果斤数为大于等于 0 的整数)，计算并返回所购买商品的总价。
        * */
        // 首先生成A的购物车
        Map<String,Integer> shoppingCartOfA = new HashMap<String,Integer>();
        // 模拟A把对应重量的草莓和苹果加入购物车
        shoppingCartOfA.put("草莓", 2);
        shoppingCartOfA.put("苹果", 2);
        // 计算并返回价格
        try {

            Double priceOfA = superMarket.computePrice(shoppingCartOfA);
            System.out.println(priceOfA);

        }catch (Exception e){
            System.out.println(e);
        }


        /*
        * 超市增加了一种水果芒果，其定价为 20 元/斤。
        * 现在顾客 B 在超市购买了若干斤苹果、 草莓和芒果，需计算一共需要多少钱？
        * 请编写函数，对于 B 购买的水果斤数 (水果斤数为大于等于 0 的整数)，计算并返回所购买商品的总价。
        * */

        // 首先生成B的购物车
        Map<String,Integer> shoppingCartOfB = new HashMap<String,Integer>();
        // 模拟增加水果
        superMarket.addFruit("芒果", 20.0);
        // 模拟B购买了若干斤的三种水果到购物车
        shoppingCartOfB.put("草莓", 2);
        shoppingCartOfB.put("苹果", 2);
        shoppingCartOfB.put("芒果", 2);
        // 计算并返回价格
        try {

            Double priceOfB = superMarket.computePrice(shoppingCartOfB);
            System.out.println(priceOfB);

        }catch (Exception e){
            System.out.println(e);
        }


        /*
        * 超市做促销活动，草莓限时打 8 折。
        * 现在顾客 C 在超市购买了若干斤苹果、 草莓和芒果，需计算一共需要多少钱？
        * 请编写函数，对于 C 购买的水果斤数 (水果斤数为大于等于 0 的整数)，计算并返回所购买商品的总价。
        * */

        // 草莓打八折
        superMarket.discountFruit("草莓",8.0);
        // 生成C的购物车并模拟顾客C购买了若干斤水果到购物车
        Map<String,Integer> shoppingCartOfC = new HashMap<String,Integer>();
        shoppingCartOfC.put("草莓", 2);
        shoppingCartOfC.put("苹果", 2);
        shoppingCartOfC.put("芒果", 2);
        // 计算并返回价格为
        try {

            Double priceOfC = superMarket.computePrice(shoppingCartOfC);
            System.out.println(priceOfC);

        }catch (Exception e){
            System.out.println(e);
        }


        /*
        * 促销活动效果明显，超市继续加大促销力度，购物满 100 减 10 块。
        * 现在顾客 D 在超市购买了若干斤苹果、 草莓和芒果，需计算一共需要多少钱？
        * 请编写函数，对于 D 购买的水果斤数 (水果斤数为大于等于 0 的整数)，计算并返回所购买商品的总价。
        * */

        // 生成D的购物车并模拟顾客D购买了若干斤水果到购物车内
        Map<String,Integer> shoppingCartOfD = new HashMap<String,Integer>();
        shoppingCartOfD.put("草莓", 5);
        shoppingCartOfD.put("苹果", 5);
        shoppingCartOfD.put("芒果", 5);
        // 采用优惠购物的结算方式获得结果
        try {

            Double priceOfD = superMarket.computePriceWithPreferential(shoppingCartOfD);
            System.out.println(priceOfD);

        }catch (Exception e){
            System.out.println(e);
        }









    }
}