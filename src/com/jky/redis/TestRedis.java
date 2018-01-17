package com.jky.redis;

import org.junit.Test;
import redis.clients.jedis.Jedis;

import java.util.HashMap;
import java.util.Map;

public class TestRedis {

    @Test
    public void testString(){
        Jedis jedis = RedisUtil.getJedis();
        try {
            jedis.select(1);
            jedis.set("name", "candy is my love");
            System.out.println(jedis.get("name"));
        }catch(Exception e){
            e.printStackTrace();
        }finally {
            RedisUtil.returnResource(jedis);
        }
    }


    @Test
    public void testHash(){
        Jedis jedis = RedisUtil.getJedis();
        try {
            Map map = new HashMap();
            map.put("LOL","德玛西亚");
            jedis.select(1);
            jedis.hmset("map",map);
            System.out.println(jedis.hgetAll("map"));

        }catch (Exception e){
            e.printStackTrace();
        }finally {
            RedisUtil.returnResource(jedis);
        }
    }

}
