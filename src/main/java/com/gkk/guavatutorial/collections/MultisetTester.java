package com.gkk.guavatutorial.collections;

import com.google.common.collect.HashMultiset;
import com.google.common.collect.Multiset;

import java.util.Iterator;
import java.util.Set;

/**
 * Created by za-gongkuaikuai on 2017/4/25.
 */
public class MultisetTester {
    public static void main(String args[]) {

        //create a multiset collection
        Multiset<String> multiset = HashMultiset.create();//用hashMultiset来创建

        multiset.add("a");
        multiset.add("b");
        multiset.add("c");
        multiset.add("d");
        multiset.add("a");
        multiset.add("b");
        multiset.add("c");
        multiset.add("b");
        multiset.add("b");
        multiset.add("b");

        //print the occurrence of an element
        System.out.println("Occurrence of 'b' : "+multiset.count("b"));//输出某个元素的输出次数

        //print the total size of the multiset
        System.out.println("Total Size : "+multiset.size());//输出set的大小

        //get the distinct elements of the multiset as set
        Set<String> set = multiset.elementSet();//获得不重复元素的set结合

        //display the elements of the set        //输出不重复元素
        System.out.println("Set [");
        for (String s : set) {
            System.out.println(s);
        }
        System.out.println("]");

        //display all the elements of the multiset using iterator   //输出重复元素
        Iterator<String> iterator  = multiset.iterator();
        System.out.println("MultiSet [");
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
        System.out.println("]");

        //display the distinct elements of the multiset with their occurrence count
        System.out.println("MultiSet [");
        for (Multiset.Entry<String> entry : multiset.entrySet())
        {
            System.out.println("Element: " + entry.getElement() + ", Occurrence(s): " + entry.getCount());
        }
        System.out.println("]");

        //remove extra occurrences
        multiset.remove("b",2);

        //print the occurrence of an element
        System.out.println("Occurence of 'b' : " + multiset.count("b"));
    }
}
