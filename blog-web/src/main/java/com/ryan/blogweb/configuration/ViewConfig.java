package com.ryan.blogweb.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.web.servlet.ViewResolver;
import org.thymeleaf.spring5.SpringTemplateEngine;
import org.thymeleaf.spring5.templateresolver.SpringResourceTemplateResolver;
import org.thymeleaf.spring5.view.ThymeleafViewResolver;

/**
 * @Classname ViewConfig
 * @Description 配置thyemleaf的视图解析器
 *              1.配置SpringSourceTemplateResolver
 *                  1.1配置html文件前缀，后缀是否缓存，文件模型等
 *              2.添加SpringSourceTemplateResolver到SpringTemplateEngine中
 *              3.将SpringTemplateEnigne对象添加至Thyemleaf对象中，并返回ViewResolver对象
 *
 * @Date 2019/5/24 19:11
 * @Created by fyc
 */
@Configuration
public class ViewConfig {
    /**
     * 设置视图解析器
     * @param templateEngine
     * @return
     */
    @Bean
    public ViewResolver viewResolver(SpringTemplateEngine templateEngine){
        ThymeleafViewResolver resolver = new ThymeleafViewResolver();
        resolver.setTemplateEngine(templateEngine);
        return resolver;
    }
    /**
     * 设置模板引擎
     * @param templateResolver
     * @return
     */
    @Primary
    @Bean
    public SpringTemplateEngine templateEngine(SpringResourceTemplateResolver templateResolver){
        SpringTemplateEngine engine = new SpringTemplateEngine();
        engine.setTemplateResolver(templateResolver);
        return engine;
    }
    /**
     * 模板解析引擎
     * @return
     */
    @Bean
    public SpringResourceTemplateResolver templateResolver(){
        SpringResourceTemplateResolver springResourceTemplateResolver = new SpringResourceTemplateResolver();
        springResourceTemplateResolver.setPrefix("classpath:/templates/");//设置地址前缀
        springResourceTemplateResolver.setSuffix(".html");//设置后缀
        springResourceTemplateResolver.setCacheable(false);//设置不缓存
        springResourceTemplateResolver.setTemplateMode("HTML5");
        return springResourceTemplateResolver;
    }
}