package com.workintech.s18d1.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table(name = "burger", schema = "public")
public class Burger{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private Double price;

    @Column(name = "is_vegan")
    private boolean IsVegan;

    @Column(name = "bread_type")
    @Enumerated(EnumType.STRING)

    private BreadType breadType;
    private String contents;

    public boolean getIsVegan() {
        return IsVegan;
    }
}
