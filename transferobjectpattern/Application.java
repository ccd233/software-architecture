package com.java.nyx.transferobjectpattern;

import java.util.Scanner;
import java.util.UUID;

/**
 * @Author Nie Yixin
 * @Description: By using option to add,delete,query and delete
 * @Date: Created in 15:04 2020/11/13
 * @Modified By:
 **/
public class Application {
    public static void main(String[] args) {


        ClientBO client = new ClientBO();
        while (true) {
            System.out.println("choose your option:1-add,2-query,3-delete,4-update,-1-exit");
            Scanner choiceInput = new Scanner(System.in);
            int choice = choiceInput.nextInt();
            if(choice==1){
                System.out.println("please enter the name:");
                Scanner nameInput = new Scanner(System.in);
                String name = nameInput.next();
                UUID id = UUID.randomUUID();
                if (client.addClient(id,name) == true){
                    System.out.println("added successfully");
                }
                else {
                    System.out.println("Error!");
                }
                for(ClientVO i : client.getAllClients()){
                    System.out.println("The all clients:");
                    System.out.println("id:"+i.getId());
                    System.out.println("name:"+i.getName());
                }
            }
            else if(choice==2){
                System.out.println("please enter the id:");
                Scanner idInput = new Scanner(System.in);
                String _id = idInput.next();
                UUID id = UUID.fromString(_id);
                ClientVO queryClient = client.getClientById(id);
                if (queryClient != null) {
                    System.out.println("searched successfully");
                    System.out.println("the name is: " + queryClient.getName());
                    System.out.println("the id is: " + _id);
                }
                else {
                    System.out.println("Error!");
                }
                for(ClientVO i : client.getAllClients()){
                    System.out.println("The all clients:");
                    System.out.println("id:"+i.getId());
                    System.out.println("name:"+i.getName());
                }
            }
            else if(choice==3){
                System.out.println("please enter the id:");
                Scanner idInput = new Scanner(System.in);
                String _id = idInput.next();
                UUID id = UUID.fromString(_id);
                ClientVO deleteClient = client.deleteClientById(id);
                if (deleteClient != null){
                    System.out.println("deleted successfully");
                    System.out.println("the client's name you deleted is "+deleteClient.getName());
                }
                else {
                    System.out.println("Error!");
                }
                for(ClientVO i : client.getAllClients()){
                    System.out.println("The all clients:");
                    System.out.println("id:"+i.getId());
                    System.out.println("name:"+i.getName());
                }
            }
            else if(choice==4){
                System.out.println("please enter the id:");
                Scanner idInput = new Scanner(System.in);
                String _id = idInput.next();
                UUID id = UUID.fromString(_id);
                System.out.println("please enter the new name:");
                Scanner nameInput = new Scanner(System.in);
                String name = nameInput.next();
                ClientVO updateClient = client.updateClientById(id,name);
                if (updateClient != null){
                    System.out.println("updated successfully");
                }
               else{
                   System.out.println("Error!");
                }
                for(ClientVO i : client.getAllClients()){
                    System.out.println("The all clients:");
                    System.out.println("id:"+i.getId());
                    System.out.println("name:"+i.getName());
                }
            }
            else if(choice==-1){
                for(ClientVO i : client.getAllClients()){
                    System.out.println("The all clients:");
                    System.out.println("id:"+i.getId());
                    System.out.println("name:"+i.getName());
                }
                break;
            }
        }

    }
}
