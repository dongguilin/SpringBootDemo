package com.guilin.demo.boot.chapter1;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

/**
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
        student.setBirthday(new Date());
        student.setRemarks("备注信息");
        return student;
    }

}
