package com.ryan.completableFuture;

import org.springframework.util.ClassUtils;
import org.springframework.util.CollectionUtils;
import org.springframework.util.StringUtils;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executor;
import java.util.function.BiConsumer;
import java.util.function.Supplier;

/**
 * @Classname AsyncHandler
 * @Description TODO
 * @Date 2019/7/26 16:15
 * @Created by fyc
 *
 * CompletableFuture<FaWageLogVO> realTimeFuture =
        CompletableFuture
                .supplyAsync(() -> faWageLogService.updateRealtimeWage(wageLog), threadPool)
                .whenCompleteAsync(
                    (faWageLogVO, throwable) -> {
                        if (Objects.nonNull(throwable)) {
                            log.error("实时计算出现异常，联系后台人员进行处理。" + throwable.getMessage());
                            errMsg.add("实时计算出现异常，联系后台人员进行处理。" + throwable.getMessage());
                        }
                        if (!faWageLogVO.getStatus().isSuccess()) {
                            log.error("实时计算出现异常：" + faWageLogVO.getMessage());
                            errMsg.add("实时计算出现异常：" + faWageLogVO.getMessage());
                        }
                });
 *
 */
public class AsyncHandler<T> {

    MethodDo<T> methodDo;
    Class cls;

    public AsyncHandler setMethodtDo(MethodDo<T> methodDo) {
        this.methodDo = methodDo;
        if (Objects.nonNull(methodDo)) {
            this.cls = methodDo.getCls();
        }
        return this;
    }

    List<String> errorMsg = new ArrayList<>();

    /**
     *@Desc：获取到的CompletableFuture数组对象
     */
    public CompletableFuture<T>[] addAsyncTask(Supplier<T>[] tasks,Executor executor){
        if (Objects.isNull(tasks)) {
            return null;
        }
         Arrays.stream(tasks)
               .map(task ->
                       CompletableFuture
                               .supplyAsync(task, executor)
                               .whenCompleteAsync(gettThrowableBiConsumer()))
               .toArray(CompletableFuture[]::new);
        return null;
    }

    private BiConsumer<T, Throwable> gettThrowableBiConsumer() {
        return (t,throwable)->{
            if (Objects.nonNull(throwable)) {
                invokeMethods(methodDo.getExceptionMethod());
            }
            if (1 == 1) {
                invokeMethods(methodDo.getSuccessMethod());
            } else {
                invokeMethods(methodDo.getErrorMethod());
            }
       };
    }

    public void whenAllComplate(CompletableFuture<T>[] cfs){
        CompletableFuture.allOf(cfs)
                .whenCompleteAsync((t,throwable)->{
                    if (Objects.nonNull(throwable)) {
                        invokeMethods(methodDo.getExceptionMethod());
                    }
                    if (1 == 1) {
                        invokeMethods(methodDo.getSuccessMethod());
                    } else {
                        invokeMethods(methodDo.getErrorMethod());
                    }
                });

    }

    void invokeMethods(List<String> methods) {
        if (CollectionUtils.isEmpty(methods)) {
            return;
        }
        methods.stream().forEach(
                methodName->{
                    try {
                        Method method = getMethodByName(methodName);
                        if (Objects.isNull(method)) {
                            return;
                        }
                        method.invoke(methodDo.getExceptionMethodParams());
                    } catch (IllegalAccessException e) {
                        e.printStackTrace();
                    } catch (InvocationTargetException e) {
                        e.printStackTrace();
                    }
                }
        );

    }


    Method getMethodByName(String name){
        if (Objects.isNull(methodDo) || Objects.isNull(methodDo.getCls()) || StringUtils.isEmpty(name)) {
            return null;
        }
        Method[] methods = methodDo.getCls().getMethods();
        for (Method method : methods) {
            if (name.equals(method.getName())) {
                return method;
            }
        }
        return null;
    }




}