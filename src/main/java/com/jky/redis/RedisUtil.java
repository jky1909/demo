package com.jky.redis;

import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisPool;
import redis.clients.jedis.JedisPoolConfig;

public class RedisUtil {

    /**
     * redis 服务器ip
     */
    private static String ADDR = "192.168.80.128";

    /* 端口 */
    private static int PORT = 6379;

    //访问密码
    private static String AUTH = "123456";

    private static int MAX_ACTIVE = 1024;

    private static int MAX_IDLE = 200;

    private static int MAX_WAIT = 100000;

    private static int TIMEOUT = 100000;

    private static boolean TEST_ON_BORROW = true;

    private static JedisPool jedisPool = null;

    //初始化jedis连接池
    static {
        try {
            JedisPoolConfig config = new JedisPoolConfig();
            config.setMaxActive(MAX_ACTIVE);
            config.setMaxIdle(MAX_IDLE);
            config.setMaxWait(MAX_WAIT);

            config.setTestOnBorrow(TEST_ON_BORROW);
            jedisPool = new JedisPool(config, ADDR, PORT, TIMEOUT, AUTH);
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    //获取jedis实例
    public synchronized static Jedis getJedis(){
        try {
            if(jedisPool != null){
                Jedis jedis = jedisPool.getResource();
                return jedis;
            }
        }catch (Exception e){
            e.printStackTrace();
        }
        return null;
    }

    //释放jedis资源
    public static void returnResource(Jedis jedis){
        if(jedis != null){
            jedisPool.returnResource(jedis);
        }
    }
}
