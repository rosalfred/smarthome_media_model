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
public class Audio extends Media {
    private String album;
    private List<String> artist;
    private List<String> genre;
    private String displayartist;
    private String musicbrainzalbumid;
    private String musicbrainzalbumartistid;
    private int year;

    /** @return A new {@link Audio} from the json stream. */
    public static Audio fromJson(String json) {
        return fromJson(json, Audio.class);
    }

    public String getAlbum() {
        return album;
    }
    public void setAlbum(String album) {
        this.album = album;
    }

    public List<String> getArtist() {
        return artist;
    }
    public void setArtist(List<String> artist) {
        this.artist = artist;
    }
    public List<String> getGenre() {
        return genre;
    }
    public void setGenre(List<String> genre) {
        this.genre = genre;
    }

    public String getDisplayartist() {
        return displayartist;
    }
    public void setDisplayartist(String displayartist) {
        this.displayartist = displayartist;
    }

    public String getMusicbrainzalbumid() {
        return musicbrainzalbumid;
    }
    public void setMusicbrainzalbumid(String musicbrainzalbumid) {
        this.musicbrainzalbumid = musicbrainzalbumid;
    }
    public String getMusicbrainzalbumartistid() {
        return musicbrainzalbumartistid;
    }
    public void setMusicbrainzalbumartistid(String musicbrainzalbumartistid) {
        this.musicbrainzalbumartistid = musicbrainzalbumartistid;
    }

    public int getYear() {
        return year;
    }
    public void setYear(int year) {
        this.year = year;
    }
}
