package adapterpattern;

import tools.PrintTool;

import java.util.UUID;

/**
 * @Author Nie Yixin
 * @Description: 普通用户
 * @Date: Created in 13:52 2020/11/13
 * @Modified By:
 **/
public class RegularMember {
    public UUID id;
    public String name;
    public RegularMember(){

    }

    public RegularMember(RegularMember target) {
        this.id = target.id;
        this.name = target.name;
    }
    /***
     * @Author: Nie Yixin
     * @Description: setId
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
    /***
     * @Author: Nie Yixin
     * @Description: setName
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
     * @Description: getName
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
     * @Description: getId
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
     * @Description: 普通用户的排队
     *
     * @Param Type
     *
     *
     * @Return Value
     * @return: void
     * @resume:
     *
     * @Date:
     * @Modified By:
    **/
    public void queue() {
        PrintTool.print("queueing...");
    }
}
