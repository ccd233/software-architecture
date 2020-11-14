package com.java.nyx.transferobjectpattern;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

/**
 * @Author Nie Yixin
 * @Description: Business object
 * @Date: Created in 14:51 2020/11/13
 * @Modified By:
 **/
public class ClientBO {
    public List<ClientVO> clients;
    public ClientBO() {
        clients = new ArrayList<>();
    }

    public boolean addClient(UUID id, String name) {
        if (getClientById(id) == null) {
            ClientVO client = new ClientVO(id, name);
            clients.add(client);
            return true;
        }
        return false;
    }

    public ClientVO deleteClientById(UUID id){
        for (ClientVO client:clients){
            if (client.id.equals(id)){
                clients.remove(client);
                return client;
            }
        }
        return null;
    }

    public List<ClientVO> getAllClients(){
        return clients;
    }

    public ClientVO getClientById(UUID id){
        for (ClientVO client:clients){
            if (client.id.equals(id)){
                return client;
            }
        }
        return null;
    }

    public ClientVO updateClientById(UUID id,String name) {
        for (ClientVO client:clients){
            if (client.id.equals(id)){
                client.setName(name);
                return client;
            }
        }
        return null;
    }
}
