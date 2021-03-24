package com.aditya.project.dto;

import lombok.Data;

import javax.validation.constraints.Past;
import javax.validation.constraints.Size;
import java.util.Date;

@Data
public class UserDto {

    private int id;

    @Size(min = 2)
    private String name;

    @Past
    private Date dob;
}
