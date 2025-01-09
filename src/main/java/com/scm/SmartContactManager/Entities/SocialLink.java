package com.scm.SmartContactManager.Entities;

import jakarta.persistence.*;
import lombok.*;

@Entity(name="socialLink")
@Table(name="socialLink")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Builder
public class SocialLink {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "social_id", nullable = false)
    private Long socialId;

    @Column(length = 10000, columnDefinition = "TEXT")
    private String link;
    private String title;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "contact_id")
    private Contact contact;

}
