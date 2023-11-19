package ru.preachooda.bokunoherocore.mappers;

import org.mapstruct.Mapping;
import ru.preachooda.bokunoherocore.dto.BaseDto;
import ru.preachooda.bokunoherocore.entity.BaseEntity;

import java.util.List;

public abstract class BaseEntityMapper<E extends BaseEntity, D extends BaseDto> {

    @Mapping(source = "creationDate", target = "creationDate", qualifiedByName = "dateTime")
    public abstract E dtoToEntity(D dto);

    @Mapping(source = "creationDate", target = "creationDate", qualifiedByName = "dateTime")
    public abstract D entityToDto(E entity);

    public abstract List<D> entityListToDtoList(List<E> entityList);

    public abstract List<E> dtoListToEntityList(List<D> dtoList);

}