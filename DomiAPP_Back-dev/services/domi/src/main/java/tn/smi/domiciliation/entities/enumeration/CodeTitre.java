package tn.smi.domiciliation.entities.enumeration;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

public enum CodeTitre {
    AUTORISATION_EXPORTATION("AUTORISATION_EXPORTATION(21)"),
    FACTURE_DEFINITIVE("FACTURE DEFINITIVE(22)"),
    AUTORISATION_IMPORTATION("AUTORISATION_IMPORTATION(31)"),
    ADMISSION_TEMPORAIRE("ADMISSION TEMPORAIRE(39)"),
    CERTIFICAT_D_IMPORTATION("CERTIFICAT D'IMPORTATION(33)");

    private final String value;

    CodeTitre(String value) {
        this.value = value;
    }

    @JsonValue
    public String getValue() {
        return value;
    }

    @JsonCreator
    public static CodeTitre fromValue(String value) {
        for (CodeTitre codeTitre : CodeTitre.values()) {
            if (codeTitre.value.equals(value)) {
                return codeTitre;
            }
        }
        throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
}
