package com.example.tools;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/**
 * Created by Administrator on 2017/3/8.
 */
@Retention(RetentionPolicy.RUNTIME)
public @interface ExcelResources {
    /**
     * 属性的标题名称
     *
     * @return
     */
    String title();

    /**
     * 在excel的顺序
     *
     * @return
     */
    int order() default 9999;
}
