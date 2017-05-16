package com.gkk.guavatutorial.string;

import com.google.common.base.Joiner;

import java.util.Arrays;

/**
 * Created by za-gongkuaikuai on 2017/4/25.
 */
public class JoinerTester {
    public static void main(String args[]){
        JoinerTester tester = new JoinerTester();
        tester.testJoiner();
    }

    private void testJoiner(){
        System.out.println(Joiner.on(",")
                .skipNulls()
                .join(Arrays.asList(1,2,3,4,5,null,6)));
    }
}
