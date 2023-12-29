package sn.maiba.maibashop.domain.model;

import jakarta.persistence.*;

@Table(name = "category")
@Entity(name = "category")
public class Category {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;
    @Column(name = "name")
    private String name;
}
