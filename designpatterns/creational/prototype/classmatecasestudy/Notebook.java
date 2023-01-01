package com.designpatterns.creational.prototype.classmatecasestudy;

public class Notebook implements Prototype<Notebook>{

    private int numPages;
    private String typeOfPage;
    private int price;
    private FactPage factPage;
    private CoverPage coverPage;
    private double weight;

    public Notebook() {}

    public Notebook(Notebook nb) {
        this.numPages = nb.numPages;
        this.typeOfPage = nb.typeOfPage;
        this.price = nb.price;
        this.factPage = nb.factPage;
        this.coverPage = nb.coverPage;
        this.weight = nb.weight;
    }

    public int getNumPages() {
        return numPages;
    }

    public void setNumPages(int numPages) {
        this.numPages = numPages;
    }

    public String getTypeOfPage() {
        return typeOfPage;
    }

    public void setTypeOfPage(String typeOfPage) {
        this.typeOfPage = typeOfPage;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public FactPage getFactPage() {
        return factPage;
    }

    public void setFactPage(FactPage factPage) {
        this.factPage = factPage;
    }

    public CoverPage getCoverPage(CoverPage coverPage) {
        return this.coverPage;
    }

    public void setCoverPage(CoverPage coverPage) {
        this.coverPage = coverPage;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }


    @Override
    public Notebook clone() {
        return new Notebook(this);
    }

    @Override
    public String toString() {
        return "Notebook{" +
                "numPages=" + numPages +
                ", typeOfPage='" + typeOfPage + '\'' +
                ", price=" + price +
                ", factPage=" + factPage +
                ", coverPage=" + coverPage +
                ", weight=" + weight +
                '}';
    }
}
