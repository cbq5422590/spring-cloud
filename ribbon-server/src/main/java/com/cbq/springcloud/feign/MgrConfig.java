package com.cbq.springcloud.feign;

import com.cbq.springcloud.util.RibbonHelper;
import com.netflix.loadbalancer.Server;
import com.netflix.loadbalancer.ServerList;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.netflix.ribbon.StaticServerList;
import org.springframework.context.annotation.Bean;

public class MgrConfig {

    @Value("${mgr.ribbon.listOfServers}")
    String listOfServers;

    @Bean
    public ServerList<Server> ribbonServerList() {
        return new StaticServerList<Server>(RibbonHelper.construct(listOfServers).toArray(new Server[]{}));
    }
}
