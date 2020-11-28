package interceptingfilterpattern;

public interface Filter {
    /**
     * filter接口的work方法，用于不同filter的log生成
     * @param request 
     * @return void
     * @author Chi Chengdao
     * @date 2020/11/27 11:46 下午
     */
    
    public void work(String request);
}