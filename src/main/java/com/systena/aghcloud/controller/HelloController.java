package com.systena.aghcloud.controller;

import com.systena.aghcloud.dto.ResponseGeneral;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import static com.systena.aghcloud.constants.AghCloudConstants.MessageCode.SUCCESS;

@RestController
@RequestMapping("hello")
@RequiredArgsConstructor
@Slf4j
public class HelloController {
    @GetMapping
    public ResponseGeneral<String> hello (){
        return ResponseGeneral.of(
                HttpStatus.OK.value(),
                SUCCESS,
                "Hello world");
    }
}
