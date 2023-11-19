package ru.preachooda.bokunoherocore.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.preachooda.bokunoherocore.dto.EnumerationDto;
import ru.preachooda.bokunoherocore.entity.Enumeration;
import ru.preachooda.bokunoherocore.mappers.BaseEntityMapper;
import ru.preachooda.bokunoherocore.mappers.EnumerationMapper;
import ru.preachooda.bokunoherocore.services.BaseEntityService;
import ru.preachooda.bokunoherocore.services.EnumerationService;

@RestController
@RequestMapping("/enumerations")
public class EnumerationController extends BaseEntityController<Enumeration, EnumerationDto> {

    @Autowired
    private EnumerationService enumerationService;

    @Autowired
    private EnumerationMapper enumerationMapper;

    @Override
    public BaseEntityService<Enumeration> getService() {
        return enumerationService;
    }

    @Override
    public BaseEntityMapper<Enumeration, EnumerationDto> getMapper() {
        return enumerationMapper;
    }
}
