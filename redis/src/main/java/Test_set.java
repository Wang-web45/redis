import redis.clients.jedis.Jedis;

import java.util.Set;

/**
 * @author LX
 * @Time 2021/7/17
 **/
public class Test_set {
    public static void main(String[] args) {
        Jedis jedis =new Jedis("192.168.187.130", 6379);

//        Long l =jedis.sadd("nums","1","2","3","4","5");
//        System.out.println(l);

//        Set<String> s = jedis.smembers("nums");
//        System.out.println(s);

//        Boolean b = jedis.sismember("nums","6");
//        System.out.println(b);

//        Long l = jedis.scard("nums");
//        System.out.println(l);

//        Long l= jedis.srem("nums","4","5");
//        System.out.println(l);

//        String s =jedis.srandmember("nums");
//        System.out.println(s);

//        String s= jedis.spop("nums");
//        System.out.println(s);

//        jedis.sadd("studnet","wtt","22");
//        Set<String> s= jedis.sdiff("nums","student");
//        System.out.println(s);

//        Set<String> strings = jedis.sinter("nums","student");
//        System.out.println(strings);

//        Set<String> strings = jedis.sunion("nums","studnet");
//        System.out.println(strings);

//        Long l = jedis.srem("nums","2","student");
//        System.out.println(l);

    }
}
