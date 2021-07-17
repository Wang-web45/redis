import redis.clients.jedis.Jedis;

import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * @author LX
 * @Time 2021/7/17
 **/
public class Test_hash {
    public static void main(String[] args) {
        Jedis jedis=new Jedis("192.168.187.130", 6379);

//        jedis.hset("home","name1","wtt");
//        jedis.hset("home","name2","wgx");
//        String s = jedis.hget("home","name2");
//        System.out.println(s);
//        List<String> list= jedis.hmget("home","name2","name1");
//        System.out.println(list);
//        Map<String, String> map = jedis.hgetAll("home");
//        System.out.println(map);
//        Long l = jedis.hdel("home","name1");
//        System.out.println(l);
//        Set<String> set = jedis.hkeys("home");
//        System.out.println(set);
//        Boolean b =jedis.hexists("home","name1");
//        System.out.println(b);
//        Set<String> set = jedis.hkeys("home");
//        System.out.println(set);
//        List<String> s = jedis.hvals("home");
//        System.out.println(s);
//        jedis.hset("home","nums","25");
//        Long l= jedis.hincrBy("home","nums",5);
//        System.out.println(l);
//        Double d =jedis.hincrByFloat("home","nums",5.5);
//        System.out.println(d);
//        Long l= jedis.hsetnx("home","name1","wtt");
//        System.out.println(l);


    }



}
