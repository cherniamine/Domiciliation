package tn.smi.domiciliation.UploadFile;

import org.springframework.data.jpa.repository.JpaRepository;

public interface FileRepository extends JpaRepository<FileEntity,Long> {
    FileEntity findByFileName(String fileName);

}
