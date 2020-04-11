package cn.how2j.springcloud;

import redis.clients.jedis.Jedis;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Hello world!
 *
 */
public class RedisTest
{
    public static void main( String[] args )
    {
        Jedis jedis = new Jedis("120.78.134.24",6379);
        Map<String,String> hashMap = new HashMap<>();
        hashMap.put("A1","1");
        hashMap.put("A2","2");
        jedis.hmset("k1",hashMap);
    }
}
