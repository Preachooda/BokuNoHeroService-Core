package ru.preachooda.bokunoherocore.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.preachooda.bokunoherocore.dto.EnumerationValueDto;
import ru.preachooda.bokunoherocore.entity.EnumerationValue;
import ru.preachooda.bokunoherocore.mappers.BaseEntityMapper;
import ru.preachooda.bokunoherocore.mappers.EnumerationValueMapper;
import ru.preachooda.bokunoherocore.services.BaseEntityService;
import ru.preachooda.bokunoherocore.services.EnumerationValueService;

@RestController
@RequestMapping("/enumeration-values")
public class EnumerationValueController extends BaseEntityController<EnumerationValue, EnumerationValueDto> {

    @Autowired
    private EnumerationValueService enumerationService;

    @Autowired
    private EnumerationValueMapper enumerationMapper;

    @Override
    public BaseEntityService<EnumerationValue> getService() {
        return enumerationService;
    }

    @Override
    public BaseEntityMapper<EnumerationValue, EnumerationValueDto> getMapper() {
        return enumerationMapper;
    }

}
