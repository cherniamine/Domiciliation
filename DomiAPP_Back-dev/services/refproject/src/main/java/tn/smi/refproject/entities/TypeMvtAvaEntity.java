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
@Table(name = "TYPE_MVT_AVA", schema = "REF", catalog = "")
public class TypeMvtAvaEntity implements Serializable {

    @Id
    @Column(name = "CODE_TYPE_MVT_AVA")
    private String codeTypeMvtAva;
    @Basic
    @Column(name = "LIB_TYPE_MVT_AVA")
    private String libTypeMvtAva;


}
