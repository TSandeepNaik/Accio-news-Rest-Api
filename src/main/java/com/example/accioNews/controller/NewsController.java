package com.example.accioNews.controller;

import ch.qos.logback.core.rolling.SizeAndTimeBasedRollingPolicy;
import com.example.accioNews.dto.NewsResponse;
import com.example.accioNews.service.NewsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController   // it will tell that it is a controller class and u have to create the beans means it will create the class internally
@RequestMapping("/api/v1/news")
public class NewsController {

    @Autowired
    NewsService newsService;

    //getNewsByCountry api
    @GetMapping("/Country")
    public NewsResponse getNewsByCountry(@RequestParam("country") String country, @RequestParam("apiKey")String apiKey ){
         //here are making the return type as a Object which is parent of all class because we dont know the data type
        // of the return class which news api writtening
        return newsService.getTopHeadlines(country,apiKey);
    }
}
