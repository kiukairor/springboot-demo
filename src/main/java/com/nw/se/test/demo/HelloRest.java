package com.nw.se.test.demo;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

@RestController
public class HelloRest {


    @RequestMapping(path = Constants.API_ENDPOINT, produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseBody
    public Data doAGet() {
        Data p = new Data();
        p.setMyMessage("Hello SE");
        return p;
    }

    @RequestMapping(path = Constants.API_ENDPOINT, produces = MediaType.APPLICATION_JSON_VALUE, method = RequestMethod.POST)
    @ResponseBody
    public Data doAPost(@RequestBody Data body) {
        body.setMyMessage("You just posted: "+ body.getMyMessage());
        return body;
    }


}
