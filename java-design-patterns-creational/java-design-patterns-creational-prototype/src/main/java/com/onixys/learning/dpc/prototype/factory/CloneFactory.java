package com.onixys.learning.dpc.prototype.factory;

import com.onixys.learning.dpc.prototype.product.Product;

/**
 * CloneFactory
 *
 * @author Hamid Kianzad
 * @version {version}
 * @since 1.0.0
 */
public class CloneFactory {

    public Product clone(Product product) {
        return product.clone();
    }
}
