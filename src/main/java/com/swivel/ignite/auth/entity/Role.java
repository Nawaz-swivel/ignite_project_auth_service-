package com.swivel.ignite.auth.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;
import java.util.Set;

/**
 * Role entity
 */
@Entity
@Table(name = "role")
@NoArgsConstructor
@Getter
@Setter
public class Role implements Serializable {

    @Transient
    private static final String ROLE_ID_PREFIX = "rid-";

    @Id
    private String id;
    @Column(name = "name", unique = true, nullable = false)
    private String name;
    @OneToMany(mappedBy = "role", fetch = FetchType.LAZY)
    private Set<User> users;
    @Column
    private Date created;
    @Column
    private Date updated;

    @PrePersist
    private void onCreate() {
        created = new Date();
        updated = new Date();
    }

    @PreUpdate
    private void onUpdate() {
        updated = new Date();
    }
}
