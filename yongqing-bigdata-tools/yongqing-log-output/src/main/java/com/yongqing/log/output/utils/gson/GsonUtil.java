package com.yongqing.log.output.utils.gson;


import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.LongSerializationPolicy;
import com.yongqing.log.output.factory.adapter.NullStringToEmptyAdapterFactory;

/**
 * json相关处理的工具类
 */

public class GsonUtil {

    //定义gson对像，对象的String属性为null时也支持序列化
    public static final Gson gson = new GsonBuilder().setLongSerializationPolicy(LongSerializationPolicy.STRING).disableHtmlEscaping().registerTypeAdapterFactory(new NullStringToEmptyAdapterFactory()).setDateFormat("yyyy-MM-dd HH:mm:ss.SSS").create();
}

