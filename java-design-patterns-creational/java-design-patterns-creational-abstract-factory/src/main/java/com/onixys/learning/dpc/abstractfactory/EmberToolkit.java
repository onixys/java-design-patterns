package com.onixys.learning.dpc.abstractfactory;

/**
 * Ember Toolkit
 *
 * @author Hamid Kianzad
 * @version {version}
 * @since 1.0.0
 */
public class EmberToolkit extends AbstractFactory {
    @Override
    public CPU createCPU() {
        return new EmberCPU();
    }

    @Override
    public MMU createMMU() {
        return new EmberMMU();
    }
}
