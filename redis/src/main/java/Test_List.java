import redis.clients.jedis.Jedis;

import java.util.List;
import java.util.Set;

/**
 * @author LX
 * @Time 2021/7/17
 **/
public class Test_List {
    public static void main(String[] args) {
        Jedis jedis=new Jedis("192.168.187.130", 6379);
//        Long l = jedis.lpush("num","1","2","3","4","5");
//        System.out.println(l);

//        List<String> s= jedis.lrange("num",0,-1);
//        System.out.println(s);

//          Long l = jedis.rpush("num","5","6");
//           System.out.println(l);

//         String s = jedis.lpop("num");
//        System.out.println(s);

//        String s = jedis.lindex("num",3);
//        System.out.println(s);

//        Long l = jedis.llen("num");
//        System.out.println(l);

//        String s = jedis.rpop("num");
//        System.out.println(s);

//        Long  l=  jedis.lrem("num",2,"2");
//        System.out.println(l);

//        List<String> list = jedis.lrange("num",0,-1);
//        for (String s:list){
//            System.out.println(s);
//        }

    }
}
