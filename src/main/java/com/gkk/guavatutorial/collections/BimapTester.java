package com.gkk.guavatutorial.collections;

import com.google.common.collect.BiMap;
import com.google.common.collect.HashBiMap;

/**
 * Created by za-gongkuaikuai on 2017/4/25.
 * Bimap的key可以重复，value不能重复。但是最好的usecase，想必还是都别重复。
 */
public class BimapTester {
    public static void main(String args[]) {
        BiMap<Integer, String> empIDNameMap = HashBiMap.create();

        empIDNameMap.put(new Integer(101), "Mahesh");
        empIDNameMap.put(new Integer(102), "Sohan");
        empIDNameMap.put(new Integer(103), "Ramesh");
        empIDNameMap.put(new Integer(103), "Sohans");

        //Emp Id of Employee "Mahesh"
        System.out.println(empIDNameMap.inverse().get("Mahesh"));
    }
}
