package tn.smi.refproject.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;
import java.sql.Date;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "CLT_STE_TOT_EXPORT_TRACE", schema = "REF", catalog = "")
public class CltSteTotExportTraceEntity implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Basic
    @Column(name = "TYPE_PIECE_CLIENT")
    private Boolean typePieceClient;
    @Basic
    @Column(name = "NO_PIECE_CLIENT")
    private String noPieceClient;
    @Basic
    @Column(name = "ACTIF_O_N")
    private String actifON;
    @Basic
    @Column(name = "TYPE_OPERATION")
    private String typeOperation;
    @Basic
    @Column(name = "MAT_EMP")
    private Short matEmp;
    @Basic
    @Column(name = "DATE_OPERATION")
    private Date dateOperation;


}
