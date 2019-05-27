package com.stackroute.demo;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class BeanLifecycleDemoBean implements InitializingBean, DisposableBean
{
    @Override
    public void afterPropertiesSet() throws Exception
    {
        System.out.println("Welcome");

    }

    @Override
    public void destroy() throws Exception
    {
        System.out.println("This will destroy life cycle");
    }
}
