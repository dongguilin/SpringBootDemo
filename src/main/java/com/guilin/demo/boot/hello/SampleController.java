package com.guilin.demo.boot.hello;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @RestController 等价于 @Controller和@RequestBody
 * Created by guilin1 on 15/12/9.
 */
@RestController
public class SampleController {

    @RequestMapping("/hello")
    public String home() {
        return "Hello World!";
    }

    /**
     * Spring boot默认使用的json解析框架是jackson
     *
     * @return
     */
    @RequestMapping("/getStudent")
    public Student getStudent() {
        Student student = new Student();
        student.setId(11000);
        student.setAge(20);
        student.setName("张三");
        return student;
    }

}
