package com.jky.design.patterns.builder;

import com.jky.design.patterns.factorymethod.MailSender;
import com.jky.design.patterns.factorymethod.Sender;
import com.jky.design.patterns.factorymethod.SmsSender;

import java.util.ArrayList;
import java.util.List;

/**
 * 建造者模式
 * @author jky
 * @date 2018/01/18
 */
public class Builder {

    private List<Sender> list = new ArrayList<Sender>();

    /**
     * 建造MailSender对象
     * @param count
     */
    public void produceMailSnder(int count){
        for (int i = 0; i < count; i++) {
            list.add(new MailSender());
        }
        for(Sender sender : list){
            sender.send();
        }
    }

    /**
     * 建造SmsSender对象
     * @param count
     */
    public void produceSmsSnder(int count){
        for (int i = 0; i < count; i++) {
            list.add(new SmsSender());
        }
        for(Sender sender : list){
            sender.send();
        }
    }

    public List<Sender> getList() {
        return list;
    }

    public void setList(List<Sender> list) {
        this.list = list;
    }
}
