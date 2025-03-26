package org.example;

import org.example.facade.VideoConversionFacade;

import java.io.File;

/**
 * CLIENT CODE
 *
 */
public class Demo {
    public static void main(String[] args) {
        VideoConversionFacade converter = new VideoConversionFacade();
        File mp4Video = converter.convertVideo("youtubevideo.ogg", "mp4");
    }
}
