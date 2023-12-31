package Coderhouse.proyectofinalsantiagodolabjian.servise;


import Coderhouse.proyectofinalsantiagodolabjian.model.Client;
import Coderhouse.proyectofinalsantiagodolabjian.repository.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.swing.text.html.Option;
import java.util.Optional;

@Service
public class ClientService {
    @Autowired
    private ClientRepository clientRepository;

    public Client postClient(Client client) throws Exception {
        return clientRepository.save(client);
    }

    public Client getClient(int id) throws Exception {
        Optional<Client> cliente = clientRepository.findById(id);
        if(cliente.isEmpty()){
            throw new Exception("Client with id: " + id + ", not found");
        } else {
            return cliente.get();
        }
    }

    public boolean clientExist (int id) throws Exception {
        Optional<Client> cliente = clientRepository.findById(id);
        return cliente.isPresent();
    }
}
