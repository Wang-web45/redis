import redis.clients.jedis.Jedis;

import java.util.Set;

/**
 * @author LX
 * @Time 2021/7/17
 **/
public class Test_zset {
    public static void main(String[] args) {
        Jedis jedis=new Jedis("192.168.187.130", 6379);
//        jedis.zadd("demo",50,"name");
//        jedis.zadd("demo",5,"age");
//        jedis.zadd("demo",10,"addtress");

//        Set<String> set = jedis.zrange("demo",0,-1);
//        System.out.println(set);

//        Set<String> set= jedis.zrangeByScore("demo",10,100);
//        System.out.println(set);

//        Long b = jedis.zrem("demo","addtress");
//        System.out.println(b);

//        Long l = jedis.zcard("demo");
//        System.out.println(l);

//        Long l = jedis.zrank("demo","name");
//        System.out.println(l);

//        Long l =jedis.zcount("demo","0","100");
//        System.out.println(l);

//        Double aDouble =jedis.zscore("demo","name");
//        System.out.println(aDouble);
        Long l = jedis.zrevrank("demo","age");
        System.out.println(l);
    }
}
