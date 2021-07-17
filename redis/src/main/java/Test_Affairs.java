import redis.clients.jedis.Jedis;
import redis.clients.jedis.Transaction;

import java.util.Set;

/**
 * @author LX
 * @Time 2021/7/17
 **/
public class Test_Affairs {
    public static void main(String[] args) {
        Jedis jedis =new Jedis("192.168.187.130", 6379);
//        Set<String> set= jedis.keys("*");
//        System.out.println(set);
//        jedis.flushAll();

//        jedis.multi();
//        jedis.set("k1","v1");
//        jedis.set("k2","v2");
//        jedis.set("k3","v3");
//        String s = jedis.set("k4","v4");
//        System.out.println(s);

//        Transaction transaction= jedis.multi();
//        transaction.set("k8","v8");
//        transaction.set("k7","v7");
//        transaction.exec();



    }
}
