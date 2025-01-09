package com.scm.SmartContactManager.Components;

import jakarta.annotation.Nullable;
import jakarta.validation.constraints.NotNull;
import lombok.*;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Builder
@Setter
@Getter
@ToString
@Component
@NoArgsConstructor
@AllArgsConstructor
public class UserRegistrationForm {

    @NotNull
    private String name;

    @NotNull
    private String email;

    @NotNull
    private String password;

    @Nullable
    private String about;

    private String profilePic;

    @NotNull
    private String phoneNumber;

}
