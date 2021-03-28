package org.example;

import com.google.common.collect.ImmutableList;

public class App
{
    public static void main( String[] args )
    {
        ImmutableList<String> list = ImmutableList.of("hello", "world");
        for (String item : list) {
            System.out.println(item);
        }
    }
}
