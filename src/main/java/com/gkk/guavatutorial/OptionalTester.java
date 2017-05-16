package com.gkk.guavatutorial;


import com.google.common.base.Optional;

/**
 * Created by za-gongkuaikuai on 2017/4/25.
 */
public class OptionalTester {
    public static void main(String[] args) {
        OptionalTester optionalTester = new OptionalTester();

        Integer invalidInput = null;

//        Optional<Integer> a = Optional.of(invalidInput);
        Optional<Integer> b = Optional.of(new Integer(10));
        Optional<Integer> c = Optional.fromNullable(invalidInput);

//        System.out.println(optionalTester.sum(a,b));
        System.out.println(optionalTester.sum(b,c));
    }

    public Integer sum(Optional<Integer> a, Optional<Integer> b){
        System.out.println("First parameter is present: "+ a.isPresent());
        System.out.println("Second parameter is present: " + b.isPresent());
        Integer value1 = a.or(new Integer(0));
        Integer value2 = b.or(new Integer(0));
        return value1 + value2;
    }

}
