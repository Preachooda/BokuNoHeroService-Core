package ru.preachooda.bokunoherocore.mappers;

import org.mapstruct.Mapper;
import ru.preachooda.bokunoherocore.dto.EnumerationDto;
import ru.preachooda.bokunoherocore.entity.Enumeration;

@Mapper(
        componentModel = "spring",
        uses = BaseMapper.class
)
public abstract class EnumerationMapper extends BaseEntityMapper<Enumeration, EnumerationDto> {
}
