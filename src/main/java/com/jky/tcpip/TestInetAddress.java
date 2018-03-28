package com.jky.tcpip;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.Arrays;

/**
 * @author jky
 * @date 2018/3/28 22:28
 */
public class TestInetAddress {
    public static void main(String[] args) throws UnknownHostException {
        InetAddress address = InetAddress.getLocalHost();
        System.out.println("计算机名：" + address.getHostName());
        System.out.println("IP地址：" + address.getHostAddress());
        byte[] bytes = address.getAddress();
        System.out.println("字节数组形式的IP:" + Arrays.toString(bytes));

        InetAddress address1 = InetAddress.getByName("192.168.125.1");
        System.out.println("计算机名：" + address1.getHostName());
        System.out.println("IP地址：" + address1.getHostAddress());

        InetAddress address2 = InetAddress.getByName("USER-20171230SH");
        System.out.println("计算机名：" + address2.getHostName());
        System.out.println("IP地址：" + address2.getHostAddress());

    }
}
