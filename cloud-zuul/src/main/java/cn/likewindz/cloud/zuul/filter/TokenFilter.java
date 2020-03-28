package cn.likewindz.cloud.zuul.filter;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;
import org.springframework.stereotype.Component;

import javax.servlet.http.HttpServletRequest;

/**
 * @author likeWind
 * @date created in 14:25 2020/3/28
 * @description
 */

public class TokenFilter extends ZuulFilter {
    @Override
    public String filterType() {
        return "pre";
    }

    @Override
    public int filterOrder() {
        return 0;
    }

    @Override
    public boolean shouldFilter() {
        // RequestContext 类似于 RequestContentHolder 都是使用ThreadLocal机制完成的线程隔离
        RequestContext ctx = RequestContext.getCurrentContext();
        HttpServletRequest request = ctx.getRequest();
        String token = request.getHeader("login");
        // 请求头中包含 login:true 则需要进行过滤
        return "true".equals(token);

        // 默认
    }

    @Override
    public Object run() {
        RequestContext ctx = RequestContext.getCurrentContext();
        String token = ctx.getRequest().getHeader("token");
        // token == null 则视为未登录
        if(token==null){
            // 取消zuul路由
            ctx.setSendZuulResponse(false);
            ctx.setResponseStatusCode(200);
            // 为使得中文字符不乱码
            ctx.getResponse().setCharacterEncoding("UTF-8");
            ctx.setResponseBody("请登录");
        }
        return null;
    }
}
