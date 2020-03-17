package com.iseven.thinkjava.chapter02;

///**类注释文档*/
/**
 * javadoc文档测试
 * @author iseven
 * @author cmyang
 * @version 1.0
 */
public class DocTest {
	/**字段注释文档*/
    public int a = 1;
    /**方法注释文档*/
    public void test() {}
    
    /**
     * 测试main方法
     * @param args string参数数组
     * @throws RuntimeException 运行时异常
     */
    public static void main(String[] args) {
    	System.out.println("Hello World");
    	throw new RuntimeException();
    }
    
    /**
     * <pre>
     * System.out.println(new Date());
     * </pre>
     * You can <em>even</em> insert a list
     * <ol>
     * <li> Item one
     * <li> Item two
     * <li> Item three
     * </ol>
     */
    public void testHtmlDoc() {}
}
