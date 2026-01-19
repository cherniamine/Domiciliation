package tn.smi.refproject.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "TYPE_COMMISSION", schema = "REF", catalog = "")
public class TypeCommissionEntity implements Serializable {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "CODE_TYPE_COM")
    private byte codeTypeCom;
    @Basic
    @Column(name = "LIB_TYPE_COM")
    private String libTypeCom;


}
