/**
 * This file is part of the Alfred package.
 *
 * (c) Mickael Gaillard <mick.gaillard@gmail.com>
 *
 * For the full copyright and license information, please view the LICENSE
 * file that was distributed with this source code.
 */
package org.rosmultimedia.player.media.model;

import java.util.List;

/**
 *
 * @author Erwan Le Huitouze <erwan.lehuitouze@gmail.com>
 *
 */
public class Album extends Audio {
    private List<String> theme;
    private String description;
    private String type;
    private List<String> style;
    private int albumid;
    private int playcount;
    private String albumlabel;
    private List<String> mood;

    /** @return A new {@link Album} from the json stream. */
    public static Album fromJson(String json) {
        return fromJson(json, Album.class);
    }

    public List<String> getTheme() {
        return theme;
    }
    public void setTheme(List<String> theme) {
        this.theme = theme;
    }
    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }
    public String getType() {
        return type;
    }
    public void setType(String type) {
        this.type = type;
    }
    public List<String> getStyle() {
        return style;
    }
    public void setStyle(List<String> style) {
        this.style = style;
    }
    public int getAlbumid() {
        return albumid;
    }
    public void setAlbumid(int albumid) {
        this.albumid = albumid;
    }
    public int getPlaycount() {
        return playcount;
    }
    public void setPlaycount(int playcount) {
        this.playcount = playcount;
    }
    public String getAlbumlabel() {
        return albumlabel;
    }
    public void setAlbumlabel(String albumlabel) {
        this.albumlabel = albumlabel;
    }
    public List<String> getMood() {
        return mood;
    }
    public void setMood(List<String> mood) {
        this.mood = mood;
    }
}
