//package test;
//import test.CamelCaseTest;
//
//import org.junit.runner.JUnitCore;
//import org.junit.runner.Request;
//import org.junit.runner.Result;
//
//public class TestsRunner {
//
//    public static void main(String[] args) {
//        JUnitCore jUnitCore = new JUnitCore();
//        Request request = Request.aClass(CamelCaseTest.class);
//        Result result = jUnitCore.run(request);
//        System.out.printf("Test ran: %s, Failed: %s%n",
//                result.getRunCount(), result.getFailureCount());
//    }
//}