package com.application.offeringapi.service;

import com.application.offeringapi.converter.OfferingConverter;
import com.application.offeringapi.entity.OfferingEntity;
import com.application.offeringapi.model.OfferingModel;
import com.application.offeringapi.repository.OfferingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class OfferingServiceImpl implements OfferingService{

    @Autowired
    private OfferingRepository offeringRepository;

    @Autowired
    private OfferingConverter offeringConverter;

    @Override
    public List<OfferingModel> getAllOfferings() {
        List<OfferingModel> offeringModelList = new ArrayList<>();
        Iterable<OfferingEntity> offeringEntities = offeringRepository.findAll();

        for (OfferingEntity offeringEntity : offeringEntities){
            OfferingModel offeringModel = offeringConverter.convertEntityToModel(offeringEntity);
            offeringModelList.add(offeringModel);
        }
        return offeringModelList;
    }

    @Override
    public OfferingModel getAllOfferingById(Long offeringId) {
        OfferingModel offeringModel = null;

        Optional<OfferingEntity> offeringEntityOpt = offeringRepository.findById(offeringId);
        if(offeringEntityOpt.isPresent()){
            offeringModel = offeringConverter.convertEntityToModel(offeringEntityOpt.get());
        }

        return offeringModel;
    }

    @Override
    public boolean createOffering(OfferingModel offeringModel) {
            OfferingEntity offerEntity = offeringConverter.convertModelToEntity(offeringModel);
            OfferingEntity newOffering = offeringRepository.save(offerEntity);
            if (newOffering != null) {
                return true;
            }
            return false;
    }
}
