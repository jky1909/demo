package com.jky.effective.demo2;

/**
 * @author jky
 * @date 2018/3/6 9:28
 */
public class TestNutritionFacts {
    public static void main(String[] args) {
        NutritionFacts nutritionFacts = new NutritionFacts.Builder(240,8).calories(5).fat(2).sodium(10).build();
        System.out.println(nutritionFacts);
    }
}
