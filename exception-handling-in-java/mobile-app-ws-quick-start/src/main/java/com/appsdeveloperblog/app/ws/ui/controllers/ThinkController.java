package com.appsdeveloperblog.app.ws.ui.controllers;


import java.util.List;

import javax.servlet.http.HttpServletResponse;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.util.UriComponentsBuilder;

import com.appsdeveloperblog.app.ws.ui.model.response.Foo;

@Controller
@RequestMapping("foos")
public class ThinkController {

	// API

    // read - single
    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    @ResponseBody
    public ResponseEntity<Foo> findById(
    		@PathVariable("id") final Long id, 
    		final UriComponentsBuilder uriBuilder, 
    		final HttpServletResponse response) {
        //return new Foo();
    	if(id instanceof Long) {
    		return new ResponseEntity<>(new Foo(), HttpStatus.OK);
    	}else {
    		return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
    	}
    }

//    // read - multiple
//    @RequestMapping(method = RequestMethod.GET)
//    @ResponseBody
//    public List<Foo> findAll() {
//        return Lists.newArrayList(new Foo(randomAlphabetic(6)));
//    }

    // write - just for test
    @RequestMapping(method = RequestMethod.POST)
    @ResponseStatus(HttpStatus.CREATED)
    @ResponseBody
    public Foo create(@RequestBody final Foo foo) throws Exception {
    	throw new Exception();
        //return foo;
    }
}
