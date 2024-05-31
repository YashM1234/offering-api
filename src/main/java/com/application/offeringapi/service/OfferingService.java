package com.application.offeringapi.service;

import com.application.offeringapi.model.OfferingModel;

import java.util.List;

public interface OfferingService {
    List<OfferingModel> getAllOfferings();
    OfferingModel getAllOfferingById(Long offeringId);
    boolean createOffering( OfferingModel offeringModel);
}
