package com.onixys.learning.dpc.factorymethod;

/**
 * Jpeg Reader
 *
 * @author Hamid Kianzad
 * @version {version}
 * @since 1.0.0
 */
public class JpegReader implements ImageReader {
    private DecodedImage decodedImage;

    public JpegReader(String image) {
        decodedImage = new DecodedImage(image);
    }

    @Override
    public DecodedImage getDecodeImage() {
        return decodedImage;
    }
}
