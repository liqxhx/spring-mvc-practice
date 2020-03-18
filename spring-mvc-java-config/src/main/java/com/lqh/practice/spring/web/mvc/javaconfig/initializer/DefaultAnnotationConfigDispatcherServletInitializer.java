package com.lqh.practice.spring.web.mvc.javaconfig.initializer;

import com.lqh.practice.spring.web.mvc.javaconfig.config.DispatcherServletConfiguration;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

/**
 * <p> 类描述: DefaultAnnotationConfigDispatcherServletInitializer
 *
 * @author liqinghui
 * @version 1.0
 * @date 2020/03/16 23:12
 * @since 2020/03/16 23:12
 */
public class DefaultAnnotationConfigDispatcherServletInitializer extends AbstractAnnotationConfigDispatcherServletInitializer {
    @Override
    protected Class<?>[] getRootConfigClasses() {
        return new Class[0];
    }

    @Override
    protected Class<?>[] getServletConfigClasses() {
        return new Class[] {DispatcherServletConfiguration.class};
    }

    @Override
    protected String[] getServletMappings() {
        return new String[]{"/"};
    }
}
