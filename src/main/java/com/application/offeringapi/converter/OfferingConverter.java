package com.application.offeringapi.converter;

import com.application.offeringapi.entity.OfferingEntity;
import com.application.offeringapi.model.OfferingModel;
import org.springframework.stereotype.Component;

@Component
public class OfferingConverter {
    public OfferingModel convertEntityToModel(OfferingEntity offeringEntity){
        OfferingModel offeringModel = new OfferingModel();
        offeringModel.setOfferingId(offeringEntity.getOfferingId());
        offeringModel.setDescription(offeringEntity.getDescription());
        offeringModel.setOfferingName(offeringEntity.getOfferingName());
        offeringModel.setEligibilityCriteria(offeringEntity.getEligibilityCriteria());

        return offeringModel;

    }

    public OfferingEntity convertModelToEntity(OfferingModel offeringModel){
        OfferingEntity offeringEntity = new OfferingEntity();
        offeringEntity.setDescription(offeringModel.getDescription());
        offeringEntity.setOfferingName(offeringModel.getOfferingName());
        offeringEntity.setEligibilityCriteria(offeringModel.getEligibilityCriteria());

        return offeringEntity;

    }
}
