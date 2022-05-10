package com.sc.ssm.junit;

/**
 * Date: 2022/5/10
 * Time: 15:07
 *
 * @author genesis
 */
public class Convention {
    //蛇形转驼峰
    public String snake_case2camalCase(String selected){
        selected = selected.replaceAll("_([A-Z])", "$1");
        int i = -32;

        for(char c = 'a'; c <= 'z'; ++c) {
            selected = selected.replaceAll("_" + c, String.valueOf((char)(c + i)));
        }
        return selected;

    }

    //驼峰转蛇形
    public String camalCase2snake_case(String selected){
        selected = selected.replaceAll("[A-Z]", "_$0");
        selected = selected.toLowerCase();
        if (selected.charAt(0) == '_') {
            selected = selected.substring(1);
        }
        return selected;
    }

}
