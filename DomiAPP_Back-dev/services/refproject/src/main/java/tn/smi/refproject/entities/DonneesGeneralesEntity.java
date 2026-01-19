package tn.smi.refproject.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;
import java.math.BigDecimal;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "DONNEES_GENERALES", schema = "REF", catalog = "")
public class DonneesGeneralesEntity implements Serializable {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "CODE_BANQUE")
    private byte codeBanque;
    @Basic
    @Column(name = "NOM_BANQUE")
    private String nomBanque;
    @Basic
    @Column(name = "CODE_DOUANE")
    private String codeDouane;
    @Basic
    @Column(name = "NOM_REPORT_SERVER")
    private String nomReportServer;
    @Basic
    @Column(name = "ADRESSE_HTTP_REPORT_SERVER")
    private String adresseHttpReportServer;
    @Basic
    @Column(name = "PATH_IMAGE")
    private String pathImage;
    @Basic
    @Column(name = "ADRESSE_IP_SERVEUR_SAUVEGARDE")
    private String adresseIpServeurSauvegarde;
    @Basic
    @Column(name = "ADRESSE_IP_SERVEUR_TTN")
    private String adresseIpServeurTtn;
    @Basic
    @Column(name = "USER_SERVEUR_SAUVEGARDE")
    private String userServeurSauvegarde;
    @Basic
    @Column(name = "PASSWORD_SERVEUR_SAUVEGARDE")
    private String passwordServeurSauvegarde;
    @Basic
    @Column(name = "USER_SERVEUR_TTN")
    private String userServeurTtn;
    @Basic
    @Column(name = "PASSWORD_SERVEUR_TTN")
    private String passwordServeurTtn;
    @Basic
    @Column(name = "PATH_SCAN_AS")
    private String pathScanAs;
    @Basic
    @Column(name = "PATH_AFFICHE_AS")
    private String pathAfficheAs;
    @Basic
    @Column(name = "NUM_SWIFT")
    private String numSwift;
    @Basic
    @Column(name = "MNT_CAPITAL")
    private BigDecimal mntCapital;
    @Basic
    @Column(name = "EMAIL_ADMIN")
    private String emailAdmin;
    @Basic
    @Column(name = "PATH_REPORT")
    private String pathReport;
    @Basic
    @Column(name = "TYPE_EVT")
    private String typeEvt;
    @Basic
    @Column(name = "USER_DB")
    private String userDb;
    @Basic
    @Column(name = "ADRESSE_DB")
    private String adresseDb;
    @Basic
    @Column(name = "PATH_DB")
    private String pathDb;
    @Basic
    @Column(name = "FTP_LECT")
    private String ftpLect;
    @Basic
    @Column(name = "CONTROLE_PJ")
    private String controlePj;
    @Basic
    @Column(name = "LDAP_HOST")
    private String ldapHost;
    @Basic
    @Column(name = "LDAP_PORT")
    private Short ldapPort;
    @Basic
    @Column(name = "LDAP_DOMAINE")
    private String ldapDomaine;
    @Basic
    @Column(name = "DOMAIN_NAME")
    private String domainName;
    @Basic
    @Column(name = "USER_HOME")
    private String userHome;


}
