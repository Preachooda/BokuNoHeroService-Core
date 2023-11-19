package ru.preachooda.bokunoherocore.dto;

import lombok.Data;

import java.util.Date;

@Data
public abstract class BaseDto {

    private Long id;

    private String label;

    private Date creationDate;

}
