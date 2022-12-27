package com.lol.lolbackend.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@AllArgsConstructor
@NoArgsConstructor
public class Champions {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Getter
    @Setter
    private Integer idChampion;

    @Getter
    @Setter
    private String nameChampion;

    @Getter
    @Setter
    private Integer priceChampion;

    @Getter
    @Setter
    private String imageChampion;

    public Champions(String nameChampion, Integer priceChampion, String imageChampion) {
        this.nameChampion = nameChampion;
        this.priceChampion = priceChampion;
        this.imageChampion=imageChampion;
    }
}
