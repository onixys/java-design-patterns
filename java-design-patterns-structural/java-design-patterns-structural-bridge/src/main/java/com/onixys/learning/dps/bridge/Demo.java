package com.onixys.learning.dps.bridge;

import com.onixys.learning.dps.bridge.device.ProductA;
import com.onixys.learning.dps.bridge.device.ProductB;
import com.onixys.learning.dps.bridge.machine.Bridge;
import com.onixys.learning.dps.bridge.machine.AbstractBridge;

/**
 * Demo
 *
 * @author Hamid Kianzad
 * @version {version}
 * @since 1.0.0
 */
public class Demo {
    public static void main(String[] args) {
        AbstractBridge productA = new Bridge(new ProductA());
        AbstractBridge productB = new Bridge(new ProductB());

        productA.create();
        productB.create();
    }
}
