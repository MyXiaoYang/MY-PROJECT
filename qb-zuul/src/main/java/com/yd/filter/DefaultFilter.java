package com.yd.filter;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;
import com.netflix.zuul.exception.ZuulException;
import org.apache.commons.lang.StringUtils;
import org.springframework.stereotype.Component;

import javax.servlet.http.HttpServletRequest;

/**
 * 默认拦截器
 *
 * @data: 2018/8/2
 * @author: YD
 */
@Component
public class DefaultFilter extends ZuulFilter {


    /**
     * 可以在请求被路由之前调用
     * 在zuul中定义了四种不同生命周期的过滤器类型，具体如下：
     *      pre：可以在请求被路由之前调用
     *      routing：在路由请求时候被调用
     *      post：在routing和error过滤器之后被调用
     *      error：处理请求时发生错误时被调用
     */
    @Override
    public String filterType() {
        //定义filter的类型，有pre、route、post、error四种
        return "pre";
    }

    /**
     * filter执行顺序，通过数字指定 ,优先级为0，数字越大，优先级越低
     */
    @Override
    public int filterOrder() {
        return 0;
    }

    /**
     * 是否执行该过滤器，此处为true，说明需要过滤, false表示不执行
     */
    @Override
    public boolean shouldFilter() {
        return false;
    }

    /**
     *  filter需要执行的具体操作
     */
    @Override
    public Object run() throws ZuulException {
        RequestContext ctx = RequestContext.getCurrentContext();
        HttpServletRequest request = ctx.getRequest();

        // 获取请求的参数
        String token = request.getParameter("token");

        if (StringUtils.isNotBlank(token)) {
            //对请求进行路由
            ctx.setSendZuulResponse(true);
            ctx.setResponseStatusCode(200);
            ctx.set("isSuccess", true);
            return null;
        } else {
            //不对其进行路由
            ctx.setSendZuulResponse(false);
            ctx.setResponseStatusCode(400);
            ctx.setResponseBody("token is empty");
            ctx.set("isSuccess", false);
            return null;
        }
    }


}
