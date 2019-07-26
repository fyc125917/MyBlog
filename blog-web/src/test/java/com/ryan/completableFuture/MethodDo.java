package com.ryan.completableFuture;

import java.util.List;
import java.util.Map;

/**
 * @Classname CurrentDo
 * @Description TODO
 * @Date 2019/7/26 18:39
 * @Created by fyc
 */
public class MethodDo<T> {

    //异常时执行的方法
    private List<String> exceptionMethod;
    private Map<String, Map<String,String>> exceptionMethodParams;
    //成功时执行的方法
    private List<String> successMethod;
    private Map<String, Map<String,String>> successMethodParams;
    //失败时执行的方法
    private List<String> errorMethod;
    private Map<String, Map<String,String>> errorMethodParams;
    //所有异步操作全部执行完后的方法
    private List<String> allComplateMethod;
    private Map<String, Map<String,String>> allComplateMethodParams;

    private Class cls;

    public List<String> getExceptionMethod() {
        return exceptionMethod;
    }

    public MethodDo setExceptionMethod(List<String> exceptionMethod) {
        this.exceptionMethod = exceptionMethod;
        return this;
    }

    public Map<String, Map<String, String>> getExceptionMethodParams() {
        return exceptionMethodParams;
    }

    public MethodDo setExceptionMethodParams(Map<String, Map<String, String>> exceptionMethodParams) {
        this.exceptionMethodParams = exceptionMethodParams;
        return this;
    }

    public List<String> getSuccessMethod() {
        return successMethod;
    }

    public MethodDo setSuccessMethod(List<String> successMethod) {
        this.successMethod = successMethod;
        return this;
    }

    public Map<String, Map<String, String>> getSuccessMethodParams() {
        return successMethodParams;
    }

    public MethodDo setSuccessMethodParams(Map<String, Map<String, String>> successMethodParams) {
        this.successMethodParams = successMethodParams;
        return this;
    }

    public List<String> getErrorMethod() {
        return errorMethod;
    }

    public MethodDo setErrorMethod(List<String> errorMethod) {
        this.errorMethod = errorMethod;
        return this;
    }

    public Map<String, Map<String, String>> getErrorMethodParams() {
        return errorMethodParams;
    }

    public MethodDo setErrorMethodParams(Map<String, Map<String, String>> errorMethodParams) {
        this.errorMethodParams = errorMethodParams;
        return this;
    }

    public Class getCls() {
        return cls;
    }

    public MethodDo setCls(Class cls) {
        this.cls = cls;
        return this;
    }

    public List<String> getAllComplateMethod() {
        return allComplateMethod;
    }

    public MethodDo setAllComplateMethod(List<String> allComplateMethod) {
        this.allComplateMethod = allComplateMethod;
        return this;
    }

    public Map<String, Map<String, String>> getAllComplateMethodParams() {
        return allComplateMethodParams;
    }

    public MethodDo setAllComplateMethodParams(Map<String, Map<String, String>> allComplateMethodParams) {
        this.allComplateMethodParams = allComplateMethodParams;
        return this;
    }
}