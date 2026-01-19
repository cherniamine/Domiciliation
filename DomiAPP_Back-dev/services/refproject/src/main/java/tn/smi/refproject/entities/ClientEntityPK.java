package tn.smi.refproject.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import java.io.Serializable;
import java.util.Objects;

@Embeddable
public class ClientEntityPK implements Serializable {
    @Column(name = "NO_PIECE_CLIENT")
    private String noPieceClient;

    @Column(name = "TYPE_PIECE_CLIENT")
    private int typePieceClient;

    // Default constructor
    public ClientEntityPK() {}

    // Constructor with parameters
    public ClientEntityPK(String noPieceClient, int typePieceClient) {
        this.noPieceClient = noPieceClient;
        this.typePieceClient = typePieceClient;
    }

    // Getters and Setters
    public String getNoPieceClient() {
        return noPieceClient;
    }

    public void setNoPieceClient(String noPieceClient) {
        this.noPieceClient = noPieceClient;
    }

    public int getTypePieceClient() {
        return typePieceClient;
    }

    public void setTypePieceClient(int typePieceClient) {
        this.typePieceClient = typePieceClient;
    }

    // Override equals() and hashCode() methods
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof ClientEntityPK)) return false;
        ClientEntityPK that = (ClientEntityPK) o;
        return typePieceClient == that.typePieceClient &&
                Objects.equals(noPieceClient, that.noPieceClient);
    }

    @Override
    public int hashCode() {
        return Objects.hash(noPieceClient, typePieceClient);
    }
}
