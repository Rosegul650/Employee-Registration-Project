package com.cydeo.model;

import jakarta.validation.constraints.*;
import lombok.*;
import org.springframework.format.annotation.DateTimeFormat;

import java.time.LocalDate;
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Employee {
//    @NotNull    --->field should not be null
//    @NotBlank   ---->fileld should not be "      "
//    @NotEmpty  --->filed should not be " "

//    @NotNull    -->@NotNull
//    @NotBlank   -->NotNull + @NotEmpty + @NotBlank
//    @NotEmpty   -->@NotNull +@NotEmpty

    @NotBlank
    @Size(max = 12, min = 3)
    private String firstName;
    private String lastName;
//    @NotNull
    //Thymeleaf -->yyyy-MM-dd,   but LocalDate---->mm-dd-yyyy
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private LocalDate birthday;

//    @NotNull
//    @Email
    private String email;
//    @NotBlank
//    @Pattern(regexp = "(?=.*\\d)(?=.*[a-z])(?=.*[A-Z]).{4,}")
    private String password;
    private String address;
    private String address2;
    private String city;
    private String state;
    private String zipCode;



}
