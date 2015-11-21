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

import com.google.gson.Gson;

/**
 *
 * @author Erwan Le Huitouze <erwan.lehuitouze@gmail.com>
 *
 */
public class Media {
    private int id;
    private int mediaid;
    private String label;
    private String fanart;
    private String thumbnail;
    //Media.Artwork art;
    private int playcount;
    private String title;
    //Video.Streams streamdetails;
    private List<String> director;
    //MediaResume resume;
    private int runtime;
    private String dateadded;
    private String file;
    private String lastplayed;
    private String plot;
    //Video.Cast cast;
    private List<String> cast;
    private double rating;
    private List<String> writer;
    private String originaltitle;
    private String votes;
    private int year;
    private List<String> genre;

    /** @return A new {@link Media} from the json stream. */
    public static Media fromJson(String json) {
        return fromJson(json, Media.class);
    }

    protected static <T extends Media> T fromJson(String json, Class<T> cls) {
        T result = null;

        result = new Gson().fromJson(json, cls);

        return result;
    }

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public int getMediaid() {
        return mediaid;
    }
    public void setMediaid(int mediaid) {
        this.mediaid = mediaid;
    }
    public String getLabel() {
        return label;
    }
    public void setLabel(String label) {
        this.label = label;
    }
    public String getFanart() {
        return fanart;
    }
    public void setFanart(String fanart) {
        this.fanart = fanart;
    }
    public String getThumbnail() {
        return thumbnail;
    }
    public void setThumbnail(String thumbnail) {
        this.thumbnail = thumbnail;
    }
    public int getPlaycount() {
        return playcount;
    }
    public void setPlaycount(int playcount) {
        this.playcount = playcount;
    }
    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public List<String> getDirector() {
        return director;
    }
    public void setDirector(List<String> director) {
        this.director = director;
    }
    public int getRuntime() {
        return runtime;
    }
    public void setRuntime(int runtime) {
        this.runtime = runtime;
    }
    public String getDateadded() {
        return dateadded;
    }
    public void setDateadded(String dateadded) {
        this.dateadded = dateadded;
    }
    public String getFile() {
        return file;
    }
    public void setFile(String file) {
        this.file = file;
    }
    public String getLastplayed() {
        return lastplayed;
    }
    public void setLastplayed(String lastplayed) {
        this.lastplayed = lastplayed;
    }
    public String getPlot() {
        return plot;
    }
    public void setPlot(String plot) {
        this.plot = plot;
    }
    public List<String> getCast() {
        return cast;
    }
    public void setCast(List<String> cast) {
        this.cast = cast;
    }
    public double getRating() {
        return rating;
    }
    public void setRating(double rating) {
        this.rating = rating;
    }
    public List<String> getWriter() {
        return writer;
    }
    public void setWriter(List<String> writer) {
        this.writer = writer;
    }
    public String getOriginaltitle() {
        return originaltitle;
    }
    public void setOriginaltitle(String originaltitle) {
        this.originaltitle = originaltitle;
    }
    public String getVotes() {
        return votes;
    }
    public void setVotes(String votes) {
        this.votes = votes;
    }

    public int getYear() {
        return year;
    }
    public void setYear(int year) {
        this.year = year;
    }
    public List<String> getGenre() {
        return genre;
    }
    public void setGenre(List<String> genre) {
        this.genre = genre;
    }

    /**
     * @return This {@link Media} serialized in json
     */
    public String toJson() {
        Gson gson = new Gson();
        return gson.toJson(this);
    }
}
