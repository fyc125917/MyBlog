package com.ryan.daily.genericity;

import org.springframework.beans.BeanUtils;

public interface Convert<T,S> {
    T init();

    default T convert(S source) {
        T init = init();
        BeanUtils.copyProperties(source, init);
        return init;
    }

}
