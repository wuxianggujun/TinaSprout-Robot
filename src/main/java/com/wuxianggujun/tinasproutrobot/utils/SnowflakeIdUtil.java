package com.wuxianggujun.tinasproutrobot.utils;

import cn.hutool.core.lang.Snowflake;
import cn.hutool.core.net.NetUtil;
import cn.hutool.core.util.IdUtil;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

/**
 * @author WuXiangGuJun
 * @create 2022-12-22 11:32
 **/
@Component
public class SnowflakeIdUtil {
    private long workerId = 0;//为终端id
    private long dataCenterId = 1;//数据端中心id

    private Snowflake snowflake = IdUtil.getSnowflake(workerId, dataCenterId);

    @PostConstruct
    public void init() {
        workerId = NetUtil.ipv4ToLong(NetUtil.getLocalhostStr());
    }


    public synchronized String getStringId() {
        return String.valueOf(snowflake.nextId());
    }

    /**
     * 返回long类型的id
     *
     * @return Long id
     */
    public synchronized Long getLongId() {
        return snowflake.nextId();
    }

    public synchronized long snowflakeId(long workerId, long dataCenterId) {
        Snowflake snowflake = IdUtil.getSnowflake(workerId, dataCenterId);
        return snowflake.nextId();
    }

}
