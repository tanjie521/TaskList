package com.tanj.untils;

import java.util.HashMap;

/**
 * 封装返回结果
 */
public class R extends HashMap {
    public R(int code, String msg, Object data) {
        this.put("code", code);
        this.put("msg", msg);
        this.put("data", data);
    }

    public String Json() {
        return JsonUtils.toJson(this);
    }

    public R put(Object key, Object value) {
        super.put(key, value);
        return this;
    }

    public static R ok(String msg, Object data) {
        return new R(1, msg, data);
    }

    public static R ok(Object data) {
        return new R(1, "操作成功！", data);
    }

    public static R ok() {
        return new R(1, "操作成功！", null);
    }

    public static R error(String msg, Object data) {
        return new R(0, msg, data);
    }

    public static R error(String msg) {
        return new R(0, msg, null);
    }

    public static R error() {
        return new R(0, "操作失败！", null);
    }

}