import redis.clients.jedis.Jedis;

import java.util.Set;

/**
 * @author LX
 * @Time 2021/7/16
 **/
public class Test_String {
    public static void main(String[] args) {
        Jedis jedis=new Jedis("192.168.187.130", 6379);
        /*String str = jedis.ping();
        System.out.println(str);*/
       /* String str = jedis.info();
        System.out.println(str);*/
        /*String str= jedis.select(0);
        System.out.println(str);*/
        /*Long l =jedis.dbSize();
        System.out.println(l);*/
       /* Set<String>  strings= jedis.keys("*");
        System.out.println(strings);*/
     /*    String s =jedis.flushDB();
        System.out.println(s);*/

        //关于key的操作
     /*   jedis.set("name","wtt");
        jedis.set("age","22");
        jedis.set("six","woman");*/
        /*Boolean b =jedis.exists("name");
        System.out.println(b);*/
       /* Long l= jedis.move("name",1);
        System.out.println(l);*/
    /*    Long l = jedis.ttl("age");
        System.out.println(l);*/
      /*   Long l =jedis.expire("age",60);
        System.out.println(l);*/
     /* String s= jedis.type("name");
        System.out.println(s);
*/
       /* String s = jedis.rename("name","names");
        System.out.println(s);*/
     /*   Long l = jedis.del("name","age","six");
        System.out.println(l);*/
        //2)、redis中有关string类型数据的操作：
       /* Long l= jedis.append("age","2");
        System.out.println(l);*/
//        String s = jedis.get("age");
//        System.out.println(s);
//          Long l =jedis.strlen("name");
//        System.out.println(l);
//        Long l = jedis.incr("age");
//        System.out.println(l);
//
//        Long l = jedis.decr("age");
//        System.out.println(l);
        /*Long l= jedis.incrBy("age",22);
        System.out.println(l);*/
       /* Long l = jedis.decrBy("age",44);
        System.out.println(l);*/
       /* String s= jedis.getrange("name",0,-1);
        System.out.println(s);*/
      /*  Long l = jedis.setrange("name",1,"wg");
        System.out.println(l);*/
   /*   String s =  jedis.setex("k1",30,"v1");
        System.out.println(s);*/
        /*Long l= jedis.ttl("k1");
        System.out.println(l);*/
      /*  Long l = jedis.setnx("name", "wtt");
        System.out.println(l);*/
      /*  String s = jedis.mset("k2","5","k4","v4");
        System.out.println(s);*/
        /*Long l = jedis.msetnx("name","das","k2","5");
        System.out.println(l);*/
        Set<String> strings= jedis.keys("*");
        for (String s:strings){
            System.out.println(s);
        }
         /*jedis.del("name");*/



    }
}
