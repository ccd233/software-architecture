package transferobjectpattern;

import tools.PrintTool;

import java.util.Scanner;
import java.util.UUID;

/**
 * @Author Nie Yixin
 * @Description: By using option to add,delete,query and delete
 * @Date: Created in 14:43 2020/11/17
 * @Modified By:
 **/
public class Demo {
    public void transferObjectPattern() {
        ClientBO client = new ClientBO();
        while (true) {
            PrintTool.print("choose your option:1-add,2-query,3-delete,4-update,-1-exit");
            Scanner choiceInput = new Scanner(System.in);
            int choice = choiceInput.nextInt();
            if(choice==1){
                PrintTool.print("please enter the name:");
                Scanner nameInput = new Scanner(System.in);
                String name = nameInput.next();
                UUID id = UUID.randomUUID();
                if (client.addClient(id,name) == true){
                    PrintTool.print("added successfully");
                }
                else {
                    PrintTool.print("Error!");
                }
                for(ClientVO i : client.getAllClients()){
                    PrintTool.print("The all clients:");
                    PrintTool.print("id:"+i.getId());
                    PrintTool.print("name:"+i.getName());
                }
            }
            else if(choice==2){
                PrintTool.print("please enter the id:");
                Scanner idInput = new Scanner(System.in);
                String _id = idInput.next();
                UUID id;
                try {
                    id = UUID.fromString(_id);
                }catch (IllegalArgumentException e) {
                    PrintTool.print("请copy add后给出的ID");
                    continue;
                }
                ClientVO queryClient = client.getClientById(id);
                if (queryClient != null) {
                    PrintTool.print("searched successfully");
                    PrintTool.print("the name is: " + queryClient.getName());
                    PrintTool.print("the id is: " + _id);
                }
                else {
                    PrintTool.print("Error!");
                }
                for(ClientVO i : client.getAllClients()){
                    PrintTool.print("The all clients:");
                    PrintTool.print("id:"+i.getId());
                    PrintTool.print("name:"+i.getName());
                }
            }
            else if(choice==3){
                PrintTool.print("please enter the id:");
                Scanner idInput = new Scanner(System.in);
                String _id = idInput.next();
                UUID id;
                try {
                    id = UUID.fromString(_id);
                }catch (IllegalArgumentException e) {
                    PrintTool.print("请copy add后给出的ID");
                    continue;
                }
                ClientVO deleteClient = client.deleteClientById(id);
                if (deleteClient != null){
                    PrintTool.print("deleted successfully");
                    PrintTool.print("the client's name you deleted is "+deleteClient.getName());
                }
                else {
                    PrintTool.print("Error!");
                }
                for(ClientVO i : client.getAllClients()){
                    PrintTool.print("The all clients:");
                    PrintTool.print("id:"+i.getId());
                    PrintTool.print("name:"+i.getName());
                }
            }
            else if(choice==4){
                PrintTool.print("please enter the id:");
                Scanner idInput = new Scanner(System.in);
                String _id = idInput.next();
                UUID id;
                try {
                    id = UUID.fromString(_id);
                }catch (IllegalArgumentException e) {
                    PrintTool.print("请copy add后给出的ID");
                    continue;
                }
                PrintTool.print("please enter the new name:");
                Scanner nameInput = new Scanner(System.in);
                String name = nameInput.next();
                ClientVO updateClient = client.updateClientById(id,name);
                if (updateClient != null){
                    PrintTool.print("updated successfully");
                }
                else{
                    PrintTool.print("Error!");
                }
                for(ClientVO i : client.getAllClients()){
                    PrintTool.print("The all clients:");
                    PrintTool.print("id:"+i.getId());
                    PrintTool.print("name:"+i.getName());
                }
            }
            else if(choice==-1){
                for(ClientVO i : client.getAllClients()){
                    PrintTool.print("The all clients:");
                    PrintTool.print("id:"+i.getId());
                    PrintTool.print("name:"+i.getName());
                }
                break;
            }
        }
    }
}
