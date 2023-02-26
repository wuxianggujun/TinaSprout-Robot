package com.wuxianggujun.tinasproutrobot.command;

import java.util.Iterator;
import java.util.Map;
import java.util.stream.Stream;

/**
 * @author WuXiangGuJun
 * @create 2023-02-26 11:03
 **/
public class CommandArgs {

    private final Map<String, Object> args;

    public CommandArgs(Map<String, Object> args) {
        this.args = args;
    }

    public String getValue(String key, String defaultValue) {
        String value = (String) args.get(key);
        return value != null ? value : defaultValue;
    }

    public Object getValue(String key) {
        return args.get(key);
    }

    public boolean containsKey(String key) {
        return args.containsKey(key);
    }

    public boolean equalsKey(String key) {
        if (!containsKey(key)) {
            return false;
        }
        Stream<Map.Entry<String, Object>> stream = args.entrySet().stream();
        //满足条件时终止整个stream的处理过程
        boolean found = stream.anyMatch(entry -> {
            String entryKey = entry.getKey();
            if (entryKey.equals(key)) {
                return true;
            }
            return false;
        });
        return found;
    }

    public void setValue(String key, Object value) {
        if (containsKey(key) || key == null || key.isEmpty() || value == null) {
            throw new IllegalArgumentException("Key or Value exists or is empty！");
        }
        args.put(key, value);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        Iterator<Map.Entry<String, Object>> iterator = args.entrySet().iterator();
        while (iterator.hasNext()) {
            sb.append("\n");
            Map.Entry<String, Object> entry = iterator.next();
            sb.append(String.format("%s=%s", entry.getKey(), entry.getValue().toString()));
        }
        return sb.toString();
    }

}
