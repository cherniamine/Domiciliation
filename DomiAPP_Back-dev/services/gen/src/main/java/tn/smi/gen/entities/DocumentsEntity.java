package tn.smi.gen.entities;

import jakarta.persistence.*;
import java.sql.Date;

@Entity
@Table(name = "DOCUMENTS", schema = "GEN")
@IdClass(DocumentsEntityPK.class)
public class DocumentsEntity {

    @Id
    @Column(name = "CODE_PRODUIT_SERVICE")
    private short codeProduitService;

    @Id
    @Column(name = "CODE_OPERATION")
    private short codeOperation;

    @Id
    @Column(name = "REF_OPERATION")
    private int refOperation;

    @Id
    @Column(name = "DATE_OPERATION")
    private Date dateOperation;

    @Basic
    @Column(name = "UNITE_OPERATION")
    private Byte uniteOperation;

    @Basic
    @Column(name = "TYPE_DOSSIER")
    private String typeDossier;

    @Basic
    @Column(name = "NUM_DOSSIER")
    private Integer numDossier;

    @Basic
    @Column(name = "DATE_DOSSIER")
    private Date dateDossier;

    @Basic
    @Column(name = "NUM_LIGNE")
    private byte numLigne;

    @Basic
    @Column(name = "REFERENCE_FICHIER_JOINT")
    private String referenceFichierJoint;

    @Basic
    @Column(name = "PATH_ANNEE")
    private String pathAnnee;

    @Basic
    @Column(name = "PATH_MOIS")
    private String pathMois;

    @Basic
    @Column(name = "EXTENSION")
    private String extension;

    // Getters et setters
    public short getCodeProduitService() {
        return codeProduitService;
    }

    public void setCodeProduitService(short codeProduitService) {
        this.codeProduitService = codeProduitService;
    }

    public short getCodeOperation() {
        return codeOperation;
    }

    public void setCodeOperation(short codeOperation) {
        this.codeOperation = codeOperation;
    }

    public int getRefOperation() {
        return refOperation;
    }

    public void setRefOperation(int refOperation) {
        this.refOperation = refOperation;
    }

    public Date getDateOperation() {
        return dateOperation;
    }

    public void setDateOperation(Date dateOperation) {
        this.dateOperation = dateOperation;
    }

    public Byte getUniteOperation() {
        return uniteOperation;
    }

    public void setUniteOperation(Byte uniteOperation) {
        this.uniteOperation = uniteOperation;
    }

    public String getTypeDossier() {
        return typeDossier;
    }

    public void setTypeDossier(String typeDossier) {
        this.typeDossier = typeDossier;
    }

    public Integer getNumDossier() {
        return numDossier;
    }

    public void setNumDossier(Integer numDossier) {
        this.numDossier = numDossier;
    }

    public Date getDateDossier() {
        return dateDossier;
    }

    public void setDateDossier(Date dateDossier) {
        this.dateDossier = dateDossier;
    }

    public byte getNumLigne() {
        return numLigne;
    }

    public void setNumLigne(byte numLigne) {
        this.numLigne = numLigne;
    }

    public String getReferenceFichierJoint() {
        return referenceFichierJoint;
    }

    public void setReferenceFichierJoint(String referenceFichierJoint) {
        this.referenceFichierJoint = referenceFichierJoint;
    }

    public String getPathAnnee() {
        return pathAnnee;
    }

    public void setPathAnnee(String pathAnnee) {
        this.pathAnnee = pathAnnee;
    }

    public String getPathMois() {
        return pathMois;
    }

    public void setPathMois(String pathMois) {
        this.pathMois = pathMois;
    }

    public String getExtension() {
        return extension;
    }

    public void setExtension(String extension) {
        this.extension = extension;
    }
}
