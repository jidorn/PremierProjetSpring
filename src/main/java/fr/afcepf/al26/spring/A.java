package fr.afcepf.al26.spring;

/**
 * Created by Stagiaire on 12/01/2016.
 */
public class A {
    private B b;

    //injection par Spring
    public void setDependenceDeB(B b) {
        this.b = b;
    }

    public String test(){
        return b.toto();
    }
}
