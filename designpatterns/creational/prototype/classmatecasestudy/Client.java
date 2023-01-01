package com.designpatterns.creational.prototype.classmatecasestudy;

public class Client {

    public static void registerNotebook(NotebookRegistry notebookRegistry) {

        Notebook notebook1 = new Notebook();
        notebook1.setNumPages(180);
        notebook1.setPrice(50);
        notebookRegistry.register("A4/180/50", notebook1);

        Notebook notebook2 = new Notebook();
        notebook2.setNumPages(300);
        notebook2.setPrice(80);
        notebookRegistry.register("A4/300/80", notebook2);

    }

    public static void main(String[] args) {
        NotebookRegistry notebookRegistry = new NotebookRegistry();
        registerNotebook(notebookRegistry);

        Notebook nb1 = notebookRegistry.getNotebook("A4/180/50");
        nb1.setWeight(135.5);
        nb1.setTypeOfPage("A4");

        Notebook nb2 = notebookRegistry.getNotebook("A4/300/80");
        nb2.setTypeOfPage("A4");
        nb2.setWeight(190.6);

        System.out.println(nb1.toString());
        System.out.println(nb2.toString());
    }
}
