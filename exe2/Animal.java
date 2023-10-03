/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lista5.exe2;

/**
 *
 * @author 1090482211011
 */
public class Animal {
    protected String comer, respirar;

    public Animal() {
    }

    public Animal(String comer, String respirar) {
        this.setComer(comer);
        this.setRespirar(respirar);
    }

    public String getComer() {
        return comer;
    }

    public final void setComer(String comer) {
        this.comer = comer;
    }

    public String getRespirar() {
        return respirar;
    }

    public final void setRespirar(String respirar) {
        this.respirar = respirar;
    }

    @Override
    public String toString() {
        return "Animal{" + "comer=" + comer + ", respirar=" + respirar + '}';
    }
    
    
}
