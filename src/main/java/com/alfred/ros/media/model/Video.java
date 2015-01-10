package com.alfred.ros.media.model;

public class Video extends Media {
    /** @return A new {@link Video} from the json stream. */
    public static Video fromJson(String json) {
        return fromJson(json, Video.class);
    }
}
