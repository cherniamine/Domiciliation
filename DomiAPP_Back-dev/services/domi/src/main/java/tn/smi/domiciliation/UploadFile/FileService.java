package tn.smi.domiciliation.UploadFile;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@AllArgsConstructor
public class FileService {
    private FileRepository fileRepository;
    public FileEntity getFileById(Long id) {
        Optional<FileEntity> fileEntity = fileRepository.findById(id);
        return fileEntity.orElse(null);
    }

    public FileEntity getFileByName(String fileName) {
        return fileRepository.findByFileName(fileName);
    }

}
