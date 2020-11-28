package transferobjectpattern;

import java.util.UUID;

/**
 * @Author Nie Yixin
 * @Description: Transfer object，实体类
 * @Date: Created in 14:49 2020/11/13
 * @Modified By:
 **/
public class ClientVO {
    public UUID id;
    public String name;
    public ClientVO(UUID id, String name) {
        this.id = id;
        this.name = name;
    }
    /***
     * @Author: Nie Yixin
     * @Description: get id
     *
     * @Param Type
     *
     *
     * @Return Value
     * @return: UUID
     * @resume:
     *
     * @Date:
     * @Modified By:
    **/
    public UUID getId() {
        return id;
    }
    /***
     * @Author: Nie Yixin
     * @Description: get name
     *
     * @Param Type
     *
     *
     * @Return Value
     * @return: String
     * @resume:
     *
     * @Date:
     * @Modified By:
    **/
    public String getName() {
        return name;
    }
    /***
     * @Author: Nie Yixin
     * @Description: set name
     *
     * @Param Type
     * String
     *
     * @Return Value
     * @return: void
     * @resume:
     *
     * @Date:
     * @Modified By:
    **/
    public void setName(String name) {
        this.name = name;
    }
    /***
     * @Author: Nie Yixin
     * @Description: set id
     *
     * @Param Type
     * UUID
     *
     * @Return Value
     * @return: void
     * @resume:
     *
     * @Date:
     * @Modified By:
    **/
    public void setId(UUID id) {
        this.id = id;
    }
}
