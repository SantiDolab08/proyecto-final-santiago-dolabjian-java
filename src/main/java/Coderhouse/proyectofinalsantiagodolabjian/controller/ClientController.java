package Coderhouse.proyectofinalsantiagodolabjian.controller;



import Coderhouse.proyectofinalsantiagodolabjian.middleware.ResponseHandler;
import Coderhouse.proyectofinalsantiagodolabjian.model.Client;
import Coderhouse.proyectofinalsantiagodolabjian.servise.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path = "api/v1/client")
public class ClientController {
    @Autowired
    private ClientService clientService;

    //CRUD cliente

    //Create
    @PostMapping
    public ResponseEntity<Object> postClient (@RequestBody Client client) {
        try {
            System.out.println(client);
            Client clientSaved = clientService.postClient(client);
            return ResponseHandler.generateResponse(
                    "Data retrieved successfully",
                    HttpStatus.OK,
                    clientSaved
            );
        } catch (Exception e) {
            return ResponseHandler.generateResponse(
                    e.getMessage(),
                    HttpStatus.INTERNAL_SERVER_ERROR,
                    null
            );
        }
    }

    @GetMapping(path = "{client_id}")
    public ResponseEntity<Object> getClient (@PathVariable() int client_id) {
        try {
            System.out.println(client_id);
            Client clientFound = clientService.getClient(client_id);
            return ResponseHandler.generateResponse(
                    "Client get successfully",
                    HttpStatus.OK,
                    clientFound
            );
        } catch (Exception e) {
            return ResponseHandler.generateResponse(
                    e.getMessage(),
                    HttpStatus.INTERNAL_SERVER_ERROR,
                    null
            );
        }
    }


}
