package com.scm.SmartContactManager.Entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
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
    private String socialId;
    private String link;
}
