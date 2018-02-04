package com.example.es.es_demo;

import com.example.es.es_demo.domain.Friend;
import com.example.es.es_demo.service.ESService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Description
 * <p>
 * </p>
 * DATE 2018/1/15.
 *
 * @author fupeng.
 */
@RestController
public class TestController {

    @Autowired
    private ESService esService;


    @RequestMapping(value = "/hello")
    public String hello() {
        return "hello";
    }

    /**
     * 添加索引
     * @param friend
     * @return
     */
    @RequestMapping(value = "/friend", method = RequestMethod.POST)
    public String create(@RequestBody Friend friend) {
        System.out.println(friend);

        return esService.add(friend);
    }

}
