package com.jky.generics;

/**
 * @author jky
 * @date 2018/4/2 15:07
 */
public class ObjectTool<T> {
    private T object;

    public T getObject() {
        return object;
    }

    public void setObject(T object) {
        this.object = object;
    }

    @Override
    public String toString() {
        return "ObjectTool{" +
                "object=" + object +
                '}';
    }

    public static void main(String[] args) {
        ObjectTool<String > objectTool = new ObjectTool<>();
        objectTool.setObject("每日优鲜");
        String str = objectTool.getObject();
        System.out.println(str);


    }
}
