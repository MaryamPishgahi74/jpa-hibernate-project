package org.mary.onlineshop.Domain;


import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.CreationTimestamp;
import org.mary.onlineshop.Domain.enumration.PaymentStatus;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Getter
@Setter
public class Payment {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String paymentId;

    @CreationTimestamp
    private LocalDateTime issueDate;

    @Enumerated(EnumType.STRING)
    private PaymentStatus paymentStatus;

}
