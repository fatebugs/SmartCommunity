package com.sc.ssm.junit;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

/**
 * Date: 2022/4/26
 * Time: 08:39
 *
 * @author genesis
 */
public class Result extends HashMap<String, Object> implements Serializable {
    private static final long serialVersionUID = 64161316464L;

    public Result() {

        this.put("code", 0);
    }

    public static Result ok() {
        Result result = new Result();
        result.put("code", 200);
        return result;
    }
    public static Result ok(Map<String, Object> map) {
        Result result = new Result();
        result.putAll(map);
        return result;
    }

    public static Result error() {
        return error(500, "系统异常");
    }

    public static Result error(String msg) {
        return error(500, msg);
    }

    public static Result error(int code, String msg) {
        Result result = new Result();
        result.put("code", code);
        result.put("msg", msg);
        return result;
    }

    public Result put(Object data) {
        super.put("data", data);
        return this;
    }
    public Result put(String key, Object value) {
        super.put(key, value);
        return this;
    }
}


