package io.github.carlanton.demo;

import lombok.Value;
import lombok.val;

import java.util.ArrayList;

@Value
public class Thing {
    private String a;
    private String b;
    private String c;

    public void wow() {
        val t = new ArrayList<String>();
        System.err.println(t);
    }
}
