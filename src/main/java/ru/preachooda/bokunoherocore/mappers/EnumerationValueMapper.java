package ru.preachooda.bokunoherocore.mappers;

import org.mapstruct.Mapper;
import ru.preachooda.bokunoherocore.dto.EnumerationValueDto;
import ru.preachooda.bokunoherocore.entity.EnumerationValue;

@Mapper(
        componentModel = "spring",
        uses = BaseMapper.class
)
public abstract class EnumerationValueMapper extends BaseEntityMapper<EnumerationValue, EnumerationValueDto> {
}
