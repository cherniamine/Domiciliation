    package tn.smi.refproject.repository;

    import org.springframework.data.jpa.repository.JpaRepository;
    import org.springframework.data.jpa.repository.Query;
    import org.springframework.data.repository.query.Param;
    import tn.smi.refproject.entities.AccordBctEntity;
    import tn.smi.refproject.entities.AccordBctEntityPK;
    import tn.smi.refproject.entities.enumeration.TypeAccordBct;

    import java.time.LocalDate;
    import java.util.List;

    public interface AccordBctRepository extends JpaRepository<AccordBctEntity, AccordBctEntityPK> {

        @Query("SELECT a.accordBctEntityPK.numAccordBct FROM AccordBctEntity a WHERE a.accordBctEntityPK.typeAccordBct = :typeAccordBct")
        List<Long> findNumAccordBctByTypeAccordBct(@Param("typeAccordBct") TypeAccordBct typeAccordBct);

        @Query("SELECT a.accordBctEntityPK.dateAccordBct FROM AccordBctEntity a WHERE a.accordBctEntityPK.typeAccordBct = :typeAccordBct")
        List<LocalDate> findDateAccordBctByTypeAccordBct(@Param("typeAccordBct") TypeAccordBct typeAccordBct);

        @Query("SELECT COALESCE(MAX(a.accordBctEntityPK.numAccordBct), 0) + 1 FROM AccordBctEntity a")
        Integer getNextRefOperation();

        List<AccordBctEntity> findByNoPieceClient(String noPieceClient);
    }
