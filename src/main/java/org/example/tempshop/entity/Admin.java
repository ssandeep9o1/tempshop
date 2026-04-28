package org.example.tempshop.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Entity
@Getter
@Setter
public class Admin {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long admin_id;//shop owner.
    private String name;
    private String contact;
    private String shopName;
    private String address;
    private String image;

    @OneToOne(mappedBy = "admin", cascade = CascadeType.ALL)
    private Qr qr;

    @OneToMany(mappedBy = "admin")
    private List<Items> items;
}
