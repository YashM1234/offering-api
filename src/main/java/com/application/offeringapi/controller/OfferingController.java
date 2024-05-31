package com.application.offeringapi.controller;

import com.application.offeringapi.model.OfferingModel;
import com.application.offeringapi.service.OfferingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1")
public class OfferingController {

    @Autowired
    private OfferingService offeringService;

    @GetMapping("/offerings")
    public ResponseEntity<List<OfferingModel>> getAllOfferings(){
        List<OfferingModel> offeringModelList = offeringService.getAllOfferings();
        return new ResponseEntity<>(offeringModelList, HttpStatus.OK);

    }

    @GetMapping("/offerings/{offeringId}")
    public ResponseEntity<OfferingModel> getAllOfferingById(@PathVariable("offeringId") Long offeringId){
        OfferingModel offeringModel = offeringService.getAllOfferingById(offeringId);
        return new ResponseEntity<>(offeringModel, HttpStatus.OK);
    }

    @PostMapping("/offerings")
    public ResponseEntity<String> createOffering(@RequestBody OfferingModel offeringModel){

        ResponseEntity<String> responseEntity = null;
        boolean result = offeringService.createOffering(offeringModel);

        if (result){
            responseEntity = new ResponseEntity<>("Offering created", HttpStatus.CREATED);
        }else{
            responseEntity = new ResponseEntity<>("Offering could not be created", HttpStatus.INTERNAL_SERVER_ERROR);
        }

        return responseEntity;
    }

}
