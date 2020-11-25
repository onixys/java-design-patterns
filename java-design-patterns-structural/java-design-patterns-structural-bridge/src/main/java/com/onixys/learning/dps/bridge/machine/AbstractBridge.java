package com.onixys.learning.dps.bridge.machine;

import com.onixys.learning.dps.bridge.device.Product;

/**
 * Abstract Bridge
 *
 * @author Hamid Kianzad
 * @version {version}
 * @since 1.0.0
 */
public abstract class AbstractBridge {
    protected Product product;

    public AbstractBridge(Product product) {
        this.product = product;
    }

    public abstract void create();
}
