package com.usenocak.movieclient.controller;

import com.usenocak.movieclient.model.Movie;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@RestController
public class MovieController {
    @Autowired
    private DiscoveryClient discoveryClient;

    @GetMapping("/")
    public List<Movie> handleRequest(Model model) {
        List<ServiceInstance> instances = discoveryClient.getInstances("Movie-service");
        if (instances != null && !instances.isEmpty()) {
            ServiceInstance serviceInstance = instances.get(0);
            String url = serviceInstance.getUri().toString();
            url = url + "/list";
            RestTemplate restTemplate = new RestTemplate();
            return restTemplate.getForObject(url, List.class);
        }
        return null;
    }
}
