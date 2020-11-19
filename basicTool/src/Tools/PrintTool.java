package Tools;

/**
 * @Author Guan Jinghui
 * @Description:
 * @Date: Created in 7:27 下午 2020/11/17
 * @Modified By:
 **/
public class PrintTool {
    /**
     *
     * @param logs
     */
    public static void print(String logs) {
        StackTraceElement[] stack = (new Throwable()).getStackTrace();
        String output = "Module Name: "
                + stack[1].getModuleName()
                + "; Class Name: "
                + stack[1].getClassName()
                + "; Method Name: "
                + stack[1].getMethodName()
                + "; Line: "
                + stack[1].getLineNumber()
                + ";\nDescription: "
                + logs
                + "\n";
        System.out.println(output);
    }
}
