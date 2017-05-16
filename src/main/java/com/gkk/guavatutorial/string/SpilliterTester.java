package com.gkk.guavatutorial.string;

import com.google.common.base.Splitter;

/**
 * Created by za-gongkuaikuai on 2017/4/25.
 */
public class SpilliterTester {
    public static void main(String args[]) {
        SpilliterTester tester = new SpilliterTester();
        tester.testSplitter();
    }

    private void testSplitter() {
        System.out.println(Splitter.on(',')
                .trimResults()
                .omitEmptyStrings()
                .split("the ,quick, ,brown,fox,    jumps, over, the, lazy, little dog."));
    }
}
