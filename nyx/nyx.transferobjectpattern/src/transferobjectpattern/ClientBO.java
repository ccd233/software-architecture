package transferobjectpattern;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

/**
 * @Author Nie Yixin
 * @Description: Business object业务层，来对数据库进行增删改查
 * @Date: Created in 14:51 2020/11/13
 * @Modified By:
 **/
public class ClientBO {
    public List<ClientVO> clients;
    public ClientBO() {
        clients = new ArrayList<>();
    }
    /***
     * @Author: Nie Yixin
     * @Description: 向数据库中添加一条数据
     *
     * @Param Type
     * UUID,String
     *
     * @Return Value
     * @return: boolean
     * @resume:
     *
     * @Date:
     * @Modified By:
    **/
    public boolean addClient(UUID id, String name) {
        if (getClientById(id) == null) {
            ClientVO client = new ClientVO(id, name);
            clients.add(client);
            return true;
        }
        return false;
    }
    /***
     * @Author: Nie Yixin
     * @Description: 通过id删除数据
     *
     * @Param Type
     * UUID
     *
     * @Return Value
     * @return: ClientVO object
     * @resume:
     *
     * @Date:
     * @Modified By:
    **/
    public ClientVO deleteClientById(UUID id){
        for (ClientVO client:clients){
            if (client.id.equals(id)){
                clients.remove(client);
                return client;
            }
        }
        return null;
    }
    /***
     * @Author: Nie Yixin
     * @Description: 得到数据库中所有数据
     *
     * @Param Type
     *
     *
     * @Return Value
     * @return: List<ClientVO>
     * @resume:
     *
     * @Date:
     * @Modified By:
    **/
    public List<ClientVO> getAllClients(){
        return clients;
    }
    /***
     * @Author: Nie Yixin
     * @Description: 通过id得到一条数据
     *
     * @Param Type
     * UUID
     *
     * @Return Value
     * @return: ClientVO object
     * @resume:
     *
     * @Date:
     * @Modified By:
    **/
    public ClientVO getClientById(UUID id){
        for (ClientVO client:clients){
            if (client.id.equals(id)){
                return client;
            }
        }
        return null;
    }
    /***
     * @Author: Nie Yixin
     * @Description: 更新数据
     *
     * @Param Type
     * UUID,String
     *
     * @Return Value
     * @return: ClientVO object
     * @resume:
     *
     * @Date:
     * @Modified By:
    **/
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
