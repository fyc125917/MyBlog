package com.ryan.daily;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @ClassName PersonDto
 * @Description TODO
 * @Author fengyc
 * @Date 2023/5/31
 * @Version 1.0
 **/
@Data
@NoArgsConstructor
@AllArgsConstructor
public class PersonDto {

    String name;

    String age;

    String sex;

}
