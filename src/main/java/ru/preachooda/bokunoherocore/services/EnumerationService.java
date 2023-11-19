package ru.preachooda.bokunoherocore.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.preachooda.bokunoherocore.entity.Enumeration;
import ru.preachooda.bokunoherocore.repository.BaseEntityRepository;
import ru.preachooda.bokunoherocore.repository.EnumerationRepository;

@Service
public class EnumerationService extends BaseEntityService<Enumeration> {

    @Autowired
    private EnumerationRepository enumerationRepository;

    @Override
    public BaseEntityRepository<Enumeration> getRepository() {
        return enumerationRepository;
    }
}
