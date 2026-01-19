package tn.smi.gen.entities;

import jakarta.persistence.*;

@Entity
@Table(name = "PARAM_TRADIS", schema = "GEN", catalog = "")
public class ParamTradisEntity {
    @Basic
    @Column(name = "USERNAME")
    private String username;
    @Basic
    @Column(name = "PASSWORD")
    private String password;
    @Basic
    @Column(name = "URLS")
    private String urls;
    @Basic
    @Column(name = "SERVICE_NAME")
    private String serviceName;
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "ID_PARAM_TRADIS")
    private byte idParamTradis;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUrls() {
        return urls;
    }

    public void setUrls(String urls) {
        this.urls = urls;
    }

    public String getServiceName() {
        return serviceName;
    }

    public void setServiceName(String serviceName) {
        this.serviceName = serviceName;
    }

    public byte getIdParamTradis() {
        return idParamTradis;
    }

    public void setIdParamTradis(byte idParamTradis) {
        this.idParamTradis = idParamTradis;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ParamTradisEntity that = (ParamTradisEntity) o;

        if (idParamTradis != that.idParamTradis) return false;
        if (username != null ? !username.equals(that.username) : that.username != null) return false;
        if (password != null ? !password.equals(that.password) : that.password != null) return false;
        if (urls != null ? !urls.equals(that.urls) : that.urls != null) return false;
        if (serviceName != null ? !serviceName.equals(that.serviceName) : that.serviceName != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = username != null ? username.hashCode() : 0;
        result = 31 * result + (password != null ? password.hashCode() : 0);
        result = 31 * result + (urls != null ? urls.hashCode() : 0);
        result = 31 * result + (serviceName != null ? serviceName.hashCode() : 0);
        result = 31 * result + (int) idParamTradis;
        return result;
    }
}
