package com.onixys.learning.dpc.abstractfactory;

/**
 * Enginola Toolkit
 *
 * @author Hamid Kianzad
 * @version {version}
 * @since 1.0.0
 */
public class EnginolaToolkit extends AbstractFactory {
    @Override
    public CPU createCPU() {
        return new EnginolaCPU();
    }

    @Override
    public MMU createMMU() {
        return new EnginolaMMU();
    }
}
