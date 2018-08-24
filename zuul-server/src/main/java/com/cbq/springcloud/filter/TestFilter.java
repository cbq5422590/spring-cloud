package com.cbq.springcloud.filter;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;
import com.netflix.zuul.exception.ZuulException;
import org.springframework.stereotype.Component;

@Component
public class TestFilter extends ZuulFilter {

    @Override
    public String filterType() {
        return "pre";
    }

    @Override
    public int filterOrder() {
        return 99;
    }

    @Override
    public boolean shouldFilter() {
        final String serviceId = (String) RequestContext.getCurrentContext().get("proxy");;
        return true;
    }

    @Override
    public Object run() throws ZuulException {
        return null;
    }
}
