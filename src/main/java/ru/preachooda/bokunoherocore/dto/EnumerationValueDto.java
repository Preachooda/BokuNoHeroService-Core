package ru.preachooda.bokunoherocore.dto;


import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@EqualsAndHashCode(callSuper = true)
@Data
@NoArgsConstructor
public class EnumerationValueDto extends BaseDto {

    private String code;

}
