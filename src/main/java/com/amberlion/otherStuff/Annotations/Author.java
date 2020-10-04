package com.amberlion.otherStuff.Annotations;

public @interface Author {
    String first() default "unknown";
    String last() default "unknown";
}
