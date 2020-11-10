package com.tts.transitapp.controller;

import com.tts.transitapp.service.TransitService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class TransitController {
    
    @Autowired
    TransitService transitService;

    

}
