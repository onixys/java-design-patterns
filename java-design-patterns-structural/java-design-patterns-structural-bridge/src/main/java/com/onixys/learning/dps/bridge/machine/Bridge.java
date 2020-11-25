package com.onixys.learning.dps.bridge.machine;

import com.onixys.learning.dps.bridge.device.Product;

/**
 * Bridge
 *
 * @author Hamid Kianzad
 * @version {version}
 * @since 1.0.0
 */
public class Bridge extends AbstractBridge {

    public Bridge(Product product) {
        super(product);
    }

    @Override
    public void create() {
        product.create();
    }
}
