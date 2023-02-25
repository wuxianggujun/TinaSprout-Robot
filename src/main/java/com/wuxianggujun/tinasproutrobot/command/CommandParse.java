package com.wuxianggujun.tinasproutrobot.command;

import java.util.HashMap;
import java.util.Map;

/**
 * @author WuXiangGuJun
 * @create 2023-02-25 17:48
 **/
public class CommandParse {
    //要解析的命令
    private final String command;
    //存放数组
    private String[] parts;
    private final Map<String, String> params;

    //默认操作符,好像用不到
    private String operator = "/";
    //解析的命令操作
    private String action;

    public CommandParse(String command) {
        this.command = command;
        params = new HashMap<>();
        this.parse();
    }

    public void parse() {
        parts = command.split(" ");
        String temp = parts[0].trim();
        String parse_operator = temp.substring(0, temp.indexOf(operator) + 1);
        //判断解析出来的操作符与定义的是不是一样的，不一样直接结束
        if (!parse_operator.equals(operator)) {
            return;
        }
        //解析行为是什么
        action = temp.substring(temp.indexOf(operator) + 1);
        for (int i = 1; i < parts.length; i++) {//从第二个单词开始遍历
            if (parts[i].startsWith("-")) {//如果是参数标志，则解析参数
                String key = parts[i].substring(1);//获取参数名
                String value = parts[i + 1];//获取参数值
                params.put(key, value);//加入到map中
                i++;
            }
        }
        System.out.println("Action: " + action);
        System.out.println("Params: " + params);
    }


    public String getOperator() {
        return operator;
    }

    public String getAction() {
        if (action != null && action.length() > 0) {
            return action;
        }
        return null;
    }

    public Map<String, String> getParams() {
        return params;
    }

    //获取正文内容
    public String getContent() {
        return "";
    }


}
