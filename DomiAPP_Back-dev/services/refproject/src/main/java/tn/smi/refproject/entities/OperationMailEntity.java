package tn.smi.refproject.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "OPERATION_MAIL", schema = "REF", catalog = "")
public class OperationMailEntity {
    @EmbeddedId
    private OperationMailEntityPK operationMailEntityPK;
    @Basic
    @Column(name = "AVIS_CLIENT_O_N")
    private String avisClientON;
    @Basic
    @Column(name = "OBJECT_CLIENT")
    private String objectClient;
    @Basic
    @Column(name = "SUJET_CLIENT")
    private String sujetClient;
    @Basic
    @Column(name = "AVIS_AUTRE_DESTINATION1")
    private String avisAutreDestination1;
    @Basic
    @Column(name = "MAIL_AUTRE_DESTINATION1")
    private String mailAutreDestination1;
    @Basic
    @Column(name = "OBJECT_AUTRE_DESTINATION1")
    private String objectAutreDestination1;
    @Basic
    @Column(name = "SUJET_AUTRE_DESTINATION1")
    private String sujetAutreDestination1;
    @Basic
    @Column(name = "AVIS_AUTRE_DESTINATION2")
    private String avisAutreDestination2;
    @Basic
    @Column(name = "MAIL_AUTRE_DESTINATION2")
    private String mailAutreDestination2;
    @Basic
    @Column(name = "OBJECT_AUTRE_DESTINATION2")
    private String objectAutreDestination2;
    @Basic
    @Column(name = "SUJET_AUTRE_DESTINATION2")
    private String sujetAutreDestination2;
    @Basic
    @Column(name = "AVIS_AUTRE_DESTINATION3")
    private String avisAutreDestination3;
    @Basic
    @Column(name = "MAIL_AUTRE_DESTINATION3")
    private String mailAutreDestination3;
    @Basic
    @Column(name = "OBJECT_AUTRE_DESTINATION3")
    private String objectAutreDestination3;
    @Basic
    @Column(name = "SUJET_AUTRE_DESTINATION3")
    private String sujetAutreDestination3;
    @Basic
    @Column(name = "AVIS_AUTRE_DESTINATION4")
    private String avisAutreDestination4;
    @Basic
    @Column(name = "MAIL_AUTRE_DESTINATION4")
    private String mailAutreDestination4;
    @Basic
    @Column(name = "OBJECT_AUTRE_DESTINATION4")
    private String objectAutreDestination4;
    @Basic
    @Column(name = "SUJET_AUTRE_DESTINATION4")
    private String sujetAutreDestination4;
    @Basic
    @Column(name = "AVIS_AUTRE_DESTINATION5")
    private String avisAutreDestination5;
    @Basic
    @Column(name = "MAIL_AUTRE_DESTINATION5")
    private String mailAutreDestination5;
    @Basic
    @Column(name = "OBJECT_AUTRE_DESTINATION5")
    private String objectAutreDestination5;
    @Basic
    @Column(name = "SUJET_AUTRE_DESTINATION5")
    private String sujetAutreDestination5;
    @Basic
    @Column(name = "AVIS_AUTRE_DESTINATION6")
    private String avisAutreDestination6;
    @Basic
    @Column(name = "MAIL_AUTRE_DESTINATION6")
    private String mailAutreDestination6;
    @Basic
    @Column(name = "OBJECT_AUTRE_DESTINATION6")
    private String objectAutreDestination6;
    @Basic
    @Column(name = "SUJET_AUTRE_DESTINATION6")
    private String sujetAutreDestination6;


}
