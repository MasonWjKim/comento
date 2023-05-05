package com.example.demo;

import com.squareup.okhttp.Response;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;

@RestController
@RequiredArgsConstructor
public class SampleController {

    private SampleService sampleService;

    public SampleController(SampleService sampleService) {
        this.sampleService = sampleService;
    }

    @GetMapping("/api/v1/sample/hello")
    public String sample() {
        return sampleService.hello();
    }

    @GetMapping("/api/v1/sample/getMarketCode")
    public Response getMarketCode() throws IOException {
        return sampleService.getMarketCode();
    }

}
