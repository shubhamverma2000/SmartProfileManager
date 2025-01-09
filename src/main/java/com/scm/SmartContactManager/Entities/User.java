package com.scm.SmartContactManager.Entities;

import jakarta.persistence.*;
import lombok.*;
import org.attoparser.dom.Text;

import java.util.ArrayList;
import java.util.List;

@Entity(name="user")
@Table(name="user")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Builder
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "user_id", nullable = false)
    private Long userId;

    @Column(name="user_name", nullable = false)
    private String name;

    @Column(unique = true, nullable = false)
    private String email;
    private String password;

    @Column(length = 10000, columnDefinition = "TEXT")
    private String about;

    @Column(length = 10000, columnDefinition = "TEXT")
    private String profilePic;
    private String phoneNumber;
    //information
    private boolean enabled= false;
    private boolean emailVerfied = false;
    private boolean phoneVerified = false;

    //SELF, GOOGLE, FACEBOOK, TWITTER, LINKEDIN, GITHUB
    private Providers provider= Providers.SELF;
    private String providerUserId;

    @OneToMany(
            fetch = FetchType.EAGER,
            mappedBy = "user",
            cascade = CascadeType.ALL,
            orphanRemoval = true)
    private List<Contact> contacts = new ArrayList<>();

}
