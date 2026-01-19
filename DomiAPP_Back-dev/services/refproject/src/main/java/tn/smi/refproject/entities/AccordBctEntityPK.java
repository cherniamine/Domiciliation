package tn.smi.refproject.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import tn.smi.refproject.entities.enumeration.TypeAccordBct;

import java.io.Serializable;
import java.sql.Date;
import java.time.LocalDate;
import java.util.Objects;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Embeddable
public class AccordBctEntityPK implements Serializable {

    @Column(name = "TYPE_ACCORD_BCT")
    @Enumerated(EnumType.STRING)
    private TypeAccordBct typeAccordBct;

    @Column(name = "NUM_ACCORD_BCT")
    private Long numAccordBct;

    @Column(name = "DATE_ACCORD_BCT")
    private LocalDate dateAccordBct;

    // Getter and Setter for typeAccordBct
    public TypeAccordBct getTypeAccordBct() {
        return typeAccordBct;
    }

    public void setTypeAccordBct(TypeAccordBct typeAccordBct) {
        this.typeAccordBct = typeAccordBct;
    }

    // Getter and Setter for numAccordBct
    public Long getNumAccordBct() {
        return numAccordBct;
    }

    public void setNumAccordBct(Long numAccordBct) {
        this.numAccordBct = numAccordBct;
    }

    // Getter and Setter for dateAccordBct
    public LocalDate getDateAccordBct() {
        return dateAccordBct;
    }

    public void setDateAccordBct(LocalDate dateAccordBct) {
        this.dateAccordBct = dateAccordBct;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof AccordBctEntityPK)) return false;
        AccordBctEntityPK that = (AccordBctEntityPK) o;
        return typeAccordBct == that.typeAccordBct &&
                Objects.equals(numAccordBct, that.numAccordBct) &&
                Objects.equals(dateAccordBct, that.dateAccordBct);
    }

    @Override
    public int hashCode() {
        return Objects.hash(typeAccordBct, numAccordBct, dateAccordBct);
    }

}
