package com.docker.dockerapp;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "api/clients")
public class DockerController {

    @GetMapping(value = "/", produces = MediaType.APPLICATION_JSON_VALUE)
    public String find() {
        return "asd";
    }
}
