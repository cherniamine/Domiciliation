package tn.smi.refproject.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Embeddable
public class BanqueSwiftServiceEntityPK implements Serializable {

    @Column(name = "CODE_BANQUE")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private byte codeBanque;

    @Column(name = "CODE_SERVICE")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private byte codeService;

}
