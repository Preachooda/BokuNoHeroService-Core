package ru.preachooda.bokunoherocore.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.preachooda.bokunoherocore.entity.EnumerationValue;
import ru.preachooda.bokunoherocore.repository.BaseEntityRepository;
import ru.preachooda.bokunoherocore.repository.EnumerationValueRepository;

@Service
public class EnumerationValueService extends BaseEntityService<EnumerationValue> {

    @Autowired
    private EnumerationValueRepository enumerationValueRepository;

    @Override
    public BaseEntityRepository<EnumerationValue> getRepository() {
        return enumerationValueRepository;
    }

}
