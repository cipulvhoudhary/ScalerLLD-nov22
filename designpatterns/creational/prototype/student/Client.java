package com.designpatterns.creational.prototype.student;

public class Client {

    public static void fillRegistry(StudentRegistry studentRegistry) {
        Student aprBatchStudent = new Student();
        aprBatchStudent.setBatch("April 21");
        aprBatchStudent.setAverageBatchPsp(89.0);

        studentRegistry.register("april21Batch", aprBatchStudent);

        IntelligentStudent aprilBatchIntelligentStudent = new IntelligentStudent();
        aprilBatchIntelligentStudent.iq = 180;
        aprilBatchIntelligentStudent.setBatch("April 21");
        aprilBatchIntelligentStudent.setAverageBatchPsp(89.0);

        studentRegistry.register("aprBatchIntelligentStudent", aprilBatchIntelligentStudent);
    }

    public static void main(String[] args) {
        StudentRegistry studentRegistry = new StudentRegistry();
        fillRegistry(studentRegistry);

        Student vipul = studentRegistry.get("april21Batch").clone();
        vipul.setName("Vipul");
        vipul.setAge(24);
        vipul.setStudentPsp(91.0);

        Student intelligentVipul = studentRegistry.get("aprBatchIntelligentStudent").clone();
        intelligentVipul.setName("Vipul");
        intelligentVipul.setAge(24);
        intelligentVipul.setStudentPsp(91.0);

        System.out.println(vipul.toString());
        System.out.println(intelligentVipul.toString());
    }

}
