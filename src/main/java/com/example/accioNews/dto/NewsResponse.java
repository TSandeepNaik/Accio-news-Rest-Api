package com.example.accioNews.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class NewsResponse {   //here we dont need to do the conversion also restTemplate will do everything

    //we have to give same fields which are in the API to get that part as output
    int totalResults;
    List<ArticleResponse> articles;
}
