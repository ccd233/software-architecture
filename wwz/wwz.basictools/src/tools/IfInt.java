package tools;

/**
 * @Author Guan Jinghui
 * @Description:
 * @Date: Created in 4:17 下午 2020/11/20
 * @Modified By:
 **/
public class IfInt {
    public static boolean isNumeric(String str){
        for (int i = str.length();--i>=0;){
            if (!Character.isDigit(str.charAt(i))){
                return false;
            }
        }
        return true;
    }
}