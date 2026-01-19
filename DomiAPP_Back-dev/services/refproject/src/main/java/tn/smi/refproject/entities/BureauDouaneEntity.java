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
@Table(name = "BUREAU_DOUANE", schema = "REF", catalog = "")
public class BureauDouaneEntity implements Serializable {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "CODE_BUREAU")
    private byte codeBureau;
    @Basic
    @Column(name = "LIB_BUREAU")
    private String libBureau;






}
