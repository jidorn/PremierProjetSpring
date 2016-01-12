package fr.afcepf.al26.spring;

/**
 * Created by Stagiaire on 12/01/2016.
 */
public class B {
    private C c;

    //Injection par Spring
    public void setDependenceDeC(C c) {
        this.c = c;
    }

    public String toto(){
        return c.titi();
    }
}
