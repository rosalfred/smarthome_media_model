/**
 * This file is part of the Alfred package.
 *
 * (c) Mickael Gaillard <mick.gaillard@gmail.com>
 *
 * For the full copyright and license information, please view the LICENSE
 * file that was distributed with this source code.
 */
package org.rosmultimedia.player.media.model;

/**
 *
 * @author Erwan Le Huitouze <erwan.lehuitouze@gmail.com>
 *
 */
public class Song extends Audio {
    private int songid;
    private int albumid;
    private int artistid;
    //private int[] genreid;
    //private int[] albumartistid;
    //private String albumartist;
    private String musicbrainztrackid;
    private String musicbrainzartistid;




    private String lyrics;
    private String comment;
    private int duration;

    private int disc;
    private int track;

    /** @return A new {@link Song} from the json stream. */
    public static Song fromJson(String json) {
        return fromJson(json, Song.class);
    }

    public int getSongid() {
        return songid;
    }
    public void setSongid(int songid) {
        this.songid = songid;
    }
    public int getAlbumid() {
        return albumid;
    }
    public void setAlbumid(int albumid) {
        this.albumid = albumid;
    }
    public int getArtistid() {
        return artistid;
    }
    public void setArtistid(int artistid) {
        this.artistid = artistid;
    }
    public String getMusicbrainztrackid() {
        return musicbrainztrackid;
    }
    public void setMusicbrainztrackid(String musicbrainztrackid) {
        this.musicbrainztrackid = musicbrainztrackid;
    }

    public String getMusicbrainzartistid() {
        return musicbrainzartistid;
    }
    public void setMusicbrainzartistid(String musicbrainzartistid) {
        this.musicbrainzartistid = musicbrainzartistid;
    }




    public String getLyrics() {
        return lyrics;
    }
    public void setLyrics(String lyrics) {
        this.lyrics = lyrics;
    }
    public String getComment() {
        return comment;
    }
    public void setComment(String comment) {
        this.comment = comment;
    }
    public int getDuration() {
        return duration;
    }
    public void setDuration(int duration) {
        this.duration = duration;
    }

    public int getDisc() {
        return disc;
    }
    public void setDisc(int disc) {
        this.disc = disc;
    }
    public int getTrack() {
        return track;
    }
    public void setTrack(int track) {
        this.track = track;
    }
}
