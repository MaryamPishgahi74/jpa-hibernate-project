package org.mary.onlineshop.Domain;


import lombok.Getter;

import javax.persistence.*;

@Entity
@Table(name = "USER_TABLE")
@SequenceGenerator(name="user_sequence_generator",sequenceName = "user_sequence" , allocationSize = 30)
@Getter
public abstract class User {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE,generator = "user_sequence_generator")
    private Long id;

    @Column(name="FIRST_NAME", nullable=false)
    //@Basic(optional=false)
    //@NotNull
    private String firstName;
    private String lastName;
    private String mobileNumber;


}
