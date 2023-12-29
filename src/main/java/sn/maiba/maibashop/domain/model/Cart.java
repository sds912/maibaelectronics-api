package sn.maiba.maibashop.domain.model;

import jakarta.persistence.*;

@Table(name = "cart")
@Entity(name = "cart")
public class Cart {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;
}
