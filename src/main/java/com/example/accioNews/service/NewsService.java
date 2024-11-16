package com.example.accioNews.service;

import com.example.accioNews.config.RestTemplateConfig;
import com.example.accioNews.dto.NewsResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class NewsService {

    //for calling the third party api we use rest template
    @Autowired
    RestTemplate restTemplate;

    //we can make it static as well as final also bcs it is not go na change only change in country and Api key
   private static final String baseUrl = "https://newsapi.org/v2/top-headlines";
    //will write the logic for getting the top headline news
    //making the complete url

    //now we changed the object written type to newsResponse bcs we just what we written in the newsResponse as output
    public NewsResponse getTopHeadlines(String country, String apiKey){
        String url = baseUrl+"?country="+country+"&apiKey="+apiKey;

        //here we use restTemplate         below is the written type
       return restTemplate.getForObject(url, NewsResponse.class); //here it is writtening the object class

    }


}
