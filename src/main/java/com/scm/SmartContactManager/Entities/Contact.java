package com.scm.SmartContactManager.Entities;

import jakarta.persistence.*;
import lombok.*;
import org.hibernate.FetchMode;
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
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "contact_id", nullable = false)
    private Long contactId;

    private String name;
    private String address;
    private String email;
    private String phoneNumber;
    private String city;
    private String picture;
    private Boolean favorite =false;

    @OneToMany(
            fetch = FetchType.EAGER,
            mappedBy = "contact",
            cascade = CascadeType.ALL,
            orphanRemoval = true)
    private List<SocialLink> socialLinks = new ArrayList<>();

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id")
    private User user;

}
