package com.cbq.springcloud.util;

import com.google.common.base.Strings;
import com.google.common.collect.Lists;
import com.netflix.loadbalancer.Server;

import java.util.List;

public class RibbonHelper {

    public static  List<Server> construct(String ribbonList) {
        List<Server> list = Lists.newArrayList();
        if (!Strings.isNullOrEmpty(ribbonList)) {
            for (String s: ribbonList.split(",")) {
                list.add(new Server(s.trim()));
            }
        }
        return list;
    }
}
