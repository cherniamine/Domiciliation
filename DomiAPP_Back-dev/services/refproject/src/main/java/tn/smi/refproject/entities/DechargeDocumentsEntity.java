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
@Table(name = "DECHARGE_DOCUMENTS", schema = "REF", catalog = "")
public class DechargeDocumentsEntity implements Serializable {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "CODE_DOCUMENT")
    private short codeDocument;
    @Basic
    @Column(name = "LIBELLE_DOCUMENT")
    private String libelleDocument;


}
