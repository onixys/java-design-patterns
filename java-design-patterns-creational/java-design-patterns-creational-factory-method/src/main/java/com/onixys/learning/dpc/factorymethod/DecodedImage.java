package com.onixys.learning.dpc.factorymethod;

/**
 * Decoded Image
 *
 * @author Hamid Kianzad
 * @version {version}
 * @since 1.0.0
 */
public class DecodedImage {
    private String image;

    public DecodedImage(String image) {
        this.image = image;
    }

    @Override
    public String toString() {
        return image + ": is decoded";
    }
}
