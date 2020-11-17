package com.onixys.learning.dpc.factorymethod;

/**
 * Gif Reader
 *
 * @author Hamid Kianzad
 * @version {version}
 * @since 1.0.0
 */
public class GifReader implements ImageReader {
    private DecodedImage decodedImage;

    public GifReader(String image) {
        this.decodedImage = new DecodedImage(image);
    }

    @Override
    public DecodedImage getDecodeImage() {
        return decodedImage;
    }
}
