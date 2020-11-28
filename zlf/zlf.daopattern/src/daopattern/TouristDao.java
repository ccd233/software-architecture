package daopattern;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author ZhouLifan
 * @Description:
 * @Date: Created in 20:25 2020/11/23
 * @Modified By:
 **/
public class TouristDao implements Dao<Tourist> {
    private List<Tourist> TouristList=new ArrayList<Tourist>();
    private static TouristDao Instance = null;
    TouristDao(){

    }

    /***
     * @Author: Zhou Lifan
     * @Description: 
     *
     * @Param Type
     * param: 
     * resume: 
     *
     * @Return Value
     * @return: java.util.List<DAO.Tourist>
     * @resume: 
     *
     * @Date:  2020/11/23
     * @Modified By: 
    **/
    
    @Override
    public List<Tourist> GetAllObject() {
        return TouristList;
    }

    /***
     * @Author: Zhou Lifan
     * @Description: 
     *
     * @Param Type
     * param: index
     * resume: 
     *
     * @Return Value
     * @return: DAO.Tourist
     * @resume: 
     *
     * @Date:  2020/11/23
     * @Modified By: 
    **/

    //Getter(by index)
    @Override
    public Tourist GetObject(int index) {
        return TouristList.get(index);
    }

    //Serach Tourist In List By Name
    public List<Integer> SearchByName(String Name){
        List<Integer> index_list=new ArrayList<Integer>();
        for(int i=0;i<TouristList.size();i++){
            if(TouristList.get(i).GetName().equals(Name)){
                index_list.add(i);
            }
        }
        return index_list;
    }

    /***
     * @Author: Zhou Lifan
     * @Description: 
     *
     * @Param Type
     * param: index
     * resume: 
     *
     * @Return Value
     * @return: void
     * @resume: 
     *
     * @Date:  2020/11/23
     * @Modified By: 
    **/

    //Delete A Tourist In List
    @Override
    public void DeleteObject(int index) {
        TouristList.remove(index);
    }

    /***
     * @Author: Zhou Lifan
     * @Description: 
     *
     * @Param Type
     * param: object
     * resume: 
     *
     * @Return Value
     * @return: void
     * @resume: 
     *
     * @Date:  2020/11/23
     * @Modified By: 
    **/

    //Add A Tourist
    @Override
    public void AddObject(Tourist object) {
        TouristList.add(object);
    }

    //Singleton GetInstance Method
    public static TouristDao GetInstance(){
        if(Instance==null){
            Instance=new TouristDao();
        }
        return Instance;
    }
}
