//package com.chapter.v2.chapter1;
//
//import javax.servlet.ServletException;
//import javax.servlet.http.HttpServlet;
//import javax.servlet.http.HttpServletRequest;
//import javax.servlet.http.HttpServletResponse;
//
///**
// * @author chenqiang
// * @create 2020-04-17 11:33
// */
//public class BaseServlet extends HttpServlet {
//
//    public final void service(HttpServletRequest request, HttpServletResponse response) throws IOExcetion, ServletException {
//        // 记录访问日志
//        // 进行权限判断
//        if (具有权限) {
//            try {
//                doService(request, response);
//            } catch (Excetpion e) {
//                记录异常信息
//            }
//        }
//    }
//
//    protected abstract void doService(HttpServletRequest request, HttpServletResponse response) throws IOExcetion, ServletException;
//    //注意访问权限定义成protected，显得既专业，又严谨，因为它是专门给子类用的
//}
//
