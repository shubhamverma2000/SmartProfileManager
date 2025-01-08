package com.scm.SmartContactManager.Entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.*;
import org.hibernate.validator.internal.util.stereotypes.Lazy;

import java.util.ArrayList;
import java.util.List;

@Entity(name="contact")
@Table(name="contact")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Builder
public class Contact {
    @Id
    private String contactId;

    private String name;
    private String address;
    private String email;
    private String phoneNumber;
    private String city;
    private String picture;
    private Boolean favorite =false;

    @OneToMany()
    private List<SocialLink> socialLink = new ArrayList<>();


}
