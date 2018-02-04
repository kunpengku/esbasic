package com.example.es.es_demo.service.impl;

import com.example.es.es_demo.domain.Friend;
import com.example.es.es_demo.service.ESService;
import com.google.gson.Gson;
import org.elasticsearch.action.index.IndexResponse;
import org.elasticsearch.client.transport.TransportClient;
import org.elasticsearch.common.xcontent.XContentType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Description
 * <p>
 * </p>
 * DATE 2018/2/4.
 *
 * @author fupeng.
 */
@Service
public class ESServiceImpl implements ESService {

    @Autowired
    TransportClient client;

    @Override
    public String add(Friend friend) {
        IndexResponse response = client.prepareIndex("friends", "friends")
                .setSource(toJson(friend), XContentType.JSON)
                .get();
        return response.toString();
    }

    private String toJson(Friend friend){
        Gson g = new Gson();
        return g.toJson(friend);
    }
}
