package com.zx.handler;

import com.zx.beans.Student;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import java.util.Map;

@Controller
@RequestMapping("/some")
public class SomeHandler {

    @RequestMapping("/first")
    public String doFirst()throws Exception{
        //返回物理视图，只能用forward，不能使用重定向
        return "forward:/test/bbb.html";
    }

    @RequestMapping("/second")
    public String doSecond()throws Exception{
        //返回逻辑视图
        return "welcome";
    }

    @RequestMapping("/third")
    public String doThird()throws Exception{
        //返回的时候使用重定向可以返回外部资源视图
        return "redirect:http://www.baidu.com";
    }

    @RequestMapping("/fourth")
    public String doFourth()throws Exception{
        //逻辑视图：配置BeanName视图
        return "baidu";
    }

    @RequestMapping("/fifth")
    public String doFifth()throws Exception{
        //重定向访问不到WEB-INF下的资源，因为只能有后台代码访问，前台页面访问不到，如果不加WEB-INF可以访问到
        return "redirect:/WEB-INF/welcome.jsp";
//        return "redirect:/welcome.jsp";
    }
}
