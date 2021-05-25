package com.amberlion.otherStuff.annotations;

public @interface Author {
    String first() default "unknown";
    String last() default "unknown";
}
