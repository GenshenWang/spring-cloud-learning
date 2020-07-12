package com.wgs.spring.cloud.zuul.filter;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;
import com.netflix.zuul.exception.ZuulException;

import javax.servlet.http.HttpServletRequest;
import java.util.logging.Logger;

/**
 * @author: wanggenshen
 * @date: 2020/7/12 23:55.
 * @description: XXX
 */
public class AccessFilter extends ZuulFilter {

    private final Logger logger = Logger.getLogger("EurekaClientHelloController");

    /**
     * 过滤器类型, 代表过滤器在请求的哪个阶段会被执行
     * 有pre/route/post/error 类型, pre代表在请求路由之前会被执行
     * @return
     */
    @Override
    public String filterType() {
        return "pre";
    }

    /**
     * 多个过滤器时可以通过定义order决定过滤器执行顺序
     * @return
     */
    @Override
    public int filterOrder() {
        return 0;
    }

    /**
     * 是否执行过滤器
     * @return
     */
    @Override
    public boolean shouldFilter() {
        return true;
    }

    /**
     * 过滤器具体实现逻辑
     *
     * @return
     * @throws ZuulException
     */
    @Override
    public Object run() throws ZuulException {
        RequestContext context = RequestContext.getCurrentContext();
        HttpServletRequest request = context.getRequest();

        logger.info("Request:" + request.getMethod() + " is send to uri:" + request.getRequestURI().toString());

        Object accessToken = request.getParameter("accessToken");
        if (accessToken == null) {
            logger.warning("access token is null");
            context.setSendZuulResponse(false);
            context.setResponseStatusCode(401);
            return null;
        }
        logger.info("access token is ok");
        return null;
    }
}
