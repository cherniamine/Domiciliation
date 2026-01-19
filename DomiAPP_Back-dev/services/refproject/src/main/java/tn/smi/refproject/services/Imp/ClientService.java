package tn.smi.refproject.services.Imp;

import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.smi.refproject.DTO.ActivityResponse;
import tn.smi.refproject.entities.ActiviteClasseEntity;
import tn.smi.refproject.entities.ClientEntity;
import tn.smi.refproject.entities.ClientEntityPK;
import tn.smi.refproject.repository.ActiviteClasseRepository;
import tn.smi.refproject.repository.ClientRepository;
import tn.smi.refproject.services.Interface.IClientService;

import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
public class ClientService implements IClientService {

    private final ClientRepository clientRepository;
    private final ActiviteClasseRepository activiteClasseRepository;

    @Override
    public ClientEntity getClientById(ClientEntityPK id) {
        return clientRepository.findById(id).orElse(null);
    }

    @Override
    public List<ClientEntity> getClients() {
        return clientRepository.findAll();
    }

    @Override
    public boolean isTotalementExportatrice(String noPieceClient) {
        Optional<ClientEntity> clientOptional = clientRepository.findByClientEntityPK_NoPieceClient(noPieceClient);

        return clientOptional.map(client -> "O".equals(client.getTotalementExportatrice())).orElse(false);
    }

    public ActivityResponse getClientActivities(String noPieceClient) {
        ClientEntity client = clientRepository.findByClientEntityPK_NoPieceClient(noPieceClient).orElse(null);
        if (client == null) {
            return new ActivityResponse("Client not found", null);
        }

        // Retrieve primary activity
        Optional<ActiviteClasseEntity> primaryActivity = activiteClasseRepository.findByActiviteClasseEntityPK_CodeSectionAndActiviteClasseEntityPK_CodeDivisionAndActiviteClasseEntityPK_CodeGroupeAndActiviteClasseEntityPK_CodeClasse(
                client.getActiviteSection(),
                client.getActiviteDivision() != null ? client.getActiviteDivision().byteValue() : null,
                client.getActiviteGroupe() != null ? client.getActiviteGroupe().intValue() : null,
                client.getActiviteClasse() != null ? client.getActiviteClasse().intValue() : null
        );

        // Retrieve secondary activity
        Optional<ActiviteClasseEntity> secondaryActivity = activiteClasseRepository.findByActiviteClasseEntityPK_CodeSectionAndActiviteClasseEntityPK_CodeDivisionAndActiviteClasseEntityPK_CodeGroupeAndActiviteClasseEntityPK_CodeClasse(
                client.getActiviteSectionSec(),
                client.getActiviteDivisionSec() != null ? client.getActiviteDivisionSec().byteValue() : null,
                client.getActiviteGroupeSec() != null ? client.getActiviteGroupeSec().intValue() : null,
                client.getActiviteClasseSec() != null ? client.getActiviteClasseSec().intValue() : null
        );

        // Construct output
        String primaryActivityStr = primaryActivity
                .map(activity -> "Activité principale : " + client.getActiviteSection() + client.getActiviteDivision() + client.getActiviteGroupe() + client.getActiviteClasse() + " " + activity.getLibClasse())
                .orElse("Activité principale non trouvée");

        String secondaryActivityStr = secondaryActivity
                .map(activity -> "Activité secondaire : " + client.getActiviteSectionSec() + client.getActiviteDivisionSec() + client.getActiviteGroupeSec() + client.getActiviteClasseSec() + " " + activity.getLibClasse())
                .orElse("Activité secondaire non trouvée");

        return new ActivityResponse(primaryActivityStr, secondaryActivityStr);
    }


}
