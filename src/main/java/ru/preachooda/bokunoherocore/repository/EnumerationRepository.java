package ru.preachooda.bokunoherocore.repository;

import org.springframework.stereotype.Repository;
import ru.preachooda.bokunoherocore.entity.Enumeration;

@Repository
public interface EnumerationRepository extends BaseEntityRepository<Enumeration>{

    Enumeration findByCode(String code);

}
