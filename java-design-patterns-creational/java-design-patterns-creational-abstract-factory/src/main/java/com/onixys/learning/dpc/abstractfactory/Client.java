package com.onixys.learning.dpc.abstractfactory;

/**
 * Client
 *
 * @author Hamid Kianzad
 * @version {version}
 * @since 1.0.0
 */
public class Client {
    public static void main(String[] args) {
        AbstractFactory factory = AbstractFactory.getFactory(Architecture.EMBER);
        CPU cpu = factory.createCPU();
    }
}
