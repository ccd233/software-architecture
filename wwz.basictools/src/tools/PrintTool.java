package tools;

/**
 * @Author Wang Wenzheng
 * @Description: a tool class helps to add info before logs
 * @Date: Created in 20:12 2020/11/4
 * @Modified By:
 **/
public class PrintTool {
    /**
     * @Author: Wang Wenzheng
     * @Description: auto add basic info before logs
     * @Param Type
     * param: logs
     * resume: logs hope to print
     * @Return Value
     * @return: void
     * @resume: nothing
     * @Date: 20:21 2020/11/4
     * @Modified By:
     **/
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
