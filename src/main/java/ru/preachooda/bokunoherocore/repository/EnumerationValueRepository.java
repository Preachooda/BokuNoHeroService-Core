package ru.preachooda.bokunoherocore.repository;

import org.springframework.stereotype.Repository;
import ru.preachooda.bokunoherocore.entity.Enumeration;
import ru.preachooda.bokunoherocore.entity.EnumerationValue;

import java.util.List;

@Repository
public interface EnumerationValueRepository extends BaseEntityRepository<EnumerationValue>{

    EnumerationValue findByCode(String code);

    List<EnumerationValue> findAllByEnumeration(Enumeration enumeration);
}
