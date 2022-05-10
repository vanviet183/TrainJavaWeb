package com.trainb1.trainb1.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.Nationalized;

import javax.persistence.*;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "users")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Nationalized
    @Column(name = "ho")
    private String firstName;

    @Nationalized
    private String lastName;

    private String username;

    private String password;

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer cnt;


}
