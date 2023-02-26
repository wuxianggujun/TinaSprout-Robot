package com.wuxianggujun.tinasproutrobot.command;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Stream;

/**
 * @author WuXiangGuJun
 * @create 2023-02-26 11:03
 **/
public class CommandArgs {
    private final Map<String, String> args;

    public CommandArgs(Map<String, String> args) {
        this.args = args;
    }

    public String getValue(String key, String defaultValue) {
        String value = args.get(key);
        return value != null ? value : defaultValue;
    }

    public String getValue(String key) {
        return args.get(key);
    }

    public boolean containsKey(String key) {
        return args.containsKey(key);
    }

    public boolean equalsKey(String key) {
        if (!containsKey(key)) {
            return false;
        }
        Stream<Map.Entry<String, String>> stream = args.entrySet().stream();
        //满足条件时终止整个stream的处理过程
        boolean found = stream.anyMatch(entry -> {
            String entryKey = entry.getKey();
            if (entryKey.equals(key)) {
                System.out.println("key = " + key);
                return true;
            }
            return false;
        });
        return found;
    }

    public void setValue(String key, String value) {
        if (key == null || key.isEmpty() || value == null) {
            throw new IllegalArgumentException("Invalid key of value");
        }
        args.put(key, value);
    }


}
