package com.ryan.daily.genericity;

import com.ryan.daily.Person;
import com.ryan.daily.PersonDto;

/**
 * @ClassName ConvertTest
 * @Description TODO
 * @Author fengyc
 * @Date 2023/5/31
 * @Version 1.0
 **/
public class ConvertTest {

    public static void main(String[] args) {
        //beanUtils复制时，只有字段类型一致时，才可进行属性值的复制
        Person person = new Person();
        person.setName("kahdaidgad");
        person.setAge(2023);
        person.setSex(true);
        //使用包装类，进行数据复制转换
        ConverWapper<PersonDto,Person> wapper = new ConverWapper();
        PersonDto convert = wapper.convert(PersonDto::new, person);
        System.out.println(convert);


        //匿名内部类方式进行数据复制转换
        Convert<PersonDto, Person> convert2 = new Convert<PersonDto, Person>() {
            @Override
            public PersonDto init() {
                return new PersonDto();
            }
        };
        PersonDto convert1 = convert2.convert(person);
        System.out.println(convert1);


    }


}
